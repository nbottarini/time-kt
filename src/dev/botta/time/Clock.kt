package dev.botta.time

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset

object Clock {
    private var stoppedAt: LocalDateTime? = null

    fun today(): LocalDate = stoppedAt?.toLocalDate() ?: LocalDate.now(ZoneOffset.UTC)

    fun now(): LocalDateTime = stoppedAt ?: LocalDateTime.now(ZoneOffset.UTC)

    fun stoppedAt(date: LocalDate) {
        stoppedAt = date.atTime(0, 0, 0, 0)
    }

    fun stoppedAt(date: LocalDateTime) {
        stoppedAt = date
    }

    fun live() {
        stoppedAt = null
    }
}
