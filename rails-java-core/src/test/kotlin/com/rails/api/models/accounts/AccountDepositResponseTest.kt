// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDepositResponseTest {

    @Test
    fun create() {
        val accountDepositResponse =
            AccountDepositResponse.builder()
                .account(
                    AccountDepositResponse.Account.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountNumber("account_number")
                        .accountType(AccountDepositResponse.Account.AccountType.CHECKING)
                        .balance("balance")
                        .currency("currency")
                        .environment("environment")
                        .status(AccountDepositResponse.Account.Status.ACTIVE)
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userRole("user_role")
                        .build()
                )
                .transaction(
                    AccountDepositResponse.Transaction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount("amount")
                        .balanceAfter("balance_after")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .status(AccountDepositResponse.Transaction.Status.PENDING)
                        .transactionType(AccountDepositResponse.Transaction.TransactionType.DEPOSIT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .externalRecipientId("external_recipient_id")
                        .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(accountDepositResponse.account())
            .isEqualTo(
                AccountDepositResponse.Account.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountNumber("account_number")
                    .accountType(AccountDepositResponse.Account.AccountType.CHECKING)
                    .balance("balance")
                    .currency("currency")
                    .environment("environment")
                    .status(AccountDepositResponse.Account.Status.ACTIVE)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userRole("user_role")
                    .build()
            )
        assertThat(accountDepositResponse.transaction())
            .isEqualTo(
                AccountDepositResponse.Transaction.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount("amount")
                    .balanceAfter("balance_after")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .status(AccountDepositResponse.Transaction.Status.PENDING)
                    .transactionType(AccountDepositResponse.Transaction.TransactionType.DEPOSIT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .externalRecipientId("external_recipient_id")
                    .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountDepositResponse =
            AccountDepositResponse.builder()
                .account(
                    AccountDepositResponse.Account.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountNumber("account_number")
                        .accountType(AccountDepositResponse.Account.AccountType.CHECKING)
                        .balance("balance")
                        .currency("currency")
                        .environment("environment")
                        .status(AccountDepositResponse.Account.Status.ACTIVE)
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .adminUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userRole("user_role")
                        .build()
                )
                .transaction(
                    AccountDepositResponse.Transaction.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount("amount")
                        .balanceAfter("balance_after")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .status(AccountDepositResponse.Transaction.Status.PENDING)
                        .transactionType(AccountDepositResponse.Transaction.TransactionType.DEPOSIT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .externalRecipientId("external_recipient_id")
                        .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAccountDepositResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountDepositResponse),
                jacksonTypeRef<AccountDepositResponse>(),
            )

        assertThat(roundtrippedAccountDepositResponse).isEqualTo(accountDepositResponse)
    }
}
