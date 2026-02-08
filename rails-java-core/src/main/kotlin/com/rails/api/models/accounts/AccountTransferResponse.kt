// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.rails.api.core.ExcludeMissing
import com.rails.api.core.JsonField
import com.rails.api.core.JsonMissing
import com.rails.api.core.JsonValue
import com.rails.api.core.checkRequired
import com.rails.api.errors.RailsInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AccountTransferResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fromAccount: JsonField<Account>,
    private val toAccount: JsonField<Account>,
    private val transaction: JsonField<Transaction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("from_account")
        @ExcludeMissing
        fromAccount: JsonField<Account> = JsonMissing.of(),
        @JsonProperty("to_account")
        @ExcludeMissing
        toAccount: JsonField<Account> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<Transaction> = JsonMissing.of(),
    ) : this(fromAccount, toAccount, transaction, mutableMapOf())

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fromAccount(): Account = fromAccount.getRequired("from_account")

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toAccount(): Account = toAccount.getRequired("to_account")

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
    fun _fromAccount(): JsonField<Account> = fromAccount

    /**
     * Returns the raw JSON value of [toAccount].
     *
     * Unlike [toAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to_account") @ExcludeMissing fun _toAccount(): JsonField<Account> = toAccount

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

        private var fromAccount: JsonField<Account>? = null
        private var toAccount: JsonField<Account>? = null
        private var transaction: JsonField<Transaction>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountTransferResponse: AccountTransferResponse) = apply {
            fromAccount = accountTransferResponse.fromAccount
            toAccount = accountTransferResponse.toAccount
            transaction = accountTransferResponse.transaction
            additionalProperties = accountTransferResponse.additionalProperties.toMutableMap()
        }

        fun fromAccount(fromAccount: Account) = fromAccount(JsonField.of(fromAccount))

        /**
         * Sets [Builder.fromAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fromAccount] with a well-typed [Account] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fromAccount(fromAccount: JsonField<Account>) = apply { this.fromAccount = fromAccount }

        fun toAccount(toAccount: Account) = toAccount(JsonField.of(toAccount))

        /**
         * Sets [Builder.toAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toAccount] with a well-typed [Account] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toAccount(toAccount: JsonField<Account>) = apply { this.toAccount = toAccount }

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
