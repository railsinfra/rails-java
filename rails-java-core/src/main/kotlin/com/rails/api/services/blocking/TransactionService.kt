// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListByAccountResponse
import com.rails.api.models.transactions.TransactionListParams
import com.rails.api.models.transactions.TransactionListResponse
import com.rails.api.models.transactions.TransactionRetrieveParams
import com.rails.api.models.transactions.TransactionRetrieveResponse
import java.util.function.Consumer

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService

    /** Retrieve transaction */
    fun retrieve(id: String): TransactionRetrieveResponse =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): TransactionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): TransactionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TransactionRetrieveResponse =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** List transactions by organization */
    fun list(params: TransactionListParams): TransactionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListResponse

    /** List account transactions */
    fun listByAccount(accountId: String): List<TransactionListByAccountResponse> =
        listByAccount(accountId, TransactionListByAccountParams.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransactionListByAccountResponse> =
        listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
    ): List<TransactionListByAccountResponse> =
        listByAccount(accountId, params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransactionListByAccountResponse>

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams
    ): List<TransactionListByAccountResponse> = listByAccount(params, RequestOptions.none())

    /** @see listByAccount */
    fun listByAccount(
        accountId: String,
        requestOptions: RequestOptions,
    ): List<TransactionListByAccountResponse> =
        listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions/{id}`, but is otherwise the
         * same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams
        ): HttpResponseFor<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(params: TransactionListParams): HttpResponseFor<TransactionListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{account_id}/transactions`, but is
         * otherwise the same as [TransactionService.listByAccount].
         */
        @MustBeClosed
        fun listByAccount(
            accountId: String
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(accountId, TransactionListByAccountParams.none())

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(accountId, params, RequestOptions.none())

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransactionListByAccountResponse>>

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            params: TransactionListByAccountParams
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(params, RequestOptions.none())

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)
    }
}
