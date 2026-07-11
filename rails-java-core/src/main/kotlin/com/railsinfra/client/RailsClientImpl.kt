// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.client

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.getPackageVersion
import com.railsinfra.services.blocking.AccountService
import com.railsinfra.services.blocking.AccountServiceImpl
import com.railsinfra.services.blocking.TransactionService
import com.railsinfra.services.blocking.TransactionServiceImpl
import java.util.function.Consumer

class RailsClientImpl(private val clientOptions: ClientOptions) : RailsClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: RailsClientAsync by lazy { RailsClientAsyncImpl(clientOptions) }

    private val withRawResponse: RailsClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): RailsClientAsync = async

    override fun withRawResponse(): RailsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RailsClient =
        RailsClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Accounts */
    override fun accounts(): AccountService = accounts

    /** Transactions */
    override fun transactions(): TransactionService = transactions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClient.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RailsClient.WithRawResponse =
            RailsClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Accounts */
        override fun accounts(): AccountService.WithRawResponse = accounts

        /** Transactions */
        override fun transactions(): TransactionService.WithRawResponse = transactions
    }
}
