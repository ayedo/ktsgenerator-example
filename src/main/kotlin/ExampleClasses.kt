package ch.ayedo.ktsgeneratorexample

import java.math.BigDecimal
import java.net.URL
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

data class TestOP(
    val testId: UUID,
    val age: Int,
    val date: LocalDate,
    val time: LocalTime,
    val url: URL,
    val bigDecimal: BigDecimal
)

data class TestIP(
    val testId: UUID,
    val age: Int,
    val date: LocalDate,
    val time: LocalTime,
    val url: URL,
    val bigDecimal: BigDecimal
)

data class NotGeneratedBecauseOfPostfix(
    val ignore: String
)
