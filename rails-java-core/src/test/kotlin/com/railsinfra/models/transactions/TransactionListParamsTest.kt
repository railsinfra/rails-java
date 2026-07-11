// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.transactions

import com.railsinfra.core.http.Headers
import com.railsinfra.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListParamsTest {

    @Test
    fun create() {
        TransactionListParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(1L)
            .perPage(1L)
            .xEnvironment(TransactionListParams.XEnvironment.SANDBOX)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TransactionListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(1L)
                .perPage(1L)
                .xEnvironment(TransactionListParams.XEnvironment.SANDBOX)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-Environment", "sandbox").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TransactionListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            TransactionListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(1L)
                .perPage(1L)
                .xEnvironment(TransactionListParams.XEnvironment.SANDBOX)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page", "1")
                    .put("per_page", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TransactionListParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
