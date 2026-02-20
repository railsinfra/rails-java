// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionsFuture =
            transactionServiceAsync.list(
                TransactionListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val transactions = transactionsFuture.get()
        transactions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listByAccount() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionsFuture =
            transactionServiceAsync.listByAccount(
                TransactionListByAccountParams.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .build()
            )

        val transactions = transactionsFuture.get()
        transactions.forEach { it.validate() }
    }
}
