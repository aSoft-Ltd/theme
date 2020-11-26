package tz.co.asoft

import react.RBuilder
import react.RContext

fun <I : Any> RBuilder.ThemeConsumer(context: RContext<ReactTheme<I>>, handler: RBuilder.(ReactTheme<I>) -> Unit) = context.Consumer(handler)
