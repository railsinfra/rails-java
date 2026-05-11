package com.railsinfra.errors

class RailsInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RailsException(message, cause)
