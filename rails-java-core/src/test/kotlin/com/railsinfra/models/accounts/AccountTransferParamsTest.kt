// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.railsinfra.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTransferParamsTest {

    @Test
    fun create() {
        AccountTransferParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xEnvironment(AccountTransferParams.XEnvironment.SANDBOX)
            .amount("amount")
            .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountTransferParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            AccountTransferParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xEnvironment(AccountTransferParams.XEnvironment.SANDBOX)
                .amount("amount")
                .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-Environment", "sandbox").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            AccountTransferParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AccountTransferParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xEnvironment(AccountTransferParams.XEnvironment.SANDBOX)
                .amount("amount")
                .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.toAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountTransferParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.toAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
