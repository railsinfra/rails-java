// File generated from our OpenAPI spec by Stainless.

package com.rails.api.client

import com.rails.api.core.ClientOptions
import com.rails.api.core.getPackageVersion
import com.rails.api.services.blocking.AccountService
import com.rails.api.services.blocking.AccountServiceImpl
import com.rails.api.services.blocking.TransactionService
import com.rails.api.services.blocking.TransactionServiceImpl
import com.rails.api.services.blocking.UserService
import com.rails.api.services.blocking.UserServiceImpl
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

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): RailsClientAsync = async

    override fun withRawResponse(): RailsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RailsClient =
        RailsClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    override fun accounts(): AccountService = accounts

    override fun transactions(): TransactionService = transactions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClient.WithRawResponse {

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

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

        override fun users(): UserService.WithRawResponse = users

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun transactions(): TransactionService.WithRawResponse = transactions
    }
}
