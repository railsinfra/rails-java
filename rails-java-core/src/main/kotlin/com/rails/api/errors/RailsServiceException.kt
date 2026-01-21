// File generated from our OpenAPI spec by Stainless.

package com.rails.api.errors

import com.rails.api.core.JsonValue
import com.rails.api.core.http.Headers

abstract class RailsServiceException
protected constructor(message: String, cause: Throwable? = null) : RailsException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
