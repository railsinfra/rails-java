// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateStatusParamsTest {

    @Test
    fun create() {
        AccountUpdateStatusParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(AccountUpdateStatusParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountUpdateStatusParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountUpdateStatusParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(AccountUpdateStatusParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.status()).contains(AccountUpdateStatusParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountUpdateStatusParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
