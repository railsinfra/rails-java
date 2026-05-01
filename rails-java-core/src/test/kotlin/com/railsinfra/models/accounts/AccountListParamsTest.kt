// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.railsinfra.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountListParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("user_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
    }
}
