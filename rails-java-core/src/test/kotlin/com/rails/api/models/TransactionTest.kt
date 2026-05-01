// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionTest {

    @Test
    fun create() {
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(Transaction.Status.PENDING)
                .transactionType(Transaction.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transaction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.accountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.amount()).isEqualTo("amount")
        assertThat(transaction.balanceAfter()).isEqualTo("balance_after")
        assertThat(transaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.currency()).isEqualTo("currency")
        assertThat(transaction.status()).isEqualTo(Transaction.Status.PENDING)
        assertThat(transaction.transactionType()).isEqualTo(Transaction.TransactionType.DEPOSIT)
        assertThat(transaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.description()).contains("description")
        assertThat(transaction.externalRecipientId()).contains("external_recipient_id")
        assertThat(transaction.recipientAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.referenceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(Transaction.Status.PENDING)
                .transactionType(Transaction.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transaction),
                jacksonTypeRef<Transaction>(),
            )

        assertThat(roundtrippedTransaction).isEqualTo(transaction)
    }
}
