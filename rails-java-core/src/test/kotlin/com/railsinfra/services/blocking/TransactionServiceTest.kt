// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

import com.railsinfra.client.okhttp.RailsOkHttpClient
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListParams
import com.railsinfra.models.transactions.TransactionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transaction =
            transactionService.retrieve(
                TransactionRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(TransactionRetrieveParams.XEnvironment.SANDBOX)
                    .build()
            )

        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
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
                    .xEnvironment(TransactionListParams.XEnvironment.SANDBOX)
                    .build()
            )

        transactions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByAccount() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transactions =
            transactionService.listByAccount(
                TransactionListByAccountParams.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .xEnvironment(TransactionListByAccountParams.XEnvironment.SANDBOX)
                    .build()
            )

        transactions.forEach { it.validate() }
    }
}
