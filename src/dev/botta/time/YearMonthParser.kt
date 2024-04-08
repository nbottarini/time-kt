package dev.botta.time

import java.time.YearMonth
import java.time.format.DateTimeFormatter

class YearMonthParser {
    fun parseISO8601(value: String): YearMonth = YearMonth.parse(value, DateTimeFormatter.ofPattern("yyyy-MM"))
}
