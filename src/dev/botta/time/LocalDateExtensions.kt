package dev.botta.time

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun LocalDate.formatAsISO8601(): String {
    return this.format(DateTimeFormatter.ISO_LOCAL_DATE)
}
