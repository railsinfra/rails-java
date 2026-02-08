// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Create account */
    fun create(params: AccountCreateParams): CompletableFuture<Account> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** Retrieve account */
    fun retrieve(id: String): CompletableFuture<Account> =
        retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<Account> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<Account> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** List accounts */
    fun list(params: AccountListParams): CompletableFuture<List<Account>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Account>>

    /** Close account */
    fun close(id: String): CompletableFuture<Account> = close(id, AccountCloseParams.none())

    /** @see close */
    fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> = close(params.toBuilder().id(id).build(), requestOptions)

    /** @see close */
    fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
    ): CompletableFuture<Account> = close(id, params, RequestOptions.none())

    /** @see close */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see close */
    fun close(params: AccountCloseParams): CompletableFuture<Account> =
        close(params, RequestOptions.none())

    /** @see close */
    fun close(id: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        close(id, AccountCloseParams.none(), requestOptions)

    /** Deposit into account */
    fun deposit(
        id: String,
        params: AccountDepositParams,
    ): CompletableFuture<AccountDepositResponse> = deposit(id, params, RequestOptions.none())

    /** @see deposit */
    fun deposit(
        id: String,
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDepositResponse> =
        deposit(params.toBuilder().id(id).build(), requestOptions)

    /** @see deposit */
    fun deposit(params: AccountDepositParams): CompletableFuture<AccountDepositResponse> =
        deposit(params, RequestOptions.none())

    /** @see deposit */
    fun deposit(
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountDepositResponse>

    /** Transfer between accounts */
    fun transfer(
        id: String,
        params: AccountTransferParams,
    ): CompletableFuture<AccountTransferResponse> = transfer(id, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        id: String,
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferResponse> =
        transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: AccountTransferParams): CompletableFuture<AccountTransferResponse> =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferResponse>

    /** Update account status */
    fun updateStatus(id: String): CompletableFuture<Account> =
        updateStatus(id, AccountUpdateStatusParams.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> = updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
    ): CompletableFuture<Account> = updateStatus(id, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see updateStatus */
    fun updateStatus(params: AccountUpdateStatusParams): CompletableFuture<Account> =
        updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(id: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

    /** Withdraw from account */
    fun withdraw(
        id: String,
        params: AccountWithdrawParams,
    ): CompletableFuture<AccountWithdrawResponse> = withdraw(id, params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        id: String,
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountWithdrawResponse> =
        withdraw(params.toBuilder().id(id).build(), requestOptions)

    /** @see withdraw */
    fun withdraw(params: AccountWithdrawParams): CompletableFuture<AccountWithdrawResponse> =
        withdraw(params, RequestOptions.none())

    /** @see withdraw */
    fun withdraw(
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountWithdrawResponse>

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        fun create(params: AccountCreateParams): CompletableFuture<HttpResponseFor<Account>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see retrieve */
        fun retrieve(params: AccountRetrieveParams): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(params: AccountListParams): CompletableFuture<HttpResponseFor<List<Account>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Account>>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountServiceAsync.close].
         */
        fun close(id: String): CompletableFuture<HttpResponseFor<Account>> =
            close(id, AccountCloseParams.none())

        /** @see close */
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            close(params.toBuilder().id(id).build(), requestOptions)

        /** @see close */
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> = close(id, params, RequestOptions.none())

        /** @see close */
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see close */
        fun close(params: AccountCloseParams): CompletableFuture<HttpResponseFor<Account>> =
            close(params, RequestOptions.none())

        /** @see close */
        fun close(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            close(id, AccountCloseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/deposit`, but is otherwise
         * the same as [AccountServiceAsync.deposit].
         */
        fun deposit(
            id: String,
            params: AccountDepositParams,
        ): CompletableFuture<HttpResponseFor<AccountDepositResponse>> =
            deposit(id, params, RequestOptions.none())

        /** @see deposit */
        fun deposit(
            id: String,
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDepositResponse>> =
            deposit(params.toBuilder().id(id).build(), requestOptions)

        /** @see deposit */
        fun deposit(
            params: AccountDepositParams
        ): CompletableFuture<HttpResponseFor<AccountDepositResponse>> =
            deposit(params, RequestOptions.none())

        /** @see deposit */
        fun deposit(
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountDepositResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/transfer`, but is otherwise
         * the same as [AccountServiceAsync.transfer].
         */
        fun transfer(
            id: String,
            params: AccountTransferParams,
        ): CompletableFuture<HttpResponseFor<AccountTransferResponse>> =
            transfer(id, params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            id: String,
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransferResponse>> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        fun transfer(
            params: AccountTransferParams
        ): CompletableFuture<HttpResponseFor<AccountTransferResponse>> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransferResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountServiceAsync.updateStatus].
         */
        fun updateStatus(id: String): CompletableFuture<HttpResponseFor<Account>> =
            updateStatus(id, AccountUpdateStatusParams.none())

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            updateStatus(id, params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see updateStatus */
        fun updateStatus(
            params: AccountUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<Account>> = updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/withdraw`, but is otherwise
         * the same as [AccountServiceAsync.withdraw].
         */
        fun withdraw(
            id: String,
            params: AccountWithdrawParams,
        ): CompletableFuture<HttpResponseFor<AccountWithdrawResponse>> =
            withdraw(id, params, RequestOptions.none())

        /** @see withdraw */
        fun withdraw(
            id: String,
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountWithdrawResponse>> =
            withdraw(params.toBuilder().id(id).build(), requestOptions)

        /** @see withdraw */
        fun withdraw(
            params: AccountWithdrawParams
        ): CompletableFuture<HttpResponseFor<AccountWithdrawResponse>> =
            withdraw(params, RequestOptions.none())

        /** @see withdraw */
        fun withdraw(
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountWithdrawResponse>>
    }
}
