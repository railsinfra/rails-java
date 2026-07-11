// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.auditevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.railsinfra.core.Enum
import com.railsinfra.core.ExcludeMissing
import com.railsinfra.core.JsonField
import com.railsinfra.core.JsonMissing
import com.railsinfra.core.JsonValue
import com.railsinfra.core.checkKnown
import com.railsinfra.core.checkRequired
import com.railsinfra.core.toImmutable
import com.railsinfra.errors.RailsInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuditEventListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val pagination: JsonField<Pagination>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
    ) : this(data, pagination, mutableMapOf())

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pagination(): Pagination = pagination.getRequired("pagination")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuditEventListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var pagination: JsonField<Pagination>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditEventListResponse: AuditEventListResponse) = apply {
            data = auditEventListResponse.data.map { it.toMutableList() }
            pagination = auditEventListResponse.pagination
            additionalProperties = auditEventListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun pagination(pagination: Pagination) = pagination(JsonField.of(pagination))

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AuditEventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .pagination()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuditEventListResponse =
            AuditEventListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("pagination", pagination),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws RailsInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): AuditEventListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        pagination().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: RailsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val action: JsonField<Action>,
        private val actor: JsonField<Actor>,
        private val correlationId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val environment: JsonField<Environment>,
        private val metadata: JsonField<Metadata>,
        private val occurredAt: JsonField<OffsetDateTime>,
        private val organizationId: JsonField<String>,
        private val outcome: JsonField<Outcome>,
        private val request: JsonField<Request>,
        private val schemaVersion: JsonField<SchemaVersion>,
        private val sourceService: JsonField<SourceService>,
        private val target: JsonField<Target>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("actor") @ExcludeMissing actor: JsonField<Actor> = JsonMissing.of(),
            @JsonProperty("correlation_id")
            @ExcludeMissing
            correlationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<Environment> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("occurred_at")
            @ExcludeMissing
            occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
            @JsonProperty("request") @ExcludeMissing request: JsonField<Request> = JsonMissing.of(),
            @JsonProperty("schema_version")
            @ExcludeMissing
            schemaVersion: JsonField<SchemaVersion> = JsonMissing.of(),
            @JsonProperty("source_service")
            @ExcludeMissing
            sourceService: JsonField<SourceService> = JsonMissing.of(),
            @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            action,
            actor,
            correlationId,
            createdAt,
            environment,
            metadata,
            occurredAt,
            organizationId,
            outcome,
            request,
            schemaVersion,
            sourceService,
            target,
            reason,
            mutableMapOf(),
        )

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actor(): Actor = actor.getRequired("actor")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun correlationId(): String = correlationId.getRequired("correlation_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun environment(): Environment = environment.getRequired("environment")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurred_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationId(): String = organizationId.getRequired("organization_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outcome(): Outcome = outcome.getRequired("outcome")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun request(): Request = request.getRequired("request")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schemaVersion(): SchemaVersion = schemaVersion.getRequired("schema_version")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceService(): SourceService = sourceService.getRequired("source_service")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun target(): Target = target.getRequired("target")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): Optional<String> = reason.getOptional("reason")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [actor].
         *
         * Unlike [actor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor") @ExcludeMissing fun _actor(): JsonField<Actor> = actor

        /**
         * Returns the raw JSON value of [correlationId].
         *
         * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun _correlationId(): JsonField<String> = correlationId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<Environment> = environment

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [occurredAt].
         *
         * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("occurred_at")
        @ExcludeMissing
        fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

        /**
         * Returns the raw JSON value of [organizationId].
         *
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

        /**
         * Returns the raw JSON value of [outcome].
         *
         * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

        /**
         * Returns the raw JSON value of [request].
         *
         * Unlike [request], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request") @ExcludeMissing fun _request(): JsonField<Request> = request

        /**
         * Returns the raw JSON value of [schemaVersion].
         *
         * Unlike [schemaVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("schema_version")
        @ExcludeMissing
        fun _schemaVersion(): JsonField<SchemaVersion> = schemaVersion

        /**
         * Returns the raw JSON value of [sourceService].
         *
         * Unlike [sourceService], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_service")
        @ExcludeMissing
        fun _sourceService(): JsonField<SourceService> = sourceService

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .action()
             * .actor()
             * .correlationId()
             * .createdAt()
             * .environment()
             * .metadata()
             * .occurredAt()
             * .organizationId()
             * .outcome()
             * .request()
             * .schemaVersion()
             * .sourceService()
             * .target()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var action: JsonField<Action>? = null
            private var actor: JsonField<Actor>? = null
            private var correlationId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var environment: JsonField<Environment>? = null
            private var metadata: JsonField<Metadata>? = null
            private var occurredAt: JsonField<OffsetDateTime>? = null
            private var organizationId: JsonField<String>? = null
            private var outcome: JsonField<Outcome>? = null
            private var request: JsonField<Request>? = null
            private var schemaVersion: JsonField<SchemaVersion>? = null
            private var sourceService: JsonField<SourceService>? = null
            private var target: JsonField<Target>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                action = data.action
                actor = data.actor
                correlationId = data.correlationId
                createdAt = data.createdAt
                environment = data.environment
                metadata = data.metadata
                occurredAt = data.occurredAt
                organizationId = data.organizationId
                outcome = data.outcome
                request = data.request
                schemaVersion = data.schemaVersion
                sourceService = data.sourceService
                target = data.target
                reason = data.reason
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            fun actor(actor: Actor) = actor(JsonField.of(actor))

            /**
             * Sets [Builder.actor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actor] with a well-typed [Actor] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun actor(actor: JsonField<Actor>) = apply { this.actor = actor }

            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            /**
             * Sets [Builder.correlationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correlationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun environment(environment: Environment) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [Environment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<Environment>) = apply {
                this.environment = environment
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

            /**
             * Sets [Builder.occurredAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
                this.occurredAt = occurredAt
            }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            /**
             * Sets [Builder.organizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
            }

            fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

            /**
             * Sets [Builder.outcome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

            fun request(request: Request) = request(JsonField.of(request))

            /**
             * Sets [Builder.request] to an arbitrary JSON value.
             *
             * You should usually call [Builder.request] with a well-typed [Request] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun request(request: JsonField<Request>) = apply { this.request = request }

            fun schemaVersion(schemaVersion: SchemaVersion) =
                schemaVersion(JsonField.of(schemaVersion))

            /**
             * Sets [Builder.schemaVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schemaVersion] with a well-typed [SchemaVersion]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun schemaVersion(schemaVersion: JsonField<SchemaVersion>) = apply {
                this.schemaVersion = schemaVersion
            }

            fun sourceService(sourceService: SourceService) =
                sourceService(JsonField.of(sourceService))

            /**
             * Sets [Builder.sourceService] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceService] with a well-typed [SourceService]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceService(sourceService: JsonField<SourceService>) = apply {
                this.sourceService = sourceService
            }

            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Target] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
            fun reason(reason: Optional<String>) = reason(reason.getOrNull())

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .action()
             * .actor()
             * .correlationId()
             * .createdAt()
             * .environment()
             * .metadata()
             * .occurredAt()
             * .organizationId()
             * .outcome()
             * .request()
             * .schemaVersion()
             * .sourceService()
             * .target()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("action", action),
                    checkRequired("actor", actor),
                    checkRequired("correlationId", correlationId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("environment", environment),
                    checkRequired("metadata", metadata),
                    checkRequired("occurredAt", occurredAt),
                    checkRequired("organizationId", organizationId),
                    checkRequired("outcome", outcome),
                    checkRequired("request", request),
                    checkRequired("schemaVersion", schemaVersion),
                    checkRequired("sourceService", sourceService),
                    checkRequired("target", target),
                    reason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RailsInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            action().validate()
            actor().validate()
            correlationId()
            createdAt()
            environment().validate()
            metadata().validate()
            occurredAt()
            organizationId()
            outcome().validate()
            request().validate()
            schemaVersion().validate()
            sourceService().validate()
            target().validate()
            reason()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RailsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (action.asKnown().getOrNull()?.validity() ?: 0) +
                (actor.asKnown().getOrNull()?.validity() ?: 0) +
                (if (correlationId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (environment.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (occurredAt.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0) +
                (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                (request.asKnown().getOrNull()?.validity() ?: 0) +
                (schemaVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (sourceService.asKnown().getOrNull()?.validity() ?: 0) +
                (target.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reason.asKnown().isPresent) 1 else 0)

        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val USERS_BUSINESS_REGISTER = of("users.business.register")

                @JvmField val USERS_AUTH_LOGIN = of("users.auth.login")

                @JvmField val USERS_AUTH_REFRESH = of("users.auth.refresh")

                @JvmField val USERS_AUTH_REVOKE = of("users.auth.revoke")

                @JvmField val USERS_PASSWORD_RESET_REQUEST = of("users.password_reset.request")

                @JvmField val USERS_PASSWORD_RESET_COMPLETE = of("users.password_reset.complete")

                @JvmField val USERS_BETA_APPLY = of("users.beta.apply")

                @JvmField val USERS_API_KEY_CREATE = of("users.api_key.create")

                @JvmField val USERS_API_KEY_REVOKE = of("users.api_key.revoke")

                @JvmField val ACCOUNTS_ACCOUNT_CREATE = of("accounts.account.create")

                @JvmField val ACCOUNTS_ACCOUNT_UPDATE_STATUS = of("accounts.account.update_status")

                @JvmField val ACCOUNTS_ACCOUNT_CLOSE = of("accounts.account.close")

                @JvmField val ACCOUNTS_MONEY_DEPOSIT = of("accounts.money.deposit")

                @JvmField val ACCOUNTS_MONEY_WITHDRAW = of("accounts.money.withdraw")

                @JvmField val ACCOUNTS_MONEY_TRANSFER = of("accounts.money.transfer")

                @JvmField val LEDGER_TRANSACTION_POST = of("ledger.transaction.post")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                USERS_BUSINESS_REGISTER,
                USERS_AUTH_LOGIN,
                USERS_AUTH_REFRESH,
                USERS_AUTH_REVOKE,
                USERS_PASSWORD_RESET_REQUEST,
                USERS_PASSWORD_RESET_COMPLETE,
                USERS_BETA_APPLY,
                USERS_API_KEY_CREATE,
                USERS_API_KEY_REVOKE,
                ACCOUNTS_ACCOUNT_CREATE,
                ACCOUNTS_ACCOUNT_UPDATE_STATUS,
                ACCOUNTS_ACCOUNT_CLOSE,
                ACCOUNTS_MONEY_DEPOSIT,
                ACCOUNTS_MONEY_WITHDRAW,
                ACCOUNTS_MONEY_TRANSFER,
                LEDGER_TRANSACTION_POST,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USERS_BUSINESS_REGISTER,
                USERS_AUTH_LOGIN,
                USERS_AUTH_REFRESH,
                USERS_AUTH_REVOKE,
                USERS_PASSWORD_RESET_REQUEST,
                USERS_PASSWORD_RESET_COMPLETE,
                USERS_BETA_APPLY,
                USERS_API_KEY_CREATE,
                USERS_API_KEY_REVOKE,
                ACCOUNTS_ACCOUNT_CREATE,
                ACCOUNTS_ACCOUNT_UPDATE_STATUS,
                ACCOUNTS_ACCOUNT_CLOSE,
                ACCOUNTS_MONEY_DEPOSIT,
                ACCOUNTS_MONEY_WITHDRAW,
                ACCOUNTS_MONEY_TRANSFER,
                LEDGER_TRANSACTION_POST,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    USERS_BUSINESS_REGISTER -> Value.USERS_BUSINESS_REGISTER
                    USERS_AUTH_LOGIN -> Value.USERS_AUTH_LOGIN
                    USERS_AUTH_REFRESH -> Value.USERS_AUTH_REFRESH
                    USERS_AUTH_REVOKE -> Value.USERS_AUTH_REVOKE
                    USERS_PASSWORD_RESET_REQUEST -> Value.USERS_PASSWORD_RESET_REQUEST
                    USERS_PASSWORD_RESET_COMPLETE -> Value.USERS_PASSWORD_RESET_COMPLETE
                    USERS_BETA_APPLY -> Value.USERS_BETA_APPLY
                    USERS_API_KEY_CREATE -> Value.USERS_API_KEY_CREATE
                    USERS_API_KEY_REVOKE -> Value.USERS_API_KEY_REVOKE
                    ACCOUNTS_ACCOUNT_CREATE -> Value.ACCOUNTS_ACCOUNT_CREATE
                    ACCOUNTS_ACCOUNT_UPDATE_STATUS -> Value.ACCOUNTS_ACCOUNT_UPDATE_STATUS
                    ACCOUNTS_ACCOUNT_CLOSE -> Value.ACCOUNTS_ACCOUNT_CLOSE
                    ACCOUNTS_MONEY_DEPOSIT -> Value.ACCOUNTS_MONEY_DEPOSIT
                    ACCOUNTS_MONEY_WITHDRAW -> Value.ACCOUNTS_MONEY_WITHDRAW
                    ACCOUNTS_MONEY_TRANSFER -> Value.ACCOUNTS_MONEY_TRANSFER
                    LEDGER_TRANSACTION_POST -> Value.LEDGER_TRANSACTION_POST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RailsInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    USERS_BUSINESS_REGISTER -> Known.USERS_BUSINESS_REGISTER
                    USERS_AUTH_LOGIN -> Known.USERS_AUTH_LOGIN
                    USERS_AUTH_REFRESH -> Known.USERS_AUTH_REFRESH
                    USERS_AUTH_REVOKE -> Known.USERS_AUTH_REVOKE
                    USERS_PASSWORD_RESET_REQUEST -> Known.USERS_PASSWORD_RESET_REQUEST
                    USERS_PASSWORD_RESET_COMPLETE -> Known.USERS_PASSWORD_RESET_COMPLETE
                    USERS_BETA_APPLY -> Known.USERS_BETA_APPLY
                    USERS_API_KEY_CREATE -> Known.USERS_API_KEY_CREATE
                    USERS_API_KEY_REVOKE -> Known.USERS_API_KEY_REVOKE
                    ACCOUNTS_ACCOUNT_CREATE -> Known.ACCOUNTS_ACCOUNT_CREATE
                    ACCOUNTS_ACCOUNT_UPDATE_STATUS -> Known.ACCOUNTS_ACCOUNT_UPDATE_STATUS
                    ACCOUNTS_ACCOUNT_CLOSE -> Known.ACCOUNTS_ACCOUNT_CLOSE
                    ACCOUNTS_MONEY_DEPOSIT -> Known.ACCOUNTS_MONEY_DEPOSIT
                    ACCOUNTS_MONEY_WITHDRAW -> Known.ACCOUNTS_MONEY_WITHDRAW
                    ACCOUNTS_MONEY_TRANSFER -> Known.ACCOUNTS_MONEY_TRANSFER
                    LEDGER_TRANSACTION_POST -> Known.LEDGER_TRANSACTION_POST
                    else -> throw RailsInvalidDataException("Unknown Action: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RailsInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RailsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Action = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Actor
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val roles: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("roles")
                @ExcludeMissing
                roles: JsonField<List<String>> = JsonMissing.of(),
            ) : this(id, type, roles, mutableMapOf())

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun roles(): Optional<List<String>> = roles.getOptional("roles")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [roles].
             *
             * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<String>> = roles

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Actor].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Actor]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var roles: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(actor: Actor) = apply {
                    id = actor.id
                    type = actor.type
                    roles = actor.roles.map { it.toMutableList() }
                    additionalProperties = actor.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun roles(roles: List<String>) = roles(JsonField.of(roles))

                /**
                 * Sets [Builder.roles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roles] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun roles(roles: JsonField<List<String>>) = apply {
                    this.roles = roles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [roles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRole(role: String) = apply {
                    roles =
                        (roles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("roles", it).add(role)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Actor].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Actor =
                    Actor(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        (roles ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Actor = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
                roles()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (roles.asKnown().getOrNull()?.size ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USER = of("user")

                    @JvmField val API_KEY = of("api_key")

                    @JvmField val INTERNAL_SERVICE = of("internal_service")

                    @JvmField val ANONYMOUS = of("anonymous")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    USER,
                    API_KEY,
                    INTERNAL_SERVICE,
                    ANONYMOUS,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER,
                    API_KEY,
                    INTERNAL_SERVICE,
                    ANONYMOUS,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        API_KEY -> Value.API_KEY
                        INTERNAL_SERVICE -> Value.INTERNAL_SERVICE
                        ANONYMOUS -> Value.ANONYMOUS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws RailsInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        API_KEY -> Known.API_KEY
                        INTERNAL_SERVICE -> Known.INTERNAL_SERVICE
                        ANONYMOUS -> Known.ANONYMOUS
                        else -> throw RailsInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RailsInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        RailsInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws RailsInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: RailsInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Actor &&
                    id == other.id &&
                    type == other.type &&
                    roles == other.roles &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, type, roles, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Actor{id=$id, type=$type, roles=$roles, additionalProperties=$additionalProperties}"
        }

        class Environment @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SANDBOX = of("sandbox")

                @JvmField val PRODUCTION = of("production")

                @JvmStatic fun of(value: String) = Environment(JsonField.of(value))
            }

            /** An enum containing [Environment]'s known values. */
            enum class Known {
                SANDBOX,
                PRODUCTION,
            }

            /**
             * An enum containing [Environment]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Environment] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SANDBOX,
                PRODUCTION,
                /**
                 * An enum member indicating that [Environment] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SANDBOX -> Value.SANDBOX
                    PRODUCTION -> Value.PRODUCTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RailsInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SANDBOX -> Known.SANDBOX
                    PRODUCTION -> Known.PRODUCTION
                    else -> throw RailsInvalidDataException("Unknown Environment: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RailsInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RailsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Environment = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Environment && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SUCCESS = of("success")

                @JvmField val CLIENT_ERROR = of("client_error")

                @JvmField val SERVER_ERROR = of("server_error")

                @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
            }

            /** An enum containing [Outcome]'s known values. */
            enum class Known {
                SUCCESS,
                CLIENT_ERROR,
                SERVER_ERROR,
            }

            /**
             * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Outcome] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUCCESS,
                CLIENT_ERROR,
                SERVER_ERROR,
                /**
                 * An enum member indicating that [Outcome] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    CLIENT_ERROR -> Value.CLIENT_ERROR
                    SERVER_ERROR -> Value.SERVER_ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RailsInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    CLIENT_ERROR -> Known.CLIENT_ERROR
                    SERVER_ERROR -> Known.SERVER_ERROR
                    else -> throw RailsInvalidDataException("Unknown Outcome: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RailsInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RailsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Outcome = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Outcome && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Request
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val method: JsonField<String>,
            private val path: JsonField<String>,
            private val ip: JsonField<String>,
            private val userAgent: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_agent")
                @ExcludeMissing
                userAgent: JsonField<String> = JsonMissing.of(),
            ) : this(id, method, path, ip, userAgent, mutableMapOf())

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun method(): String = method.getRequired("method")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): String = path.getRequired("path")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ip(): Optional<String> = ip.getOptional("ip")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userAgent(): Optional<String> = userAgent.getOptional("user_agent")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

            /**
             * Returns the raw JSON value of [ip].
             *
             * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

            /**
             * Returns the raw JSON value of [userAgent].
             *
             * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_agent")
            @ExcludeMissing
            fun _userAgent(): JsonField<String> = userAgent

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Request].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .method()
                 * .path()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Request]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var method: JsonField<String>? = null
                private var path: JsonField<String>? = null
                private var ip: JsonField<String> = JsonMissing.of()
                private var userAgent: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(request: Request) = apply {
                    id = request.id
                    method = request.method
                    path = request.path
                    ip = request.ip
                    userAgent = request.userAgent
                    additionalProperties = request.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun method(method: String) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

                fun path(path: String) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<String>) = apply { this.path = path }

                fun ip(ip: String) = ip(JsonField.of(ip))

                /**
                 * Sets [Builder.ip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ip] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ip(ip: JsonField<String>) = apply { this.ip = ip }

                fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

                /**
                 * Sets [Builder.userAgent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userAgent] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Request].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .method()
                 * .path()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Request =
                    Request(
                        checkRequired("id", id),
                        checkRequired("method", method),
                        checkRequired("path", path),
                        ip,
                        userAgent,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Request = apply {
                if (validated) {
                    return@apply
                }

                id()
                method()
                path()
                ip()
                userAgent()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (if (path.asKnown().isPresent) 1 else 0) +
                    (if (ip.asKnown().isPresent) 1 else 0) +
                    (if (userAgent.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Request &&
                    id == other.id &&
                    method == other.method &&
                    path == other.path &&
                    ip == other.ip &&
                    userAgent == other.userAgent &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, method, path, ip, userAgent, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Request{id=$id, method=$method, path=$path, ip=$ip, userAgent=$userAgent, additionalProperties=$additionalProperties}"
        }

        class SchemaVersion @JsonCreator private constructor(private val value: JsonField<Long>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

            companion object {

                @JvmField val _1 = of(1L)

                @JvmStatic fun of(value: Long) = SchemaVersion(JsonField.of(value))
            }

            /** An enum containing [SchemaVersion]'s known values. */
            enum class Known {
                _1
            }

            /**
             * An enum containing [SchemaVersion]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SchemaVersion] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1,
                /**
                 * An enum member indicating that [SchemaVersion] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    _1 -> Value._1
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RailsInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    else -> throw RailsInvalidDataException("Unknown SchemaVersion: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws RailsInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asLong(): Long =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toLong() else null
                } ?: throw RailsInvalidDataException("Value is not a Long")

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): SchemaVersion = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SchemaVersion && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class SourceService @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val USERS = of("users")

                @JvmField val ACCOUNTS = of("accounts")

                @JvmField val LEDGER = of("ledger")

                @JvmStatic fun of(value: String) = SourceService(JsonField.of(value))
            }

            /** An enum containing [SourceService]'s known values. */
            enum class Known {
                USERS,
                ACCOUNTS,
                LEDGER,
            }

            /**
             * An enum containing [SourceService]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourceService] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                USERS,
                ACCOUNTS,
                LEDGER,
                /**
                 * An enum member indicating that [SourceService] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    USERS -> Value.USERS
                    ACCOUNTS -> Value.ACCOUNTS
                    LEDGER -> Value.LEDGER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RailsInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    USERS -> Known.USERS
                    ACCOUNTS -> Known.ACCOUNTS
                    LEDGER -> Known.LEDGER
                    else -> throw RailsInvalidDataException("Unknown SourceService: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RailsInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RailsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): SourceService = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SourceService && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Target
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Target].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Target]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(target: Target) = apply {
                    id = target.id
                    type = target.type
                    additionalProperties = target.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Target].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Target =
                    Target(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws RailsInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Target = apply {
                if (validated) {
                    return@apply
                }

                id()
                type()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RailsInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Target &&
                    id == other.id &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Target{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                action == other.action &&
                actor == other.actor &&
                correlationId == other.correlationId &&
                createdAt == other.createdAt &&
                environment == other.environment &&
                metadata == other.metadata &&
                occurredAt == other.occurredAt &&
                organizationId == other.organizationId &&
                outcome == other.outcome &&
                request == other.request &&
                schemaVersion == other.schemaVersion &&
                sourceService == other.sourceService &&
                target == other.target &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                action,
                actor,
                correlationId,
                createdAt,
                environment,
                metadata,
                occurredAt,
                organizationId,
                outcome,
                request,
                schemaVersion,
                sourceService,
                target,
                reason,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, action=$action, actor=$actor, correlationId=$correlationId, createdAt=$createdAt, environment=$environment, metadata=$metadata, occurredAt=$occurredAt, organizationId=$organizationId, outcome=$outcome, request=$request, schemaVersion=$schemaVersion, sourceService=$sourceService, target=$target, reason=$reason, additionalProperties=$additionalProperties}"
    }

    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val page: JsonField<Long>,
        private val perPage: JsonField<Long>,
        private val totalCount: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("per_page") @ExcludeMissing perPage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_count")
            @ExcludeMissing
            totalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_pages")
            @ExcludeMissing
            totalPages: JsonField<Long> = JsonMissing.of(),
        ) : this(page, perPage, totalCount, totalPages, mutableMapOf())

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Long = page.getRequired("page")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun perPage(): Long = perPage.getRequired("per_page")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalCount(): Long = totalCount.getRequired("total_count")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPages(): Long = totalPages.getRequired("total_pages")

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [perPage].
         *
         * Unlike [perPage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per_page") @ExcludeMissing fun _perPage(): JsonField<Long> = perPage

        /**
         * Returns the raw JSON value of [totalCount].
         *
         * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

        /**
         * Returns the raw JSON value of [totalPages].
         *
         * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Pagination].
             *
             * The following fields are required:
             * ```java
             * .page()
             * .perPage()
             * .totalCount()
             * .totalPages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var page: JsonField<Long>? = null
            private var perPage: JsonField<Long>? = null
            private var totalCount: JsonField<Long>? = null
            private var totalPages: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagination: Pagination) = apply {
                page = pagination.page
                perPage = pagination.perPage
                totalCount = pagination.totalCount
                totalPages = pagination.totalPages
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            fun page(page: Long) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun perPage(perPage: Long) = perPage(JsonField.of(perPage))

            /**
             * Sets [Builder.perPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perPage] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perPage(perPage: JsonField<Long>) = apply { this.perPage = perPage }

            fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

            /**
             * Sets [Builder.totalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /**
             * Sets [Builder.totalPages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPages] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .page()
             * .perPage()
             * .totalCount()
             * .totalPages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pagination =
                Pagination(
                    checkRequired("page", page),
                    checkRequired("perPage", perPage),
                    checkRequired("totalCount", totalCount),
                    checkRequired("totalPages", totalPages),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RailsInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            page()
            perPage()
            totalCount()
            totalPages()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RailsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (page.asKnown().isPresent) 1 else 0) +
                (if (perPage.asKnown().isPresent) 1 else 0) +
                (if (totalCount.asKnown().isPresent) 1 else 0) +
                (if (totalPages.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                page == other.page &&
                perPage == other.perPage &&
                totalCount == other.totalCount &&
                totalPages == other.totalPages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(page, perPage, totalCount, totalPages, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{page=$page, perPage=$perPage, totalCount=$totalCount, totalPages=$totalPages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEventListResponse &&
            data == other.data &&
            pagination == other.pagination &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, pagination, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditEventListResponse{data=$data, pagination=$pagination, additionalProperties=$additionalProperties}"
}
