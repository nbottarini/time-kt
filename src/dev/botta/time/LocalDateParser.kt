package dev.botta.time

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class LocalDateParser {
    fun parseISO8601(value: String): LocalDate = LocalDate.parse(value, DateTimeFormatter.ISO_DATE)

    fun parse(value: String, pattern: String): LocalDate = LocalDate.parse(value, DateTimeFormatter.ofPattern(pattern))

    fun parse(value: String, formatter: DateTimeFormatter): LocalDate = LocalDate.parse(value, formatter)
}
