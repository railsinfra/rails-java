// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.accounts.Transaction
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListParams
import com.rails.api.models.transactions.TransactionListResponse
import com.rails.api.models.transactions.TransactionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    fun retrieve(id: String): CompletableFuture<Transaction> =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<Transaction> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): CompletableFuture<Transaction> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Transaction> =
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
    fun listByAccount(accountId: String): CompletableFuture<List<Transaction>> =
        listByAccount(accountId, TransactionListByAccountParams.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Transaction>> =
        listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
    ): CompletableFuture<List<Transaction>> =
        listByAccount(accountId, params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Transaction>>

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams
    ): CompletableFuture<List<Transaction>> = listByAccount(params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Transaction>> =
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
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> =
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
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> =
            listByAccount(accountId, TransactionListByAccountParams.none())

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> =
            listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> =
            listByAccount(accountId, params, RequestOptions.none())

        /** @see listByAccount */
        fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Transaction>>>

        /** @see listByAccount */
        fun listByAccount(
            params: TransactionListByAccountParams
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> =
            listByAccount(params, RequestOptions.none())

        /** @see listByAccount */
        fun listByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Transaction>>> =
            listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)
    }
}
