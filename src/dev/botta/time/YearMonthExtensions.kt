package dev.botta.time

import java.time.YearMonth
import java.time.format.DateTimeFormatter

fun YearMonth.formatAsISO8601(): String {
    return this.format(DateTimeFormatter.ofPattern("yyyy-MM"))
}
