// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.handlers.errorBodyHandler
import com.rails.api.core.handlers.errorHandler
import com.rails.api.core.handlers.jsonHandler
import com.rails.api.core.http.HttpMethod
import com.rails.api.core.http.HttpRequest
import com.rails.api.core.http.HttpResponse
import com.rails.api.core.http.HttpResponse.Handler
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.core.http.json
import com.rails.api.core.http.parseable
import com.rails.api.core.prepare
import com.rails.api.models.users.UserCreateParams
import com.rails.api.models.users.UserCreateResponse
import java.util.function.Consumer

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): UserCreateResponse =
        // post /api/v1/users
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserCreateResponse> =
            jsonHandler<UserCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "users")
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
    }
}
