// File generated from our OpenAPI spec by Stainless.

package com.rails.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.client.okhttp.RailsOkHttpClient
import com.rails.api.core.jsonMapper
import com.rails.api.models.users.UserCreateResponse
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/rails-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.users()).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.transactions()).isNotNull()
    }

    @Test
    fun userCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val userCreateResponse =
            UserCreateResponse.builder()
                .status("status")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedUserCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userCreateResponse),
                jacksonTypeRef<UserCreateResponse>(),
            )

        assertThat(roundtrippedUserCreateResponse).isEqualTo(userCreateResponse)
    }
}
