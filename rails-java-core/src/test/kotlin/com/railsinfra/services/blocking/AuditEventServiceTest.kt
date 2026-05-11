// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

import com.railsinfra.client.okhttp.RailsOkHttpClient
import com.railsinfra.models.auditevents.AuditEventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuditEventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClient.builder().apiKey("My API Key").build()
        val auditEventService = client.auditEvents()

        val auditEvents =
            auditEventService.list(
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
                    .build()
            )

        auditEvents.validate()
    }
}
