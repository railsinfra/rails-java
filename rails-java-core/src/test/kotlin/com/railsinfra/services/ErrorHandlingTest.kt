// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.railsinfra.client.RailsClient
import com.railsinfra.client.okhttp.RailsOkHttpClient
import com.railsinfra.core.JsonValue
import com.railsinfra.core.http.Headers
import com.railsinfra.core.jsonMapper
import com.railsinfra.errors.BadRequestException
import com.railsinfra.errors.InternalServerException
import com.railsinfra.errors.NotFoundException
import com.railsinfra.errors.PermissionDeniedException
import com.railsinfra.errors.RailsException
import com.railsinfra.errors.RateLimitException
import com.railsinfra.errors.UnauthorizedException
import com.railsinfra.errors.UnexpectedStatusCodeException
import com.railsinfra.errors.UnprocessableEntityException
import com.railsinfra.models.accounts.AccountCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: RailsClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            RailsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun accountsCreate400() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate400WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate401() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate401WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate403() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate403WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate404() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate404WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate422() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate422WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate429() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate429WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate500() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate500WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate999() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreate999WithRawResponse() {
        val accountService = client.accounts().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun accountsCreateInvalidJsonBody() {
        val accountService = client.accounts()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<RailsException> {
                accountService.create(
                    AccountCreateParams.builder()
                        .accountType(AccountCreateParams.AccountType.CHECKING)
                        .currency("currency")
                        .email("dev@stainless.com")
                        .environment("environment")
                        .firstName("first_name")
                        .lastName("last_name")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
