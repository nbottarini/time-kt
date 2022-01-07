package com.nbottarini.asimov.time

fun <T> timed(block: () -> T): T {
    val result = block()
    Clock.stoppedAt(Clock.now().plusSeconds(1))
    return result
}
