// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListByAccountResponseTest {

    @Test
    fun create() {
        val transactionListByAccountResponse =
            TransactionListByAccountResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(TransactionListByAccountResponse.Status.PENDING)
                .transactionType(TransactionListByAccountResponse.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionListByAccountResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionListByAccountResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionListByAccountResponse.amount()).isEqualTo("amount")
        assertThat(transactionListByAccountResponse.balanceAfter()).isEqualTo("balance_after")
        assertThat(transactionListByAccountResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionListByAccountResponse.currency()).isEqualTo("currency")
        assertThat(transactionListByAccountResponse.status())
            .isEqualTo(TransactionListByAccountResponse.Status.PENDING)
        assertThat(transactionListByAccountResponse.transactionType())
            .isEqualTo(TransactionListByAccountResponse.TransactionType.DEPOSIT)
        assertThat(transactionListByAccountResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionListByAccountResponse.description()).contains("description")
        assertThat(transactionListByAccountResponse.externalRecipientId())
            .contains("external_recipient_id")
        assertThat(transactionListByAccountResponse.recipientAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionListByAccountResponse.referenceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListByAccountResponse =
            TransactionListByAccountResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(TransactionListByAccountResponse.Status.PENDING)
                .transactionType(TransactionListByAccountResponse.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionListByAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListByAccountResponse),
                jacksonTypeRef<TransactionListByAccountResponse>(),
            )

        assertThat(roundtrippedTransactionListByAccountResponse)
            .isEqualTo(transactionListByAccountResponse)
    }
}
