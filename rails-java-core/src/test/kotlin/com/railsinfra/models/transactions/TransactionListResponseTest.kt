// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListResponseTest {

    @Test
    fun create() {
        val transactionListResponse =
            TransactionListResponse.builder()
                .addData(
                    TransactionListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .fromAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(TransactionListResponse.Data.Status.PENDING)
                        .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionKind(TransactionListResponse.Data.TransactionKind.DEPOSIT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .environment("environment")
                        .failureReason("failure_reason")
                        .idempotencyKey("idempotency_key")
                        .build()
                )
                .pagination(
                    TransactionListResponse.Pagination.builder()
                        .page(1L)
                        .perPage(1L)
                        .totalCount(0L)
                        .totalPages(0L)
                        .build()
                )
                .build()

        assertThat(transactionListResponse.data())
            .containsExactly(
                TransactionListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .fromAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(TransactionListResponse.Data.Status.PENDING)
                    .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionKind(TransactionListResponse.Data.TransactionKind.DEPOSIT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .environment("environment")
                    .failureReason("failure_reason")
                    .idempotencyKey("idempotency_key")
                    .build()
            )
        assertThat(transactionListResponse.pagination())
            .isEqualTo(
                TransactionListResponse.Pagination.builder()
                    .page(1L)
                    .perPage(1L)
                    .totalCount(0L)
                    .totalPages(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListResponse =
            TransactionListResponse.builder()
                .addData(
                    TransactionListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .fromAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(TransactionListResponse.Data.Status.PENDING)
                        .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionKind(TransactionListResponse.Data.TransactionKind.DEPOSIT)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .environment("environment")
                        .failureReason("failure_reason")
                        .idempotencyKey("idempotency_key")
                        .build()
                )
                .pagination(
                    TransactionListResponse.Pagination.builder()
                        .page(1L)
                        .perPage(1L)
                        .totalCount(0L)
                        .totalPages(0L)
                        .build()
                )
                .build()

        val roundtrippedTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListResponse),
                jacksonTypeRef<TransactionListResponse>(),
            )

        assertThat(roundtrippedTransactionListResponse).isEqualTo(transactionListResponse)
    }
}
