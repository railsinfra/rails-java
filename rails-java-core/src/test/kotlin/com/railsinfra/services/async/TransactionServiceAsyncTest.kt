// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.client.okhttp.RailsOkHttpClientAsync
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByAccount() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val responseFuture =
            transactionServiceAsync.listByAccount(
                TransactionListByAccountParams.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
