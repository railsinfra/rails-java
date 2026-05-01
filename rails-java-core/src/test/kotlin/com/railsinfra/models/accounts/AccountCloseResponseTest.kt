// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCloseResponseTest {

    @Test
    fun create() {
        val accountCloseResponse =
            AccountCloseResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountCloseResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountCloseResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        assertThat(accountCloseResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCloseResponse.accountNumber()).isEqualTo("account_number")
        assertThat(accountCloseResponse.accountType())
            .isEqualTo(AccountCloseResponse.AccountType.CHECKING)
        assertThat(accountCloseResponse.balance()).isEqualTo("balance")
        assertThat(accountCloseResponse.currency()).isEqualTo("currency")
        assertThat(accountCloseResponse.environment()).isEqualTo("environment")
        assertThat(accountCloseResponse.status()).isEqualTo(AccountCloseResponse.Status.ACTIVE)
        assertThat(accountCloseResponse.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCloseResponse.adminUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCloseResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCloseResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCloseResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCloseResponse.userRole()).contains("user_role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountCloseResponse =
            AccountCloseResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountCloseResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountCloseResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        val roundtrippedAccountCloseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountCloseResponse),
                jacksonTypeRef<AccountCloseResponse>(),
            )

        assertThat(roundtrippedAccountCloseResponse).isEqualTo(accountCloseResponse)
    }
}
