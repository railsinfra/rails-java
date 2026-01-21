// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.accounts.AccountCloseParams
import com.rails.api.models.accounts.AccountCloseResponse
import com.rails.api.models.accounts.AccountCreateParams
import com.rails.api.models.accounts.AccountCreateResponse
import com.rails.api.models.accounts.AccountDepositParams
import com.rails.api.models.accounts.AccountDepositResponse
import com.rails.api.models.accounts.AccountListParams
import com.rails.api.models.accounts.AccountListResponse
import com.rails.api.models.accounts.AccountRetrieveParams
import com.rails.api.models.accounts.AccountRetrieveResponse
import com.rails.api.models.accounts.AccountTransferParams
import com.rails.api.models.accounts.AccountTransferResponse
import com.rails.api.models.accounts.AccountUpdateStatusParams
import com.rails.api.models.accounts.AccountUpdateStatusResponse
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
    fun create(params: AccountCreateParams): CompletableFuture<AccountCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCreateResponse>

    /** Retrieve account */
    fun retrieve(id: String): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<AccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** List accounts */
    fun list(params: AccountListParams): CompletableFuture<List<AccountListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AccountListResponse>>

    /** Close account */
    fun close(id: String): CompletableFuture<AccountCloseResponse> =
        close(id, AccountCloseParams.none())

    /** @see close */
    fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCloseResponse> =
        close(params.toBuilder().id(id).build(), requestOptions)

    /** @see close */
    fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
    ): CompletableFuture<AccountCloseResponse> = close(id, params, RequestOptions.none())

    /** @see close */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCloseResponse>

    /** @see close */
    fun close(params: AccountCloseParams): CompletableFuture<AccountCloseResponse> =
        close(params, RequestOptions.none())

    /** @see close */
    fun close(id: String, requestOptions: RequestOptions): CompletableFuture<AccountCloseResponse> =
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
    fun updateStatus(id: String): CompletableFuture<AccountUpdateStatusResponse> =
        updateStatus(id, AccountUpdateStatusParams.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUpdateStatusResponse> =
        updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
    ): CompletableFuture<AccountUpdateStatusResponse> =
        updateStatus(id, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUpdateStatusResponse>

    /** @see updateStatus */
    fun updateStatus(
        params: AccountUpdateStatusParams
    ): CompletableFuture<AccountUpdateStatusResponse> = updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountUpdateStatusResponse> =
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
        fun create(
            params: AccountCreateParams
        ): CompletableFuture<HttpResponseFor<AccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(
            params: AccountListParams
        ): CompletableFuture<HttpResponseFor<List<AccountListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AccountListResponse>>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountServiceAsync.close].
         */
        fun close(id: String): CompletableFuture<HttpResponseFor<AccountCloseResponse>> =
            close(id, AccountCloseParams.none())

        /** @see close */
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCloseResponse>> =
            close(params.toBuilder().id(id).build(), requestOptions)

        /** @see close */
        fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountCloseResponse>> =
            close(id, params, RequestOptions.none())

        /** @see close */
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCloseResponse>>

        /** @see close */
        fun close(
            params: AccountCloseParams
        ): CompletableFuture<HttpResponseFor<AccountCloseResponse>> =
            close(params, RequestOptions.none())

        /** @see close */
        fun close(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountCloseResponse>> =
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
        fun updateStatus(
            id: String
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>> =
            updateStatus(id, AccountUpdateStatusParams.none())

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>> =
            updateStatus(id, params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>>

        /** @see updateStatus */
        fun updateStatus(
            params: AccountUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountUpdateStatusResponse>> =
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
