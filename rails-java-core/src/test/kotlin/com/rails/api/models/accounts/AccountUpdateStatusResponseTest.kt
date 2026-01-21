// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateStatusResponseTest {

    @Test
    fun create() {
        val accountUpdateStatusResponse =
            AccountUpdateStatusResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountUpdateStatusResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountUpdateStatusResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        assertThat(accountUpdateStatusResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateStatusResponse.accountNumber()).isEqualTo("account_number")
        assertThat(accountUpdateStatusResponse.accountType())
            .isEqualTo(AccountUpdateStatusResponse.AccountType.CHECKING)
        assertThat(accountUpdateStatusResponse.balance()).isEqualTo("balance")
        assertThat(accountUpdateStatusResponse.currency()).isEqualTo("currency")
        assertThat(accountUpdateStatusResponse.environment()).isEqualTo("environment")
        assertThat(accountUpdateStatusResponse.status())
            .isEqualTo(AccountUpdateStatusResponse.Status.ACTIVE)
        assertThat(accountUpdateStatusResponse.userId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateStatusResponse.adminUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateStatusResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountUpdateStatusResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountUpdateStatusResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountUpdateStatusResponse.userRole()).contains("user_role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountUpdateStatusResponse =
            AccountUpdateStatusResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountUpdateStatusResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountUpdateStatusResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        val roundtrippedAccountUpdateStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountUpdateStatusResponse),
                jacksonTypeRef<AccountUpdateStatusResponse>(),
            )

        assertThat(roundtrippedAccountUpdateStatusResponse).isEqualTo(accountUpdateStatusResponse)
    }
}
