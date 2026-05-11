// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
import com.railsinfra.core.http.HttpResponseFor
import com.railsinfra.models.auditevents.AuditEventListParams
import com.railsinfra.models.auditevents.AuditEventListResponse
import java.util.function.Consumer

/** Audit events */
interface AuditEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventService

    /** List audit events */
    fun list(): AuditEventListResponse = list(AuditEventListParams.none())

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEventListResponse

    /** @see list */
    fun list(params: AuditEventListParams = AuditEventListParams.none()): AuditEventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuditEventListResponse =
        list(AuditEventListParams.none(), requestOptions)

    /** A view of [AuditEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/audit/events`, but is otherwise the same as
         * [AuditEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuditEventListResponse> = list(AuditEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none()
        ): HttpResponseFor<AuditEventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuditEventListResponse> =
            list(AuditEventListParams.none(), requestOptions)
    }
}
