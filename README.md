[![Maven](https://img.shields.io/maven-central/v/com.nbottarini/asimov-time.svg)](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.nbottarini%22%20AND%20a%3A%22asimov-time%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![CI Status](https://github.com/nbottarini/asimov-time-kt/actions/workflows/gradle.yml/badge.svg?branch=main)](https://github.com/nbottarini/asimov-time-kt/actions?query=branch%3Amain+workflow%3Aci)

# asimov/time
Useful time and date related functions and extensions.

## Installation

#### Gradle (Kotlin)

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.nbottarini:asimov-time:0.5")
}
```

#### Gradle (Groovy)

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation 'com.nbottarini:asimov-time:0.5'
}
```

#### Maven

```xml
<dependency>
    <groupId>com.nbottarini</groupId>
    <artifactId>asimov-time</artifactId>
    <version>0.5</version>
</dependency>
```

## Usage

### Extensions

```kotlin
    yearMonth.formatAsISO8601() // Formats a year month in ISO-8601. Ex: 2020-06
    localDate.formatAsISO8601() // Formats date in ISO-8601. Ex: 2020-06-09
    localDateTime.formatAsISO8601() // Formats date time in ISO-8601. Ex: 2020-06-09T22:10:05Z
```

### Parsers

```kotlin
    LocalDateParser().parseISO8601("2020-06-09") // returns LocalDate
    LocalDateParser().parse("09/06/2020", "d/M/yyyy") // returns LocalDate
    
    LocalDateTimeParser().parseISO8601("2020-06-09T22:10:05Z") // returns LocalDateTime
    LocalDateTimeParser().parseISO8601("2020-06-09T22:10:05-03:00") // returns LocalDateTime in UTC
    LocalDateTimeParser().parseISO8601("2020-06-09T22:10:05-03:00", ZoneOffset.UTC) // returns LocalDateTime in UTC

    YearMonthParser().parseISO8601("2020-06") // returns YearMonth
```

### Clock

Provides a central clock to use in your code. The clock can be stopped to control time in tests.

```kotlin
    Clock.now() // returns LocalDateTime with current date and time in UTC
    Clock.today() // returns LocalDate with current date
    Clock.stoppedAt(someDate) // Stops clock at given date with time 00:00:00
    Clock.stoppedAt(someDateTime) // Stops clock at given time
    Clock.live() // Sets the clock to have live time again
```

It also comes with a timed function to use in tests. The timed function receives and executes a lambda. 
It stops the clock and makes it advance 1 second with each call. This function helps to make tests that depends on time 
to be deterministic.

```kotlin
    timed { someAction() }
    timed { someOtherAction() } // Time passes on each call
```
