// File generated from our OpenAPI spec by Stainless.

package com.rails.api.client

import com.rails.api.core.ClientOptions
import com.rails.api.core.getPackageVersion
import com.rails.api.services.async.AccountServiceAsync
import com.rails.api.services.async.AccountServiceAsyncImpl
import com.rails.api.services.async.TransactionServiceAsync
import com.rails.api.services.async.TransactionServiceAsyncImpl
import com.rails.api.services.async.UserServiceAsync
import com.rails.api.services.async.UserServiceAsyncImpl
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

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

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

    /** Users */
    override fun users(): UserServiceAsync = users

    /** Accounts */
    override fun accounts(): AccountServiceAsync = accounts

    /** Transactions */
    override fun transactions(): TransactionServiceAsync = transactions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClientAsync.WithRawResponse {

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

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

        /** Users */
        override fun users(): UserServiceAsync.WithRawResponse = users

        /** Accounts */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /** Transactions */
        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions
    }
}
