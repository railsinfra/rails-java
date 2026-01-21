// File generated from our OpenAPI spec by Stainless.

package com.rails.api.client

import com.rails.api.core.ClientOptions
import com.rails.api.core.getPackageVersion
import com.rails.api.services.blocking.PetService
import com.rails.api.services.blocking.PetServiceImpl
import com.rails.api.services.blocking.StoreService
import com.rails.api.services.blocking.StoreServiceImpl
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

    private val pet: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): RailsClientAsync = async

    override fun withRawResponse(): RailsClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RailsClient =
        RailsClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pet(): PetService = pet

    override fun store(): StoreService = store

    override fun user(): UserService = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RailsClient.WithRawResponse {

        private val pet: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RailsClient.WithRawResponse =
            RailsClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pet(): PetService.WithRawResponse = pet

        override fun store(): StoreService.WithRawResponse = store

        override fun user(): UserService.WithRawResponse = user
    }
}
