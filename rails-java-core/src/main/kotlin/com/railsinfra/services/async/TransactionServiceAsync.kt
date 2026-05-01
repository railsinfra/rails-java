// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
import com.railsinfra.core.http.HttpResponseFor
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListByAccountResponse
import com.railsinfra.models.transactions.TransactionListParams
import com.railsinfra.models.transactions.TransactionListResponse
import com.railsinfra.models.transactions.TransactionRetrieveParams
import com.railsinfra.models.transactions.TransactionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Transactions */
interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync

    /** Retrieve transaction */
    fun retrieve(id: String): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<TransactionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams
    ): CompletableFuture<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** List transactions by organization */
    fun list(params: TransactionListParams): CompletableFuture<TransactionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListResponse>

    /** List account transactions */
    fun listByAccount(
        accountId: String
    ): CompletableFuture<List<TransactionListByAccountResponse>> =
        listByAccount(accountId, TransactionListByAccountParams.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TransactionListByAccountResponse>> =
        listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
    ): CompletableFuture<List<TransactionListByAccountResponse>> =
        listByAccount(accountId, params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TransactionListByAccountResponse>>

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams
    ): CompletableFuture<List<TransactionListByAccountResponse>> =
        listByAccount(params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TransactionListByAccountResponse>> =
        listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions/{id}`, but is otherwise the
         * same as [TransactionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        fun list(
            params: TransactionListParams
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{account_id}/transactions`, but is
         * otherwise the same as [TransactionServiceAsync.listByAccount].
         */
        fun listByAccount(
            accountId: String
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>> =
            listByAccount(accountId, TransactionListByAccountParams.none())

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>> =
            listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>> =
            listByAccount(accountId, params, RequestOptions.none())

        /** @see listByAccount */
        fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>>

        /** @see listByAccount */
        fun listByAccount(
            params: TransactionListByAccountParams
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>> =
            listByAccount(params, RequestOptions.none())

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TransactionListByAccountResponse>>> =
            listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)
    }
}
