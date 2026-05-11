// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

import com.railsinfra.client.okhttp.RailsOkHttpClient
import com.railsinfra.models.users.UserCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
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
