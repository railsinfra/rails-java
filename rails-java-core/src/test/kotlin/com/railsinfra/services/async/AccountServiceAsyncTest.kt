// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.client.okhttp.RailsOkHttpClientAsync
import com.railsinfra.models.accounts.AccountCloseParams
import com.railsinfra.models.accounts.AccountCreateParams
import com.railsinfra.models.accounts.AccountDepositParams
import com.railsinfra.models.accounts.AccountListParams
import com.railsinfra.models.accounts.AccountRetrieveParams
import com.railsinfra.models.accounts.AccountTransferParams
import com.railsinfra.models.accounts.AccountUpdateStatusParams
import com.railsinfra.models.accounts.AccountWithdrawParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .xEnvironment(AccountCreateParams.XEnvironment.SANDBOX)
                    .accountType(AccountCreateParams.AccountType.CHECKING)
                    .currency("SEW")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .environment("environment")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.retrieve(
                AccountRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountRetrieveParams.XEnvironment.SANDBOX)
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountsFuture =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountListParams.XEnvironment.SANDBOX)
                    .build()
            )

        val accounts = accountsFuture.get()
        accounts.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun close() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.close(
                AccountCloseParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountCloseParams.XEnvironment.SANDBOX)
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deposit() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.deposit(
                AccountDepositParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountDepositParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun transfer() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.transfer(
                AccountTransferParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountTransferParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStatus() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.updateStatus(
                AccountUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountUpdateStatusParams.XEnvironment.SANDBOX)
                    .status(AccountUpdateStatusParams.Status.ACTIVE)
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun withdraw() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture =
            accountServiceAsync.withdraw(
                AccountWithdrawParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountWithdrawParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .description("description")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
