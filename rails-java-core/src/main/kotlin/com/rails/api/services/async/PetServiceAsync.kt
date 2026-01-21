// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponse
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.pet.Pet
import com.rails.api.models.pet.PetCreateParams
import com.rails.api.models.pet.PetDeleteParams
import com.rails.api.models.pet.PetFindByStatusParams
import com.rails.api.models.pet.PetFindByTagsParams
import com.rails.api.models.pet.PetRetrieveParams
import com.rails.api.models.pet.PetUpdateParams
import com.rails.api.models.pet.PetUpdateWithFormDataParams
import com.rails.api.models.pet.PetUploadImageParams
import com.rails.api.models.pet.PetUploadImageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PetServiceAsync

    /** Add a new pet to the store */
    fun create(params: PetCreateParams): CompletableFuture<Pet> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** @see create */
    fun create(
        pet: Pet,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet> = create(PetCreateParams.builder().pet(pet).build(), requestOptions)

    /** @see create */
    fun create(pet: Pet): CompletableFuture<Pet> = create(pet, RequestOptions.none())

    /** Returns a single pet */
    fun retrieve(petId: Long): CompletableFuture<Pet> = retrieve(petId, PetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet> = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
    ): CompletableFuture<Pet> = retrieve(petId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** @see retrieve */
    fun retrieve(params: PetRetrieveParams): CompletableFuture<Pet> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(petId: Long, requestOptions: RequestOptions): CompletableFuture<Pet> =
        retrieve(petId, PetRetrieveParams.none(), requestOptions)

    /** Update an existing pet by Id */
    fun update(params: PetUpdateParams): CompletableFuture<Pet> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet>

    /** @see update */
    fun update(
        pet: Pet,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pet> = update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

    /** @see update */
    fun update(pet: Pet): CompletableFuture<Pet> = update(pet, RequestOptions.none())

    /** delete a pet */
    fun delete(petId: Long): CompletableFuture<Void?> = delete(petId, PetDeleteParams.none())

    /** @see delete */
    fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see delete */
    fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(petId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PetDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(petId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(petId, PetDeleteParams.none(), requestOptions)

    /** Multiple status values can be provided with comma separated strings */
    fun findByStatus(): CompletableFuture<List<Pet>> = findByStatus(PetFindByStatusParams.none())

    /** @see findByStatus */
    fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Pet>>

    /** @see findByStatus */
    fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none()
    ): CompletableFuture<List<Pet>> = findByStatus(params, RequestOptions.none())

    /** @see findByStatus */
    fun findByStatus(requestOptions: RequestOptions): CompletableFuture<List<Pet>> =
        findByStatus(PetFindByStatusParams.none(), requestOptions)

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    fun findByTags(): CompletableFuture<List<Pet>> = findByTags(PetFindByTagsParams.none())

    /** @see findByTags */
    fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Pet>>

    /** @see findByTags */
    fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none()
    ): CompletableFuture<List<Pet>> = findByTags(params, RequestOptions.none())

    /** @see findByTags */
    fun findByTags(requestOptions: RequestOptions): CompletableFuture<List<Pet>> =
        findByTags(PetFindByTagsParams.none(), requestOptions)

    /** Updates a pet in the store with form data */
    fun updateWithFormData(petId: Long): CompletableFuture<Void?> =
        updateWithFormData(petId, PetUpdateWithFormDataParams.none())

    /** @see updateWithFormData */
    fun updateWithFormData(
        petId: Long,
        params: PetUpdateWithFormDataParams = PetUpdateWithFormDataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateWithFormData(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see updateWithFormData */
    fun updateWithFormData(
        petId: Long,
        params: PetUpdateWithFormDataParams = PetUpdateWithFormDataParams.none(),
    ): CompletableFuture<Void?> = updateWithFormData(petId, params, RequestOptions.none())

    /** @see updateWithFormData */
    fun updateWithFormData(
        params: PetUpdateWithFormDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateWithFormData */
    fun updateWithFormData(params: PetUpdateWithFormDataParams): CompletableFuture<Void?> =
        updateWithFormData(params, RequestOptions.none())

    /** @see updateWithFormData */
    fun updateWithFormData(petId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        updateWithFormData(petId, PetUpdateWithFormDataParams.none(), requestOptions)

    /** uploads an image */
    fun uploadImage(petId: Long, body: String): CompletableFuture<PetUploadImageResponse> =
        uploadImage(petId, body, PetUploadImageParams.none())

    /** @see uploadImage */
    fun uploadImage(
        petId: Long,
        body: String,
        params: PetUploadImageParams = PetUploadImageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PetUploadImageResponse> =
        uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

    /** @see uploadImage */
    fun uploadImage(
        petId: Long,
        body: String,
        params: PetUploadImageParams = PetUploadImageParams.none(),
    ): CompletableFuture<PetUploadImageResponse> =
        uploadImage(petId, body, params, RequestOptions.none())

    /** @see uploadImage */
    fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PetUploadImageResponse>

    /** @see uploadImage */
    fun uploadImage(params: PetUploadImageParams): CompletableFuture<PetUploadImageResponse> =
        uploadImage(params, RequestOptions.none())

    /** @see uploadImage */
    fun uploadImage(
        petId: Long,
        body: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PetUploadImageResponse> =
        uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)

    /** A view of [PetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pet`, but is otherwise the same as
         * [PetServiceAsync.create].
         */
        fun create(params: PetCreateParams): CompletableFuture<HttpResponseFor<Pet>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /** @see create */
        fun create(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> =
            create(PetCreateParams.builder().pet(pet).build(), requestOptions)

        /** @see create */
        fun create(pet: Pet): CompletableFuture<HttpResponseFor<Pet>> =
            create(pet, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.retrieve].
         */
        fun retrieve(petId: Long): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(petId, PetRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> = retrieve(petId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /** @see retrieve */
        fun retrieve(params: PetRetrieveParams): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            petId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pet>> =
            retrieve(petId, PetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /pet`, but is otherwise the same as
         * [PetServiceAsync.update].
         */
        fun update(params: PetUpdateParams): CompletableFuture<HttpResponseFor<Pet>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>>

        /** @see update */
        fun update(
            pet: Pet,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pet>> =
            update(PetUpdateParams.builder().pet(pet).build(), requestOptions)

        /** @see update */
        fun update(pet: Pet): CompletableFuture<HttpResponseFor<Pet>> =
            update(pet, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.delete].
         */
        fun delete(petId: Long): CompletableFuture<HttpResponse> =
            delete(petId, PetDeleteParams.none())

        /** @see delete */
        fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see delete */
        fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(petId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PetDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(petId: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(petId, PetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByStatus`, but is otherwise the same as
         * [PetServiceAsync.findByStatus].
         */
        fun findByStatus(): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(PetFindByStatusParams.none())

        /** @see findByStatus */
        fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Pet>>>

        /** @see findByStatus */
        fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none()
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(params, RequestOptions.none())

        /** @see findByStatus */
        fun findByStatus(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByStatus(PetFindByStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByTags`, but is otherwise the same as
         * [PetServiceAsync.findByTags].
         */
        fun findByTags(): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByTags(PetFindByTagsParams.none())

        /** @see findByTags */
        fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Pet>>>

        /** @see findByTags */
        fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none()
        ): CompletableFuture<HttpResponseFor<List<Pet>>> = findByTags(params, RequestOptions.none())

        /** @see findByTags */
        fun findByTags(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Pet>>> =
            findByTags(PetFindByTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.updateWithFormData].
         */
        fun updateWithFormData(petId: Long): CompletableFuture<HttpResponse> =
            updateWithFormData(petId, PetUpdateWithFormDataParams.none())

        /** @see updateWithFormData */
        fun updateWithFormData(
            petId: Long,
            params: PetUpdateWithFormDataParams = PetUpdateWithFormDataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateWithFormData(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see updateWithFormData */
        fun updateWithFormData(
            petId: Long,
            params: PetUpdateWithFormDataParams = PetUpdateWithFormDataParams.none(),
        ): CompletableFuture<HttpResponse> =
            updateWithFormData(petId, params, RequestOptions.none())

        /** @see updateWithFormData */
        fun updateWithFormData(
            params: PetUpdateWithFormDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateWithFormData */
        fun updateWithFormData(
            params: PetUpdateWithFormDataParams
        ): CompletableFuture<HttpResponse> = updateWithFormData(params, RequestOptions.none())

        /** @see updateWithFormData */
        fun updateWithFormData(
            petId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            updateWithFormData(petId, PetUpdateWithFormDataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}/uploadImage`, but is otherwise the
         * same as [PetServiceAsync.uploadImage].
         */
        fun uploadImage(
            petId: Long,
            body: String,
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, body, PetUploadImageParams.none())

        /** @see uploadImage */
        fun uploadImage(
            petId: Long,
            body: String,
            params: PetUploadImageParams = PetUploadImageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(params.toBuilder().petId(petId).body(body).build(), requestOptions)

        /** @see uploadImage */
        fun uploadImage(
            petId: Long,
            body: String,
            params: PetUploadImageParams = PetUploadImageParams.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, body, params, RequestOptions.none())

        /** @see uploadImage */
        fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>>

        /** @see uploadImage */
        fun uploadImage(
            params: PetUploadImageParams
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(params, RequestOptions.none())

        /** @see uploadImage */
        fun uploadImage(
            petId: Long,
            body: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PetUploadImageResponse>> =
            uploadImage(petId, body, PetUploadImageParams.none(), requestOptions)
    }
}
