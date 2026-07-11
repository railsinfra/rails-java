// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .accountType(AccountCreateParams.AccountType.CHECKING)
            .currency("currency")
            .email("dev@stainless.com")
            .environment("environment")
            .firstName("first_name")
            .lastName("last_name")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .accountType(AccountCreateParams.AccountType.CHECKING)
                .currency("currency")
                .email("dev@stainless.com")
                .environment("environment")
                .firstName("first_name")
                .lastName("last_name")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(AccountCreateParams.AccountType.CHECKING)
        assertThat(body.currency()).contains("currency")
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.environment()).contains("environment")
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCreateParams.builder()
                .accountType(AccountCreateParams.AccountType.CHECKING)
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(AccountCreateParams.AccountType.CHECKING)
    }
}
