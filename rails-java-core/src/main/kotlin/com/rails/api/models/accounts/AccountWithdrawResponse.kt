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
import com.rails.api.models.Transaction
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AccountWithdrawResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val account: JsonField<Account>,
    private val transaction: JsonField<Transaction>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account") @ExcludeMissing account: JsonField<Account> = JsonMissing.of(),
        @JsonProperty("transaction")
        @ExcludeMissing
        transaction: JsonField<Transaction> = JsonMissing.of(),
    ) : this(account, transaction, mutableMapOf())

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun account(): Account = account.getRequired("account")

    /**
     * @throws RailsInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transaction(): Transaction = transaction.getRequired("transaction")

    /**
     * Returns the raw JSON value of [account].
     *
     * Unlike [account], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<Account> = account

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
         * Returns a mutable builder for constructing an instance of [AccountWithdrawResponse].
         *
         * The following fields are required:
         * ```java
         * .account()
         * .transaction()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountWithdrawResponse]. */
    class Builder internal constructor() {

        private var account: JsonField<Account>? = null
        private var transaction: JsonField<Transaction>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountWithdrawResponse: AccountWithdrawResponse) = apply {
            account = accountWithdrawResponse.account
            transaction = accountWithdrawResponse.transaction
            additionalProperties = accountWithdrawResponse.additionalProperties.toMutableMap()
        }

        fun account(account: Account) = account(JsonField.of(account))

        /**
         * Sets [Builder.account] to an arbitrary JSON value.
         *
         * You should usually call [Builder.account] with a well-typed [Account] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun account(account: JsonField<Account>) = apply { this.account = account }

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
         * Returns an immutable instance of [AccountWithdrawResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .account()
         * .transaction()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountWithdrawResponse =
            AccountWithdrawResponse(
                checkRequired("account", account),
                checkRequired("transaction", transaction),
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
    fun validate(): AccountWithdrawResponse = apply {
        if (validated) {
            return@apply
        }

        account().validate()
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
        (account.asKnown().getOrNull()?.validity() ?: 0) +
            (transaction.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountWithdrawResponse &&
            account == other.account &&
            transaction == other.transaction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(account, transaction, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountWithdrawResponse{account=$account, transaction=$transaction, additionalProperties=$additionalProperties}"
}
