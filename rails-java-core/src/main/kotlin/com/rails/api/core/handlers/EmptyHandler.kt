@file:JvmName("EmptyHandler")

package com.rails.api.core.handlers

import com.rails.api.core.http.HttpResponse
import com.rails.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
