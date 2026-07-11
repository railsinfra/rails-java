// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListResponseTest {

    @Test
    fun create() {
        val accountListResponse =
            AccountListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountListResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountListResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        assertThat(accountListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountListResponse.accountNumber()).isEqualTo("account_number")
        assertThat(accountListResponse.accountType())
            .isEqualTo(AccountListResponse.AccountType.CHECKING)
        assertThat(accountListResponse.balance()).isEqualTo("balance")
        assertThat(accountListResponse.currency()).isEqualTo("currency")
        assertThat(accountListResponse.environment()).isEqualTo("environment")
        assertThat(accountListResponse.status()).isEqualTo(AccountListResponse.Status.ACTIVE)
        assertThat(accountListResponse.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountListResponse.adminUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountListResponse.userRole()).contains("user_role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountListResponse =
            AccountListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountListResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountListResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        val roundtrippedAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountListResponse),
                jacksonTypeRef<AccountListResponse>(),
            )

        assertThat(roundtrippedAccountListResponse).isEqualTo(accountListResponse)
    }
}
