// File generated from our OpenAPI spec by Stainless.

package com.rails.api.client

import com.rails.api.core.ClientOptions
import com.rails.api.core.getPackageVersion
import com.rails.api.services.async.PetServiceAsync
import com.rails.api.services.async.PetServiceAsyncImpl
import com.rails.api.services.async.StoreServiceAsync
import com.rails.api.services.async.StoreServiceAsyncImpl
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

    private val pet: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): RailsClient = sync

    override fun withRawResponse(): RailsClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RailsClientAsync =
        RailsClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pet(): PetServiceAsync = pet

    override fun store(): StoreServiceAsync = store

    override fun user(): UserServiceAsync = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClientAsync.WithRawResponse {

        private val pet: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RailsClientAsync.WithRawResponse =
            RailsClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pet(): PetServiceAsync.WithRawResponse = pet

        override fun store(): StoreServiceAsync.WithRawResponse = store

        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}
