// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.rails.api.client.okhttp.RailsOkHttpClient
import com.rails.api.models.users.UserCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user =
            userService.create(
                UserCreateParams.builder()
                    .xEnvironment(UserCreateParams.XEnvironment.SANDBOX)
                    .email("dev@stainless.com")
                    .firstName("first_name")
                    .lastName("last_name")
                    .password("password")
                    .build()
            )

        user.validate()
    }
}
