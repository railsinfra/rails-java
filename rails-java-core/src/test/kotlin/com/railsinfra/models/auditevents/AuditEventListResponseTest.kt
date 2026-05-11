// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.auditevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.railsinfra.core.JsonValue
import com.railsinfra.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListResponseTest {

    @Test
    fun create() {
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .addData(
                    AuditEventListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .action(AuditEventListResponse.Data.Action.USERS_BUSINESS_REGISTER)
                        .actor(
                            AuditEventListResponse.Data.Actor.builder()
                                .id("id")
                                .type(AuditEventListResponse.Data.Actor.Type.USER)
                                .addRole("string")
                                .build()
                        )
                        .correlationId("correlation_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .environment(AuditEventListResponse.Data.Environment.SANDBOX)
                        .metadata(
                            AuditEventListResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .outcome(AuditEventListResponse.Data.Outcome.SUCCESS)
                        .request(
                            AuditEventListResponse.Data.Request.builder()
                                .id("id")
                                .method("method")
                                .path("path")
                                .ip("ip")
                                .userAgent("user_agent")
                                .build()
                        )
                        .schemaVersion(AuditEventListResponse.Data.SchemaVersion._1)
                        .sourceService(AuditEventListResponse.Data.SourceService.USERS)
                        .target(
                            AuditEventListResponse.Data.Target.builder()
                                .id("id")
                                .type("type")
                                .build()
                        )
                        .reason("reason")
                        .build()
                )
                .pagination(
                    AuditEventListResponse.Pagination.builder()
                        .page(1L)
                        .perPage(1L)
                        .totalCount(0L)
                        .totalPages(0L)
                        .build()
                )
                .build()

        assertThat(auditEventListResponse.data())
            .containsExactly(
                AuditEventListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .action(AuditEventListResponse.Data.Action.USERS_BUSINESS_REGISTER)
                    .actor(
                        AuditEventListResponse.Data.Actor.builder()
                            .id("id")
                            .type(AuditEventListResponse.Data.Actor.Type.USER)
                            .addRole("string")
                            .build()
                    )
                    .correlationId("correlation_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .environment(AuditEventListResponse.Data.Environment.SANDBOX)
                    .metadata(
                        AuditEventListResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .outcome(AuditEventListResponse.Data.Outcome.SUCCESS)
                    .request(
                        AuditEventListResponse.Data.Request.builder()
                            .id("id")
                            .method("method")
                            .path("path")
                            .ip("ip")
                            .userAgent("user_agent")
                            .build()
                    )
                    .schemaVersion(AuditEventListResponse.Data.SchemaVersion._1)
                    .sourceService(AuditEventListResponse.Data.SourceService.USERS)
                    .target(
                        AuditEventListResponse.Data.Target.builder().id("id").type("type").build()
                    )
                    .reason("reason")
                    .build()
            )
        assertThat(auditEventListResponse.pagination())
            .isEqualTo(
                AuditEventListResponse.Pagination.builder()
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
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .addData(
                    AuditEventListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .action(AuditEventListResponse.Data.Action.USERS_BUSINESS_REGISTER)
                        .actor(
                            AuditEventListResponse.Data.Actor.builder()
                                .id("id")
                                .type(AuditEventListResponse.Data.Actor.Type.USER)
                                .addRole("string")
                                .build()
                        )
                        .correlationId("correlation_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .environment(AuditEventListResponse.Data.Environment.SANDBOX)
                        .metadata(
                            AuditEventListResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .outcome(AuditEventListResponse.Data.Outcome.SUCCESS)
                        .request(
                            AuditEventListResponse.Data.Request.builder()
                                .id("id")
                                .method("method")
                                .path("path")
                                .ip("ip")
                                .userAgent("user_agent")
                                .build()
                        )
                        .schemaVersion(AuditEventListResponse.Data.SchemaVersion._1)
                        .sourceService(AuditEventListResponse.Data.SourceService.USERS)
                        .target(
                            AuditEventListResponse.Data.Target.builder()
                                .id("id")
                                .type("type")
                                .build()
                        )
                        .reason("reason")
                        .build()
                )
                .pagination(
                    AuditEventListResponse.Pagination.builder()
                        .page(1L)
                        .perPage(1L)
                        .totalCount(0L)
                        .totalPages(0L)
                        .build()
                )
                .build()

        val roundtrippedAuditEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEventListResponse),
                jacksonTypeRef<AuditEventListResponse>(),
            )

        assertThat(roundtrippedAuditEventListResponse).isEqualTo(auditEventListResponse)
    }
}
