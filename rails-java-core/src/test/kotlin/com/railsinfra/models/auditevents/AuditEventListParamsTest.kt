// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.auditevents

import com.railsinfra.core.http.Headers
import com.railsinfra.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListParamsTest {

    @Test
    fun create() {
        AuditEventListParams.builder()
            .action("action")
            .environment(AuditEventListParams.Environment.SANDBOX)
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .outcome(AuditEventListParams.Outcome.SUCCESS)
            .page(1L)
            .perPage(1L)
            .targetId("target_id")
            .targetType("target_type")
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .xEnvironment(AuditEventListParams.XEnvironment.SANDBOX)
            .build()
    }

    @Test
    fun headers() {
        val params =
            AuditEventListParams.builder()
                .action("action")
                .environment(AuditEventListParams.Environment.SANDBOX)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outcome(AuditEventListParams.Outcome.SUCCESS)
                .page(1L)
                .perPage(1L)
                .targetId("target_id")
                .targetType("target_type")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .xEnvironment(AuditEventListParams.XEnvironment.SANDBOX)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("X-Environment", "sandbox").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = AuditEventListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            AuditEventListParams.builder()
                .action("action")
                .environment(AuditEventListParams.Environment.SANDBOX)
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .outcome(AuditEventListParams.Outcome.SUCCESS)
                .page(1L)
                .perPage(1L)
                .targetId("target_id")
                .targetType("target_type")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .xEnvironment(AuditEventListParams.XEnvironment.SANDBOX)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("action", "action")
                    .put("environment", "sandbox")
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("outcome", "success")
                    .put("page", "1")
                    .put("per_page", "1")
                    .put("target_id", "target_id")
                    .put("target_type", "target_type")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuditEventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
