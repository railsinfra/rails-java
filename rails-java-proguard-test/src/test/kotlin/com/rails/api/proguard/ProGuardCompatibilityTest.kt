// File generated from our OpenAPI spec by Stainless.

package com.rails.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.client.okhttp.RailsOkHttpClient
import com.rails.api.core.jsonMapper
import com.rails.api.models.pet.Pet
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
        assertThat(client.pet()).isNotNull()
        assertThat(client.store()).isNotNull()
        assertThat(client.user()).isNotNull()
    }

    @Test
    fun petRoundtrip() {
        val jsonMapper = jsonMapper()
        val pet =
            Pet.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .category(Pet.Category.builder().id(1L).name("Dogs").build())
                .status(Pet.Status.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .build()

        val roundtrippedPet =
            jsonMapper.readValue(jsonMapper.writeValueAsString(pet), jacksonTypeRef<Pet>())

        assertThat(roundtrippedPet).isEqualTo(pet)
    }
}
