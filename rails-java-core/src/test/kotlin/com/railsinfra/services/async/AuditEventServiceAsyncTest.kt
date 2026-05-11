// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.client.okhttp.RailsOkHttpClientAsync
import com.railsinfra.models.auditevents.AuditEventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuditEventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val auditEventServiceAsync = client.auditEvents()

        val auditEventsFuture =
            auditEventServiceAsync.list(
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

        val auditEvents = auditEventsFuture.get()
        auditEvents.validate()
    }
}
