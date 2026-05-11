package com.railsinfra.errors

class RailsIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RailsException(message, cause)
