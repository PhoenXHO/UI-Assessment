package com.test.technicalassessment.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

// This file is generated. Do not edit manually.

public val arrowBackIOSNew: ImageVector
    get() {
        if (_arrowBack != null) {
            return _arrowBack!!
        }
        _arrowBack = ImageVector.Builder(
            name = "Arrow_back_ios_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(382f, 480f)
                lineToRelative(294f, 294f)
                quadToRelative(15f, 15f, 14.5f, 35f)
                reflectiveQuadTo(675f, 844f)
                reflectiveQuadToRelative(-35f, 15f)
                reflectiveQuadToRelative(-35f, -15f)
                lineTo(297f, 537f)
                quadToRelative(-12f, -12f, -18f, -27f)
                reflectiveQuadToRelative(-6f, -30f)
                reflectiveQuadToRelative(6f, -30f)
                reflectiveQuadToRelative(18f, -27f)
                lineToRelative(308f, -308f)
                quadToRelative(15f, -15f, 35.5f, -14.5f)
                reflectiveQuadTo(676f, 116f)
                reflectiveQuadToRelative(15f, 35f)
                reflectiveQuadToRelative(-15f, 35f)
                close()
            }
        }.build()
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null