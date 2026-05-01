// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.models.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.railsinfra.core.Enum
import com.railsinfra.core.ExcludeMissing
import com.railsinfra.core.JsonField
import com.railsinfra.core.JsonMissing
import com.railsinfra.core.JsonValue
import com.railsinfra.core.checkRequired
import com.railsinfra.errors.RailsInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountTransferResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fromAccount: JsonField<FromAccount>,
    private val toAccount: JsonField<ToAccount>,
    private val transaction: JsonField<Transaction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("from_account")
        @ExcludeMissing
        fromAccount: JsonField<FromAccount> = JsonMissing.of(),
        @JsonProperty("to_account")
        @ExcludeMissing
        toAccount: JsonField<ToAccount> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<Transaction> = JsonMissing.of(),
    ) : this(fromAccount, toAccount, transaction, mutableMapOf())

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromAccount(): FromAccount = fromAccount.getRequired("from_account")

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toAccount(): ToAccount = toAccount.getRequired("to_account")

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transaction(): Transaction = transaction.getRequired("transaction")

    /**
     * Returns the raw JSON value of [fromAccount].
     *
     * Unlike [fromAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from_account")
    @ExcludeMissing
    fun _fromAccount(): JsonField<FromAccount> = fromAccount

    /**
     * Returns the raw JSON value of [toAccount].
     *
     * Unlike [toAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to_account") @ExcludeMissing fun _toAccount(): JsonField<ToAccount> = toAccount

    /**
     * Returns the raw JSON value of [transaction].
     *
     * Unlike [transaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction")
    @ExcludeMissing
    fun _transaction(): JsonField<Transaction> = transaction

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
         * Returns a mutable builder for constructing an instance of [AccountTransferResponse].
         *
         * The following fields are required:
         * ```java
         * .fromAccount()
         * .toAccount()
         * .transaction()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountTransferResponse]. */
    class Builder internal constructor() {

        private var fromAccount: JsonField<FromAccount>? = null
        private var toAccount: JsonField<ToAccount>? = null
        private var transaction: JsonField<Transaction>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountTransferResponse: AccountTransferResponse) = apply {
            fromAccount = accountTransferResponse.fromAccount
            toAccount = accountTransferResponse.toAccount
            transaction = accountTransferResponse.transaction
            additionalProperties = accountTransferResponse.additionalProperties.toMutableMap()
        }

        fun fromAccount(fromAccount: FromAccount) = fromAccount(JsonField.of(fromAccount))

        /**
         * Sets [Builder.fromAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromAccount] with a well-typed [FromAccount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromAccount(fromAccount: JsonField<FromAccount>) = apply {
            this.fromAccount = fromAccount
        }

        fun toAccount(toAccount: ToAccount) = toAccount(JsonField.of(toAccount))

        /**
         * Sets [Builder.toAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toAccount] with a well-typed [ToAccount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toAccount(toAccount: JsonField<ToAccount>) = apply { this.toAccount = toAccount }

        fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

        /**
         * Sets [Builder.transaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transaction] with a well-typed [Transaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
        }

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
         * Returns an immutable instance of [AccountTransferResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromAccount()
         * .toAccount()
         * .transaction()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountTransferResponse =
            AccountTransferResponse(
                checkRequired("fromAccount", fromAccount),
                checkRequired("toAccount", toAccount),
                checkRequired("transaction", transaction),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountTransferResponse = apply {
        if (validated) {
            return@apply
        }

        fromAccount().validate()
        toAccount().validate()
        transaction().validate()
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
        (fromAccount.asKnown().getOrNull()?.validity() ?: 0) +
            (toAccount.asKnown().getOrNull()?.validity() ?: 0) +
            (transaction.asKnown().getOrNull()?.validity() ?: 0)

    class FromAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<AccountType>,
        private val balance: JsonField<String>,
        private val currency: JsonField<String>,
        private val environment: JsonField<String>,
        private val status: JsonField<Status>,
        private val userId: JsonField<String>,
        private val adminUserId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val organizationId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userRole: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<AccountType> = JsonMissing.of(),
            @JsonProperty("balance") @ExcludeMissing balance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("admin_user_id")
            @ExcludeMissing
            adminUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountNumber,
            accountType,
            balance,
            currency,
            environment,
            status,
            userId,
            adminUserId,
            createdAt,
            organizationId,
            updatedAt,
            userRole,
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
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountType(): AccountType = accountType.getRequired("account_type")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balance(): String = balance.getRequired("balance")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun environment(): String = environment.getRequired("environment")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adminUserId(): Optional<String> = adminUserId.getOptional("admin_user_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userRole(): Optional<String> = userRole.getOptional("user_role")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /**
         * Returns the raw JSON value of [balance].
         *
         * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [adminUserId].
         *
         * Unlike [adminUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("admin_user_id")
        @ExcludeMissing
        fun _adminUserId(): JsonField<String> = adminUserId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userRole].
         *
         * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_role") @ExcludeMissing fun _userRole(): JsonField<String> = userRole

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
             * Returns a mutable builder for constructing an instance of [FromAccount].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountNumber()
             * .accountType()
             * .balance()
             * .currency()
             * .environment()
             * .status()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FromAccount]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonField<AccountType>? = null
            private var balance: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var environment: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var userId: JsonField<String>? = null
            private var adminUserId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userRole: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fromAccount: FromAccount) = apply {
                id = fromAccount.id
                accountNumber = fromAccount.accountNumber
                accountType = fromAccount.accountType
                balance = fromAccount.balance
                currency = fromAccount.currency
                environment = fromAccount.environment
                status = fromAccount.status
                userId = fromAccount.userId
                adminUserId = fromAccount.adminUserId
                createdAt = fromAccount.createdAt
                organizationId = fromAccount.organizationId
                updatedAt = fromAccount.updatedAt
                userRole = fromAccount.userRole
                additionalProperties = fromAccount.additionalProperties.toMutableMap()
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

            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [AccountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            fun balance(balance: String) = balance(JsonField.of(balance))

            /**
             * Sets [Builder.balance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balance] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balance(balance: JsonField<String>) = apply { this.balance = balance }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun environment(environment: String) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<String>) = apply {
                this.environment = environment
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun adminUserId(adminUserId: String?) = adminUserId(JsonField.ofNullable(adminUserId))

            /** Alias for calling [Builder.adminUserId] with `adminUserId.orElse(null)`. */
            fun adminUserId(adminUserId: Optional<String>) = adminUserId(adminUserId.getOrNull())

            /**
             * Sets [Builder.adminUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adminUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adminUserId(adminUserId: JsonField<String>) = apply {
                this.adminUserId = adminUserId
            }

            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

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

            fun organizationId(organizationId: String?) =
                organizationId(JsonField.ofNullable(organizationId))

            /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
            fun organizationId(organizationId: Optional<String>) =
                organizationId(organizationId.getOrNull())

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

            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

            /** Alias for calling [Builder.userRole] with `userRole.orElse(null)`. */
            fun userRole(userRole: Optional<String>) = userRole(userRole.getOrNull())

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userRole(userRole: JsonField<String>) = apply { this.userRole = userRole }

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
             * Returns an immutable instance of [FromAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountNumber()
             * .accountType()
             * .balance()
             * .currency()
             * .environment()
             * .status()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FromAccount =
                FromAccount(
                    checkRequired("id", id),
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("accountType", accountType),
                    checkRequired("balance", balance),
                    checkRequired("currency", currency),
                    checkRequired("environment", environment),
                    checkRequired("status", status),
                    checkRequired("userId", userId),
                    adminUserId,
                    createdAt,
                    organizationId,
                    updatedAt,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FromAccount = apply {
            if (validated) {
                return@apply
            }

            id()
            accountNumber()
            accountType().validate()
            balance()
            currency()
            environment()
            status().validate()
            userId()
            adminUserId()
            createdAt()
            organizationId()
            updatedAt()
            userRole()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (accountType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (balance.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (environment.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (adminUserId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userRole.asKnown().isPresent) 1 else 0)

        class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CHECKING = of("checking")

                @JvmField val SAVING = of("saving")

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            /** An enum containing [AccountType]'s known values. */
            enum class Known {
                CHECKING,
                SAVING,
            }

            /**
             * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVING,
                /**
                 * An enum member indicating that [AccountType] was instantiated with an unknown
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
                    CHECKING -> Value.CHECKING
                    SAVING -> Value.SAVING
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
                    CHECKING -> Known.CHECKING
                    SAVING -> Known.SAVING
                    else -> throw RailsInvalidDataException("Unknown AccountType: $value")
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

            fun validate(): AccountType = apply {
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

                return other is AccountType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACTIVE = of("active")

                @JvmField val SUSPENDED = of("suspended")

                @JvmField val CLOSED = of("closed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                SUSPENDED,
                CLOSED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                SUSPENDED,
                CLOSED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ACTIVE -> Value.ACTIVE
                    SUSPENDED -> Value.SUSPENDED
                    CLOSED -> Value.CLOSED
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
                    ACTIVE -> Known.ACTIVE
                    SUSPENDED -> Known.SUSPENDED
                    CLOSED -> Known.CLOSED
                    else -> throw RailsInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FromAccount &&
                id == other.id &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                balance == other.balance &&
                currency == other.currency &&
                environment == other.environment &&
                status == other.status &&
                userId == other.userId &&
                adminUserId == other.adminUserId &&
                createdAt == other.createdAt &&
                organizationId == other.organizationId &&
                updatedAt == other.updatedAt &&
                userRole == other.userRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountNumber,
                accountType,
                balance,
                currency,
                environment,
                status,
                userId,
                adminUserId,
                createdAt,
                organizationId,
                updatedAt,
                userRole,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FromAccount{id=$id, accountNumber=$accountNumber, accountType=$accountType, balance=$balance, currency=$currency, environment=$environment, status=$status, userId=$userId, adminUserId=$adminUserId, createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    class ToAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<AccountType>,
        private val balance: JsonField<String>,
        private val currency: JsonField<String>,
        private val environment: JsonField<String>,
        private val status: JsonField<Status>,
        private val userId: JsonField<String>,
        private val adminUserId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val organizationId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userRole: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<AccountType> = JsonMissing.of(),
            @JsonProperty("balance") @ExcludeMissing balance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("admin_user_id")
            @ExcludeMissing
            adminUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountNumber,
            accountType,
            balance,
            currency,
            environment,
            status,
            userId,
            adminUserId,
            createdAt,
            organizationId,
            updatedAt,
            userRole,
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
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountType(): AccountType = accountType.getRequired("account_type")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balance(): String = balance.getRequired("balance")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun environment(): String = environment.getRequired("environment")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adminUserId(): Optional<String> = adminUserId.getOptional("admin_user_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userRole(): Optional<String> = userRole.getOptional("user_role")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /**
         * Returns the raw JSON value of [balance].
         *
         * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [adminUserId].
         *
         * Unlike [adminUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("admin_user_id")
        @ExcludeMissing
        fun _adminUserId(): JsonField<String> = adminUserId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userRole].
         *
         * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_role") @ExcludeMissing fun _userRole(): JsonField<String> = userRole

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
             * Returns a mutable builder for constructing an instance of [ToAccount].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountNumber()
             * .accountType()
             * .balance()
             * .currency()
             * .environment()
             * .status()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ToAccount]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonField<AccountType>? = null
            private var balance: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var environment: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var userId: JsonField<String>? = null
            private var adminUserId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userRole: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(toAccount: ToAccount) = apply {
                id = toAccount.id
                accountNumber = toAccount.accountNumber
                accountType = toAccount.accountType
                balance = toAccount.balance
                currency = toAccount.currency
                environment = toAccount.environment
                status = toAccount.status
                userId = toAccount.userId
                adminUserId = toAccount.adminUserId
                createdAt = toAccount.createdAt
                organizationId = toAccount.organizationId
                updatedAt = toAccount.updatedAt
                userRole = toAccount.userRole
                additionalProperties = toAccount.additionalProperties.toMutableMap()
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

            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [AccountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            fun balance(balance: String) = balance(JsonField.of(balance))

            /**
             * Sets [Builder.balance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balance] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balance(balance: JsonField<String>) = apply { this.balance = balance }

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun environment(environment: String) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<String>) = apply {
                this.environment = environment
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun adminUserId(adminUserId: String?) = adminUserId(JsonField.ofNullable(adminUserId))

            /** Alias for calling [Builder.adminUserId] with `adminUserId.orElse(null)`. */
            fun adminUserId(adminUserId: Optional<String>) = adminUserId(adminUserId.getOrNull())

            /**
             * Sets [Builder.adminUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adminUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adminUserId(adminUserId: JsonField<String>) = apply {
                this.adminUserId = adminUserId
            }

            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

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

            fun organizationId(organizationId: String?) =
                organizationId(JsonField.ofNullable(organizationId))

            /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
            fun organizationId(organizationId: Optional<String>) =
                organizationId(organizationId.getOrNull())

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

            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

            /** Alias for calling [Builder.userRole] with `userRole.orElse(null)`. */
            fun userRole(userRole: Optional<String>) = userRole(userRole.getOrNull())

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userRole(userRole: JsonField<String>) = apply { this.userRole = userRole }

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
             * Returns an immutable instance of [ToAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountNumber()
             * .accountType()
             * .balance()
             * .currency()
             * .environment()
             * .status()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ToAccount =
                ToAccount(
                    checkRequired("id", id),
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("accountType", accountType),
                    checkRequired("balance", balance),
                    checkRequired("currency", currency),
                    checkRequired("environment", environment),
                    checkRequired("status", status),
                    checkRequired("userId", userId),
                    adminUserId,
                    createdAt,
                    organizationId,
                    updatedAt,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ToAccount = apply {
            if (validated) {
                return@apply
            }

            id()
            accountNumber()
            accountType().validate()
            balance()
            currency()
            environment()
            status().validate()
            userId()
            adminUserId()
            createdAt()
            organizationId()
            updatedAt()
            userRole()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (accountType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (balance.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (environment.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (adminUserId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (organizationId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userRole.asKnown().isPresent) 1 else 0)

        class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CHECKING = of("checking")

                @JvmField val SAVING = of("saving")

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            /** An enum containing [AccountType]'s known values. */
            enum class Known {
                CHECKING,
                SAVING,
            }

            /**
             * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVING,
                /**
                 * An enum member indicating that [AccountType] was instantiated with an unknown
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
                    CHECKING -> Value.CHECKING
                    SAVING -> Value.SAVING
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
                    CHECKING -> Known.CHECKING
                    SAVING -> Known.SAVING
                    else -> throw RailsInvalidDataException("Unknown AccountType: $value")
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

            fun validate(): AccountType = apply {
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

                return other is AccountType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACTIVE = of("active")

                @JvmField val SUSPENDED = of("suspended")

                @JvmField val CLOSED = of("closed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                SUSPENDED,
                CLOSED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                SUSPENDED,
                CLOSED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ACTIVE -> Value.ACTIVE
                    SUSPENDED -> Value.SUSPENDED
                    CLOSED -> Value.CLOSED
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
                    ACTIVE -> Known.ACTIVE
                    SUSPENDED -> Known.SUSPENDED
                    CLOSED -> Known.CLOSED
                    else -> throw RailsInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToAccount &&
                id == other.id &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                balance == other.balance &&
                currency == other.currency &&
                environment == other.environment &&
                status == other.status &&
                userId == other.userId &&
                adminUserId == other.adminUserId &&
                createdAt == other.createdAt &&
                organizationId == other.organizationId &&
                updatedAt == other.updatedAt &&
                userRole == other.userRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountNumber,
                accountType,
                balance,
                currency,
                environment,
                status,
                userId,
                adminUserId,
                createdAt,
                organizationId,
                updatedAt,
                userRole,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToAccount{id=$id, accountNumber=$accountNumber, accountType=$accountType, balance=$balance, currency=$currency, environment=$environment, status=$status, userId=$userId, adminUserId=$adminUserId, createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    class Transaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountId: JsonField<String>,
        private val amount: JsonField<String>,
        private val balanceAfter: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val status: JsonField<Status>,
        private val transactionType: JsonField<TransactionType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val externalRecipientId: JsonField<String>,
        private val recipientAccountId: JsonField<String>,
        private val referenceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance_after")
            @ExcludeMissing
            balanceAfter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("transaction_type")
            @ExcludeMissing
            transactionType: JsonField<TransactionType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_recipient_id")
            @ExcludeMissing
            externalRecipientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_account_id")
            @ExcludeMissing
            recipientAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_id")
            @ExcludeMissing
            referenceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountId,
            amount,
            balanceAfter,
            createdAt,
            currency,
            status,
            transactionType,
            updatedAt,
            description,
            externalRecipientId,
            recipientAccountId,
            referenceId,
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
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balanceAfter(): String = balanceAfter.getRequired("balance_after")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transactionType(): TransactionType = transactionType.getRequired("transaction_type")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalRecipientId(): Optional<String> =
            externalRecipientId.getOptional("external_recipient_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipientAccountId(): Optional<String> =
            recipientAccountId.getOptional("recipient_account_id")

        /**
         * @throws RailsInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referenceId(): Optional<String> = referenceId.getOptional("reference_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [balanceAfter].
         *
         * Unlike [balanceAfter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("balance_after")
        @ExcludeMissing
        fun _balanceAfter(): JsonField<String> = balanceAfter

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [transactionType].
         *
         * Unlike [transactionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_type")
        @ExcludeMissing
        fun _transactionType(): JsonField<TransactionType> = transactionType

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [externalRecipientId].
         *
         * Unlike [externalRecipientId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_recipient_id")
        @ExcludeMissing
        fun _externalRecipientId(): JsonField<String> = externalRecipientId

        /**
         * Returns the raw JSON value of [recipientAccountId].
         *
         * Unlike [recipientAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_account_id")
        @ExcludeMissing
        fun _recipientAccountId(): JsonField<String> = recipientAccountId

        /**
         * Returns the raw JSON value of [referenceId].
         *
         * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference_id")
        @ExcludeMissing
        fun _referenceId(): JsonField<String> = referenceId

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
             * Returns a mutable builder for constructing an instance of [Transaction].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountId()
             * .amount()
             * .balanceAfter()
             * .createdAt()
             * .currency()
             * .status()
             * .transactionType()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Transaction]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var amount: JsonField<String>? = null
            private var balanceAfter: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var transactionType: JsonField<TransactionType>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var externalRecipientId: JsonField<String> = JsonMissing.of()
            private var recipientAccountId: JsonField<String> = JsonMissing.of()
            private var referenceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transaction: Transaction) = apply {
                id = transaction.id
                accountId = transaction.accountId
                amount = transaction.amount
                balanceAfter = transaction.balanceAfter
                createdAt = transaction.createdAt
                currency = transaction.currency
                status = transaction.status
                transactionType = transaction.transactionType
                updatedAt = transaction.updatedAt
                description = transaction.description
                externalRecipientId = transaction.externalRecipientId
                recipientAccountId = transaction.recipientAccountId
                referenceId = transaction.referenceId
                additionalProperties = transaction.additionalProperties.toMutableMap()
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

            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun balanceAfter(balanceAfter: String) = balanceAfter(JsonField.of(balanceAfter))

            /**
             * Sets [Builder.balanceAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceAfter] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceAfter(balanceAfter: JsonField<String>) = apply {
                this.balanceAfter = balanceAfter
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

            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun transactionType(transactionType: TransactionType) =
                transactionType(JsonField.of(transactionType))

            /**
             * Sets [Builder.transactionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionType] with a well-typed [TransactionType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transactionType(transactionType: JsonField<TransactionType>) = apply {
                this.transactionType = transactionType
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun externalRecipientId(externalRecipientId: String?) =
                externalRecipientId(JsonField.ofNullable(externalRecipientId))

            /**
             * Alias for calling [Builder.externalRecipientId] with
             * `externalRecipientId.orElse(null)`.
             */
            fun externalRecipientId(externalRecipientId: Optional<String>) =
                externalRecipientId(externalRecipientId.getOrNull())

            /**
             * Sets [Builder.externalRecipientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalRecipientId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalRecipientId(externalRecipientId: JsonField<String>) = apply {
                this.externalRecipientId = externalRecipientId
            }

            fun recipientAccountId(recipientAccountId: String?) =
                recipientAccountId(JsonField.ofNullable(recipientAccountId))

            /**
             * Alias for calling [Builder.recipientAccountId] with
             * `recipientAccountId.orElse(null)`.
             */
            fun recipientAccountId(recipientAccountId: Optional<String>) =
                recipientAccountId(recipientAccountId.getOrNull())

            /**
             * Sets [Builder.recipientAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientAccountId(recipientAccountId: JsonField<String>) = apply {
                this.recipientAccountId = recipientAccountId
            }

            fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

            /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
            fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

            /**
             * Sets [Builder.referenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceId(referenceId: JsonField<String>) = apply {
                this.referenceId = referenceId
            }

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
             * Returns an immutable instance of [Transaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .accountId()
             * .amount()
             * .balanceAfter()
             * .createdAt()
             * .currency()
             * .status()
             * .transactionType()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Transaction =
                Transaction(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("balanceAfter", balanceAfter),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("status", status),
                    checkRequired("transactionType", transactionType),
                    checkRequired("updatedAt", updatedAt),
                    description,
                    externalRecipientId,
                    recipientAccountId,
                    referenceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Transaction = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            amount()
            balanceAfter()
            createdAt()
            currency()
            status().validate()
            transactionType().validate()
            updatedAt()
            description()
            externalRecipientId()
            recipientAccountId()
            referenceId()
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
                (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (balanceAfter.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (externalRecipientId.asKnown().isPresent) 1 else 0) +
                (if (recipientAccountId.asKnown().isPresent) 1 else 0) +
                (if (referenceId.asKnown().isPresent) 1 else 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PENDING = of("pending")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                COMPLETED,
                FAILED,
                CANCELLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                COMPLETED,
                FAILED,
                CANCELLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    CANCELLED -> Value.CANCELLED
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
                    PENDING -> Known.PENDING
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    CANCELLED -> Known.CANCELLED
                    else -> throw RailsInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TransactionType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEPOSIT = of("deposit")

                @JvmField val WITHDRAWAL = of("withdrawal")

                @JvmField val TRANSFER = of("transfer")

                @JvmField val RECURRING_PAYMENT = of("recurring_payment")

                @JvmField val SAVINGS_WITHDRAW = of("savings_withdraw")

                @JvmStatic fun of(value: String) = TransactionType(JsonField.of(value))
            }

            /** An enum containing [TransactionType]'s known values. */
            enum class Known {
                DEPOSIT,
                WITHDRAWAL,
                TRANSFER,
                RECURRING_PAYMENT,
                SAVINGS_WITHDRAW,
            }

            /**
             * An enum containing [TransactionType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TransactionType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEPOSIT,
                WITHDRAWAL,
                TRANSFER,
                RECURRING_PAYMENT,
                SAVINGS_WITHDRAW,
                /**
                 * An enum member indicating that [TransactionType] was instantiated with an unknown
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
                    DEPOSIT -> Value.DEPOSIT
                    WITHDRAWAL -> Value.WITHDRAWAL
                    TRANSFER -> Value.TRANSFER
                    RECURRING_PAYMENT -> Value.RECURRING_PAYMENT
                    SAVINGS_WITHDRAW -> Value.SAVINGS_WITHDRAW
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
                    DEPOSIT -> Known.DEPOSIT
                    WITHDRAWAL -> Known.WITHDRAWAL
                    TRANSFER -> Known.TRANSFER
                    RECURRING_PAYMENT -> Known.RECURRING_PAYMENT
                    SAVINGS_WITHDRAW -> Known.SAVINGS_WITHDRAW
                    else -> throw RailsInvalidDataException("Unknown TransactionType: $value")
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

            fun validate(): TransactionType = apply {
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

                return other is TransactionType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transaction &&
                id == other.id &&
                accountId == other.accountId &&
                amount == other.amount &&
                balanceAfter == other.balanceAfter &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                status == other.status &&
                transactionType == other.transactionType &&
                updatedAt == other.updatedAt &&
                description == other.description &&
                externalRecipientId == other.externalRecipientId &&
                recipientAccountId == other.recipientAccountId &&
                referenceId == other.referenceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountId,
                amount,
                balanceAfter,
                createdAt,
                currency,
                status,
                transactionType,
                updatedAt,
                description,
                externalRecipientId,
                recipientAccountId,
                referenceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transaction{id=$id, accountId=$accountId, amount=$amount, balanceAfter=$balanceAfter, createdAt=$createdAt, currency=$currency, status=$status, transactionType=$transactionType, updatedAt=$updatedAt, description=$description, externalRecipientId=$externalRecipientId, recipientAccountId=$recipientAccountId, referenceId=$referenceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountTransferResponse &&
            fromAccount == other.fromAccount &&
            toAccount == other.toAccount &&
            transaction == other.transaction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fromAccount, toAccount, transaction, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountTransferResponse{fromAccount=$fromAccount, toAccount=$toAccount, transaction=$transaction, additionalProperties=$additionalProperties}"
}
