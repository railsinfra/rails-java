// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.rails.api.client.okhttp.RailsOkHttpClient
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transaction = transactionService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        transaction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transactions =
            transactionService.list(
                TransactionListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        transactions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listByAccount() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transactions =
            transactionService.listByAccount(
                TransactionListByAccountParams.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .build()
            )

        transactions.forEach { it.validate() }
    }
}
