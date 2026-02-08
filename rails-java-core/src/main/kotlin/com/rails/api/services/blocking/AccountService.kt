// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.accounts.Account
import com.rails.api.models.accounts.AccountCloseParams
import com.rails.api.models.accounts.AccountCreateParams
import com.rails.api.models.accounts.AccountDepositParams
import com.rails.api.models.accounts.AccountDepositResponse
import com.rails.api.models.accounts.AccountListParams
import com.rails.api.models.accounts.AccountRetrieveParams
import com.rails.api.models.accounts.AccountTransferParams
import com.rails.api.models.accounts.AccountTransferResponse
import com.rails.api.models.accounts.AccountUpdateStatusParams
import com.rails.api.models.accounts.AccountWithdrawParams
import com.rails.api.models.accounts.AccountWithdrawResponse
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Create account */
    fun create(params: AccountCreateParams): Account = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Retrieve account */
    fun retrieve(id: String): Account = retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): Account = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): Account = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Account =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** List accounts */
    fun list(params: AccountListParams): List<Account> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Account>

    /** Close account */
    fun close(id: String): Account = close(id, AccountCloseParams.none())

    /** @see close */
    fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = close(params.toBuilder().id(id).build(), requestOptions)

    /** @see close */
    fun close(id: String, params: AccountCloseParams = AccountCloseParams.none()): Account =
        close(id, params, RequestOptions.none())

    /** @see close */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see close */
    fun close(params: AccountCloseParams): Account = close(params, RequestOptions.none())

    /** @see close */
    fun close(id: String, requestOptions: RequestOptions): Account =
        close(id, AccountCloseParams.none(), requestOptions)

    /** Deposit into account */
    fun deposit(id: String, params: AccountDepositParams): AccountDepositResponse =
        deposit(id, params, RequestOptions.none())

    /** @see deposit */
    fun deposit(
        id: String,
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDepositResponse = deposit(params.toBuilder().id(id).build(), requestOptions)

    /** @see deposit */
    fun deposit(params: AccountDepositParams): AccountDepositResponse =
        deposit(params, RequestOptions.none())

    /** @see deposit */
    fun deposit(
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDepositResponse

    /** Transfer between accounts */
    fun transfer(id: String, params: AccountTransferParams): AccountTransferResponse =
        transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferResponse = transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: AccountTransferParams): AccountTransferResponse =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferResponse

    /** Update account status */
    fun updateStatus(id: String): Account = updateStatus(id, AccountUpdateStatusParams.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
    ): Account = updateStatus(id, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see updateStatus */
    fun updateStatus(params: AccountUpdateStatusParams): Account =
        updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(id: String, requestOptions: RequestOptions): Account =
        updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

    /** Withdraw from account */
    fun withdraw(id: String, params: AccountWithdrawParams): AccountWithdrawResponse =
        withdraw(id, params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        id: String,
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountWithdrawResponse = withdraw(params.toBuilder().id(id).build(), requestOptions)

    /** @see withdraw */
    fun withdraw(params: AccountWithdrawParams): AccountWithdrawResponse =
        withdraw(params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountWithdrawResponse

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts`, but is otherwise the same as
         * [AccountService.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<Account> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{id}`, but is otherwise the same as
         * [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Account> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): HttpResponseFor<Account> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<Account> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Account> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(params: AccountListParams): HttpResponseFor<List<Account>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Account>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountService.close].
         */
        @MustBeClosed
        fun close(id: String): HttpResponseFor<Account> = close(id, AccountCloseParams.none())

        /** @see close */
        @MustBeClosed
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> = close(params.toBuilder().id(id).build(), requestOptions)

        /** @see close */
        @MustBeClosed
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
        ): HttpResponseFor<Account> = close(id, params, RequestOptions.none())

        /** @see close */
        @MustBeClosed
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see close */
        @MustBeClosed
        fun close(params: AccountCloseParams): HttpResponseFor<Account> =
            close(params, RequestOptions.none())

        /** @see close */
        @MustBeClosed
        fun close(id: String, requestOptions: RequestOptions): HttpResponseFor<Account> =
            close(id, AccountCloseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/deposit`, but is otherwise
         * the same as [AccountService.deposit].
         */
        @MustBeClosed
        fun deposit(
            id: String,
            params: AccountDepositParams,
        ): HttpResponseFor<AccountDepositResponse> = deposit(id, params, RequestOptions.none())

        /** @see deposit */
        @MustBeClosed
        fun deposit(
            id: String,
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDepositResponse> =
            deposit(params.toBuilder().id(id).build(), requestOptions)

        /** @see deposit */
        @MustBeClosed
        fun deposit(params: AccountDepositParams): HttpResponseFor<AccountDepositResponse> =
            deposit(params, RequestOptions.none())

        /** @see deposit */
        @MustBeClosed
        fun deposit(
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDepositResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/transfer`, but is otherwise
         * the same as [AccountService.transfer].
         */
        @MustBeClosed
        fun transfer(
            id: String,
            params: AccountTransferParams,
        ): HttpResponseFor<AccountTransferResponse> = transfer(id, params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            id: String,
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferResponse> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        @MustBeClosed
        fun transfer(params: AccountTransferParams): HttpResponseFor<AccountTransferResponse> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(id: String): HttpResponseFor<Account> =
            updateStatus(id, AccountUpdateStatusParams.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        ): HttpResponseFor<Account> = updateStatus(id, params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(params: AccountUpdateStatusParams): HttpResponseFor<Account> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(id: String, requestOptions: RequestOptions): HttpResponseFor<Account> =
            updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/withdraw`, but is otherwise
         * the same as [AccountService.withdraw].
         */
        @MustBeClosed
        fun withdraw(
            id: String,
            params: AccountWithdrawParams,
        ): HttpResponseFor<AccountWithdrawResponse> = withdraw(id, params, RequestOptions.none())

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            id: String,
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountWithdrawResponse> =
            withdraw(params.toBuilder().id(id).build(), requestOptions)

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(params: AccountWithdrawParams): HttpResponseFor<AccountWithdrawResponse> =
            withdraw(params, RequestOptions.none())

        /** @see withdraw */
        @MustBeClosed
        fun withdraw(
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountWithdrawResponse>
    }
}
