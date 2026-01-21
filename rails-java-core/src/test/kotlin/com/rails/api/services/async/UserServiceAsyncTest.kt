// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.TestServerExtension
import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.user.User
import com.rails.api.models.user.UserCreateWithListParams
import com.rails.api.models.user.UserLoginParams
import com.rails.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture =
            userServiceAsync.create(
                User.builder()
                    .id(10L)
                    .email("john@email.com")
                    .firstName("John")
                    .lastName("James")
                    .password("12345")
                    .phone("12345")
                    .username("theUser")
                    .userStatus(1)
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture = userServiceAsync.retrieve("username")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .existingUsername("username")
                    .user(
                        User.builder()
                            .id(10L)
                            .email("john@email.com")
                            .firstName("John")
                            .lastName("James")
                            .password("12345")
                            .phone("12345")
                            .username("theUser")
                            .userStatus(1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future = userServiceAsync.delete("username")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createWithList() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture =
            userServiceAsync.createWithList(
                UserCreateWithListParams.builder()
                    .addBody(
                        User.builder()
                            .id(10L)
                            .email("john@email.com")
                            .firstName("John")
                            .lastName("James")
                            .password("12345")
                            .phone("12345")
                            .username("theUser")
                            .userStatus(1)
                            .build()
                    )
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun login() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val responseFuture =
            userServiceAsync.login(
                UserLoginParams.builder().password("password").username("username").build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun logout() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future = userServiceAsync.logout()

        val response = future.get()
    }
}
