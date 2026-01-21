// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .accountType(AccountCreateParams.AccountType.CHECKING)
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency("currency")
            .environment("environment")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .accountType(AccountCreateParams.AccountType.CHECKING)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .environment("environment")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(AccountCreateParams.AccountType.CHECKING)
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).contains("currency")
        assertThat(body.environment()).contains("environment")
        assertThat(body.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCreateParams.builder()
                .accountType(AccountCreateParams.AccountType.CHECKING)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(AccountCreateParams.AccountType.CHECKING)
        assertThat(body.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
