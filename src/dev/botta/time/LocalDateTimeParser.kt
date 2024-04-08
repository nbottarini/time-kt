package dev.botta.time

import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class LocalDateTimeParser {
    fun parseISO8601(value: String, localOffset: ZoneOffset = ZoneOffset.UTC): LocalDateTime {
        return OffsetDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME)
            .withOffsetSameInstant(localOffset)
            .toLocalDateTime()
    }

    fun parse(value: String, pattern: String): LocalDateTime = LocalDateTime.parse(value, DateTimeFormatter.ofPattern(pattern))
}
