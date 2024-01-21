/*
 * Copyright (c) 2023, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation.mapper

import com.glassdoor.intern.domain.model.HeaderInfo
import com.glassdoor.intern.presentation.model.HeaderUiModel
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.inject.Inject

private const val DATE_FORMAT_PATTERN: String = "yyyy-MM-dd HH:mm"
internal class HeaderUiModelMapper @Inject constructor() {


    //DONE: ("Define date formatting pattern")
    private val dateFormatter: DateTimeFormatter = DateTimeFormatter
        .ofPattern(DATE_FORMAT_PATTERN)
        .withZone(ZoneId.systemDefault())

    fun toUiModel(headerInfo: HeaderInfo): HeaderUiModel = with(headerInfo) {
        //DONE("Convert domain model to UI model")
        HeaderUiModel(
            title = title,
            description = description,
            timestamp = Instant.ofEpochSecond(timestampInSeconds).let(dateFormatter::format)
        )
    }
}
