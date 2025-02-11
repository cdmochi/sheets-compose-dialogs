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
package com.maxkeppeler.sheets.duration.views


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.maxkeppeker.sheets.core.models.base.LibOrientation
import com.maxkeppeker.sheets.core.views.Grid
import com.maxkeppeler.sheets.duration.models.DurationConfig
import com.maxkeppeler.sheets.duration.utils.Constants

/**
 * The keyboard component that is used to input the clock time.
 * @param config The general configuration for the dialog view.
 * @param keys A list of keys that will be displayed.
 * @param onEnterValue The listener that is invoked when a value was clicked.
 * @param onBackspaceAction The listener that is invoked when [Constants.ACTION_BACKSPACE] was clicked.
 * @param onEmptyAction The listener that is invoked when [Constants.ACTION_CLEAR] was clicked.
 */
@Composable
internal fun KeyboardComponent(
    modifier: Modifier,
    config: DurationConfig,
    keys: List<String>,
    orientation: LibOrientation,
    onEnterValue: (String) -> Unit,
    onBackspaceAction: () -> Unit,
    onEmptyAction: () -> Unit
) {
    Grid(
        modifier = modifier,
        items = keys,
        columns = Constants.KEYBOARD_COLUMNS,
        rowSpacing = 8.dp,
        columnSpacing = 8.dp,
        itemView = { key ->
            KeyItemComponent(
                config = config,
                key = key,
                orientation = orientation,
                onBackspaceAction = onBackspaceAction,
                onEmptyAction = onEmptyAction,
                onEnterValue = onEnterValue
            )
        }
    )
}
