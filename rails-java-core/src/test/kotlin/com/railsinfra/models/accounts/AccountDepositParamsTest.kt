// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDepositParamsTest {

    @Test
    fun create() {
        AccountDepositParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount("amount")
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountDepositParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountDepositParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountDepositParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
    }
}
