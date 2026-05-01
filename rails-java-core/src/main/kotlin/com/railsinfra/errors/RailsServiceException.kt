// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.errors

import com.railsinfra.core.JsonValue
import com.railsinfra.core.http.Headers

abstract class RailsServiceException
protected constructor(message: String, cause: Throwable? = null) : RailsException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
