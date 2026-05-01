// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.client

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.getPackageVersion
import com.railsinfra.services.async.AccountServiceAsync
import com.railsinfra.services.async.AccountServiceAsyncImpl
import com.railsinfra.services.async.TransactionServiceAsync
import com.railsinfra.services.async.TransactionServiceAsyncImpl
import java.util.function.Consumer

class RailsClientAsyncImpl(private val clientOptions: ClientOptions) : RailsClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: RailsClient by lazy { RailsClientImpl(clientOptions) }

    private val withRawResponse: RailsClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): RailsClient = sync

    override fun withRawResponse(): RailsClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RailsClientAsync =
        RailsClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Accounts */
    override fun accounts(): AccountServiceAsync = accounts

    /** Transactions */
    override fun transactions(): TransactionServiceAsync = transactions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClientAsync.WithRawResponse {

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RailsClientAsync.WithRawResponse =
            RailsClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Accounts */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /** Transactions */
        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions
    }
}
