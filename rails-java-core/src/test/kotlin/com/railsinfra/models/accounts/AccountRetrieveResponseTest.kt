// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveResponseTest {

    @Test
    fun create() {
        val accountRetrieveResponse =
            AccountRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountRetrieveResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountRetrieveResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        assertThat(accountRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountRetrieveResponse.accountNumber()).isEqualTo("account_number")
        assertThat(accountRetrieveResponse.accountType())
            .isEqualTo(AccountRetrieveResponse.AccountType.CHECKING)
        assertThat(accountRetrieveResponse.balance()).isEqualTo("balance")
        assertThat(accountRetrieveResponse.currency()).isEqualTo("currency")
        assertThat(accountRetrieveResponse.environment()).isEqualTo("environment")
        assertThat(accountRetrieveResponse.status())
            .isEqualTo(AccountRetrieveResponse.Status.ACTIVE)
        assertThat(accountRetrieveResponse.userId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountRetrieveResponse.adminUserId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountRetrieveResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountRetrieveResponse.userRole()).contains("user_role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountRetrieveResponse =
            AccountRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountType(AccountRetrieveResponse.AccountType.CHECKING)
                .balance("balance")
                .currency("currency")
                .environment("environment")
                .status(AccountRetrieveResponse.Status.ACTIVE)
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userRole("user_role")
                .build()

        val roundtrippedAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountRetrieveResponse),
                jacksonTypeRef<AccountRetrieveResponse>(),
            )

        assertThat(roundtrippedAccountRetrieveResponse).isEqualTo(accountRetrieveResponse)
    }
}
