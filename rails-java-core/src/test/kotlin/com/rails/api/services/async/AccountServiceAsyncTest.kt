// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.accounts.AccountCreateParams
import com.rails.api.models.accounts.AccountDepositParams
import com.rails.api.models.accounts.AccountListParams
import com.rails.api.models.accounts.AccountTransferParams
import com.rails.api.models.accounts.AccountUpdateStatusParams
import com.rails.api.models.accounts.AccountWithdrawParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .accountType(AccountCreateParams.AccountType.CHECKING)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .environment("environment")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture = accountServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountsFuture =
            accountServiceAsync.list(
                AccountListParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )

        val accounts = accountsFuture.get()
        accounts.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun close() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture = accountServiceAsync.close("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deposit() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.deposit(
                AccountDepositParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount("amount")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.transfer(
                AccountTransferParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount("amount")
                    .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStatus() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.updateStatus(
                AccountUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(AccountUpdateStatusParams.Status.ACTIVE)
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun withdraw() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.withdraw(
                AccountWithdrawParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount("amount")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
