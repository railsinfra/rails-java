// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
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
import com.railsinfra.models.auditevents.AuditEventListParams
import com.railsinfra.models.auditevents.AuditEventListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Audit events */
class AuditEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditEventServiceAsync {

    private val withRawResponse: AuditEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuditEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventServiceAsync =
        AuditEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AuditEventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuditEventListResponse> =
        // get /api/v1/audit/events
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuditEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventServiceAsync.WithRawResponse =
            AuditEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AuditEventListResponse> =
            jsonHandler<AuditEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuditEventListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "audit", "events")
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
    }
}
