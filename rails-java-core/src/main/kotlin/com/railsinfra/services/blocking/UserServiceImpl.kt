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
import com.railsinfra.core.http.json
import com.railsinfra.core.http.parseable
import com.railsinfra.core.prepare
import com.railsinfra.models.users.UserCreateParams
import com.railsinfra.models.users.UserCreateResponse
import java.util.function.Consumer

/** Users */
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
