// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionRetrieveResponseTest {

    @Test
    fun create() {
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(TransactionRetrieveResponse.Status.PENDING)
                .transactionType(TransactionRetrieveResponse.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(transactionRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionRetrieveResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionRetrieveResponse.amount()).isEqualTo("amount")
        assertThat(transactionRetrieveResponse.balanceAfter()).isEqualTo("balance_after")
        assertThat(transactionRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionRetrieveResponse.currency()).isEqualTo("currency")
        assertThat(transactionRetrieveResponse.status())
            .isEqualTo(TransactionRetrieveResponse.Status.PENDING)
        assertThat(transactionRetrieveResponse.transactionType())
            .isEqualTo(TransactionRetrieveResponse.TransactionType.DEPOSIT)
        assertThat(transactionRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionRetrieveResponse.description()).contains("description")
        assertThat(transactionRetrieveResponse.externalRecipientId())
            .contains("external_recipient_id")
        assertThat(transactionRetrieveResponse.recipientAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionRetrieveResponse.referenceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount("amount")
                .balanceAfter("balance_after")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .status(TransactionRetrieveResponse.Status.PENDING)
                .transactionType(TransactionRetrieveResponse.TransactionType.DEPOSIT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .externalRecipientId("external_recipient_id")
                .recipientAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .referenceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTransactionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionRetrieveResponse),
                jacksonTypeRef<TransactionRetrieveResponse>(),
            )

        assertThat(roundtrippedTransactionRetrieveResponse).isEqualTo(transactionRetrieveResponse)
    }
}
