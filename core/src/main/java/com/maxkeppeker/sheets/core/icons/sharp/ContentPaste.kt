package com.maxkeppeker.sheets.core.icons.sharp

import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

public val ContentPaste: ImageVector
    get() {
        if (_contentPaste != null) {
            return _contentPaste!!
        }
        _contentPaste = materialIcon(name = "Sharp.ContentPaste") {
            materialPath {
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-6.18f)
                curveTo(14.4f, 0.84f, 13.3f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(9.6f, 0.84f, 9.18f, 2.0f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 2.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        return _contentPaste!!
    }

private var _contentPaste: ImageVector? = null
