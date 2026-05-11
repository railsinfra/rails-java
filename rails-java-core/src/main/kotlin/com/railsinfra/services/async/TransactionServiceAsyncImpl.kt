// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
import com.railsinfra.core.checkRequired
import com.railsinfra.core.handlers.errorBodyHandler
import com.railsinfra.core.handlers.errorHandler
import com.railsinfra.core.handlers.jsonHandler
import com.railsinfra.core.http.HttpMethod
import com.railsinfra.core.http.HttpRequest
import com.railsinfra.core.http.HttpResponse
import com.railsinfra.core.http.HttpResponse.Handler
import com.railsinfra.core.http.HttpResponseFor
import com.railsinfra.core.http.parseable
import com.railsinfra.core.prepareAsync
import com.railsinfra.models.Transaction
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListParams
import com.railsinfra.models.transactions.TransactionListResponse
import com.railsinfra.models.transactions.TransactionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Transactions */
class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync =
        TransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Transaction> =
        // get /api/v1/transactions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionListResponse> =
        // get /api/v1/transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Transaction>> =
        // get /api/v1/accounts/{account_id}/transactions
        withRawResponse().listByAccount(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionServiceAsync.WithRawResponse =
            TransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "transactions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TransactionListResponse> =
            jsonHandler<TransactionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listByAccountHandler: Handler<List<Transaction>> =
            jsonHandler<List<Transaction>>(clientOptions.jsonMapper)

        override fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByAccountHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
