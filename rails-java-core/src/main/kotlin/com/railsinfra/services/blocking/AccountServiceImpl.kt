// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

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
import com.railsinfra.core.http.json
import com.railsinfra.core.http.parseable
import com.railsinfra.core.prepare
import com.railsinfra.models.accounts.AccountCloseParams
import com.railsinfra.models.accounts.AccountCloseResponse
import com.railsinfra.models.accounts.AccountCreateParams
import com.railsinfra.models.accounts.AccountCreateResponse
import com.railsinfra.models.accounts.AccountDepositParams
import com.railsinfra.models.accounts.AccountDepositResponse
import com.railsinfra.models.accounts.AccountListParams
import com.railsinfra.models.accounts.AccountListResponse
import com.railsinfra.models.accounts.AccountRetrieveParams
import com.railsinfra.models.accounts.AccountRetrieveResponse
import com.railsinfra.models.accounts.AccountTransferParams
import com.railsinfra.models.accounts.AccountTransferResponse
import com.railsinfra.models.accounts.AccountUpdateStatusParams
import com.railsinfra.models.accounts.AccountUpdateStatusResponse
import com.railsinfra.models.accounts.AccountWithdrawParams
import com.railsinfra.models.accounts.AccountWithdrawResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Accounts */
class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): AccountCreateResponse =
        // post /api/v1/accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountRetrieveResponse =
        // get /api/v1/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): List<AccountListResponse> =
        // get /api/v1/accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions,
    ): AccountCloseResponse =
        // delete /api/v1/accounts/{id}
        withRawResponse().close(params, requestOptions).parse()

    override fun deposit(
        params: AccountDepositParams,
        requestOptions: RequestOptions,
    ): AccountDepositResponse =
        // post /api/v1/accounts/{id}/deposit
        withRawResponse().deposit(params, requestOptions).parse()

    override fun transfer(
        params: AccountTransferParams,
        requestOptions: RequestOptions,
    ): AccountTransferResponse =
        // post /api/v1/accounts/{id}/transfer
        withRawResponse().transfer(params, requestOptions).parse()

    override fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions,
    ): AccountUpdateStatusResponse =
        // patch /api/v1/accounts/{id}
        withRawResponse().updateStatus(params, requestOptions).parse()

    override fun withdraw(
        params: AccountWithdrawParams,
        requestOptions: RequestOptions,
    ): AccountWithdrawResponse =
        // post /api/v1/accounts/{id}/withdraw
        withRawResponse().withdraw(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AccountCreateResponse> =
            jsonHandler<AccountCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AccountRetrieveResponse> =
            jsonHandler<AccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<AccountListResponse>> =
            jsonHandler<List<AccountListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AccountListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val closeHandler: Handler<AccountCloseResponse> =
            jsonHandler<AccountCloseResponse>(clientOptions.jsonMapper)

        override fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCloseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { closeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val depositHandler: Handler<AccountDepositResponse> =
            jsonHandler<AccountDepositResponse>(clientOptions.jsonMapper)

        override fun deposit(
            params: AccountDepositParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountDepositResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "deposit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { depositHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferHandler: Handler<AccountTransferResponse> =
            jsonHandler<AccountTransferResponse>(clientOptions.jsonMapper)

        override fun transfer(
            params: AccountTransferParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "transfer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusHandler: Handler<AccountUpdateStatusResponse> =
            jsonHandler<AccountUpdateStatusResponse>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUpdateStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val withdrawHandler: Handler<AccountWithdrawResponse> =
            jsonHandler<AccountWithdrawResponse>(clientOptions.jsonMapper)

        override fun withdraw(
            params: AccountWithdrawParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountWithdrawResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "withdraw")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { withdrawHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
