// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.railsinfra.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveParamsTest {

    @Test
    fun create() {
        AccountRetrieveParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xEnvironment(AccountRetrieveParams.XEnvironment.SANDBOX)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountRetrieveParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            AccountRetrieveParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xEnvironment(AccountRetrieveParams.XEnvironment.SANDBOX)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-Environment", "sandbox").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            AccountRetrieveParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
