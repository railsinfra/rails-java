// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.auditevents

import com.fasterxml.jackson.annotation.JsonCreator
import com.railsinfra.core.Enum
import com.railsinfra.core.JsonField
import com.railsinfra.core.Params
import com.railsinfra.core.http.Headers
import com.railsinfra.core.http.QueryParams
import com.railsinfra.errors.RailsInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List audit events */
class AuditEventListParams
private constructor(
    private val action: String?,
    private val environment: Environment?,
    private val from: OffsetDateTime?,
    private val outcome: Outcome?,
    private val page: Long?,
    private val perPage: Long?,
    private val targetId: String?,
    private val targetType: String?,
    private val to: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun action(): Optional<String> = Optional.ofNullable(action)

    /** Environment to list audit events from. Defaults to sandbox when omitted. */
    fun environment(): Optional<Environment> = Optional.ofNullable(environment)

    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    fun outcome(): Optional<Outcome> = Optional.ofNullable(outcome)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun targetId(): Optional<String> = Optional.ofNullable(targetId)

    fun targetType(): Optional<String> = Optional.ofNullable(targetType)

    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuditEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuditEventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEventListParams]. */
    class Builder internal constructor() {

        private var action: String? = null
        private var environment: Environment? = null
        private var from: OffsetDateTime? = null
        private var outcome: Outcome? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var targetId: String? = null
        private var targetType: String? = null
        private var to: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(auditEventListParams: AuditEventListParams) = apply {
            action = auditEventListParams.action
            environment = auditEventListParams.environment
            from = auditEventListParams.from
            outcome = auditEventListParams.outcome
            page = auditEventListParams.page
            perPage = auditEventListParams.perPage
            targetId = auditEventListParams.targetId
            targetType = auditEventListParams.targetType
            to = auditEventListParams.to
            additionalHeaders = auditEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = auditEventListParams.additionalQueryParams.toBuilder()
        }

        fun action(action: String?) = apply { this.action = action }

        /** Alias for calling [Builder.action] with `action.orElse(null)`. */
        fun action(action: Optional<String>) = action(action.getOrNull())

        /** Environment to list audit events from. Defaults to sandbox when omitted. */
        fun environment(environment: Environment?) = apply { this.environment = environment }

        /** Alias for calling [Builder.environment] with `environment.orElse(null)`. */
        fun environment(environment: Optional<Environment>) = environment(environment.getOrNull())

        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        fun outcome(outcome: Outcome?) = apply { this.outcome = outcome }

        /** Alias for calling [Builder.outcome] with `outcome.orElse(null)`. */
        fun outcome(outcome: Optional<Outcome>) = outcome(outcome.getOrNull())

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        fun targetId(targetId: String?) = apply { this.targetId = targetId }

        /** Alias for calling [Builder.targetId] with `targetId.orElse(null)`. */
        fun targetId(targetId: Optional<String>) = targetId(targetId.getOrNull())

        fun targetType(targetType: String?) = apply { this.targetType = targetType }

        /** Alias for calling [Builder.targetType] with `targetType.orElse(null)`. */
        fun targetType(targetType: Optional<String>) = targetType(targetType.getOrNull())

        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AuditEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditEventListParams =
            AuditEventListParams(
                action,
                environment,
                from,
                outcome,
                page,
                perPage,
                targetId,
                targetType,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                action?.let { put("action", it) }
                environment?.let { put("environment", it.toString()) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                outcome?.let { put("outcome", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("per_page", it.toString()) }
                targetId?.let { put("target_id", it) }
                targetType?.let { put("target_type", it) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Environment to list audit events from. Defaults to sandbox when omitted. */
    class Environment @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SANDBOX,
            PRODUCTION,
            /**
             * An enum member indicating that [Environment] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RailsInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RailsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RailsInvalidDataException("Value is not a String") }

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

    class Outcome @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            CLIENT_ERROR,
            SERVER_ERROR,
            /** An enum member indicating that [Outcome] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RailsInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RailsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RailsInvalidDataException("Value is not a String") }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEventListParams &&
            action == other.action &&
            environment == other.environment &&
            from == other.from &&
            outcome == other.outcome &&
            page == other.page &&
            perPage == other.perPage &&
            targetId == other.targetId &&
            targetType == other.targetType &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            action,
            environment,
            from,
            outcome,
            page,
            perPage,
            targetId,
            targetType,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AuditEventListParams{action=$action, environment=$environment, from=$from, outcome=$outcome, page=$page, perPage=$perPage, targetId=$targetId, targetType=$targetType, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
