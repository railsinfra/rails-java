// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

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
import com.railsinfra.core.prepare
import com.railsinfra.models.auditevents.AuditEventListParams
import com.railsinfra.models.auditevents.AuditEventListResponse
import java.util.function.Consumer

/** Audit events */
class AuditEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditEventService {

    private val withRawResponse: AuditEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuditEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventService =
        AuditEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AuditEventListParams,
        requestOptions: RequestOptions,
    ): AuditEventListResponse =
        // get /api/v1/audit/events
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuditEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventService.WithRawResponse =
            AuditEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AuditEventListResponse> =
            jsonHandler<AuditEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuditEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuditEventListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "audit", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
