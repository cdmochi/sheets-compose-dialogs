/*
 *  Copyright (C) 2022-2023. Maximilian Keppeler (https://www.maxkeppeler.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.maxkeppeler.sheets.date_time.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import com.maxkeppeler.sheets.core.R as RC

/**
 * A component that displays a character of the date pattern.
 * @param text The character that was found in the date pattern.
 */
@Composable
internal fun PickerDateCharacterComponent(text: String) {
    Text(
        modifier = Modifier
            .clip(MaterialTheme.shapes.extraSmall)
            .padding(start = dimensionResource(RC.dimen.scd_small_25))
            .padding(bottom = dimensionResource(RC.dimen.scd_normal_150))
            .padding(end = dimensionResource(RC.dimen.scd_small_100)),
        text = text
    )
}
