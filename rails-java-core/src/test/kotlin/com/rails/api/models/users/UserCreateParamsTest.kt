// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.users

import com.rails.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .xEnvironment(UserCreateParams.XEnvironment.SANDBOX)
            .email("dev@stainless.com")
            .firstName("first_name")
            .lastName("last_name")
            .password("password")
            .build()
    }

    @Test
    fun headers() {
        val params =
            UserCreateParams.builder()
                .xEnvironment(UserCreateParams.XEnvironment.SANDBOX)
                .email("dev@stainless.com")
                .firstName("first_name")
                .lastName("last_name")
                .password("password")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-Environment", "sandbox").build())
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .xEnvironment(UserCreateParams.XEnvironment.SANDBOX)
                .email("dev@stainless.com")
                .firstName("first_name")
                .lastName("last_name")
                .password("password")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.lastName()).isEqualTo("last_name")
        assertThat(body.password()).isEqualTo("password")
    }
}
