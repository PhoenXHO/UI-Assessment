package com.test.technicalassessment.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val patchExclamation: ImageVector
    get() {
        if (_patchExclamation != null) {
            return _patchExclamation!!
        }
        _patchExclamation = ImageVector.Builder(
            name = "PatchExclamation",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.001f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.553f, 0.553f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.273f, 2.513f)
                lineToRelative(-0.921f, -0.944f)
                lineToRelative(0.715f, -0.698f)
                lineToRelative(0.622f, 0.637f)
                lineToRelative(0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.924f, 2.924f)
                lineToRelative(-0.01f, 0.89f)
                lineToRelative(0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.134f)
                lineToRelative(-0.637f, 0.622f)
                lineToRelative(0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.924f, 2.924f)
                lineToRelative(-0.89f, -0.01f)
                lineToRelative(-0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.134f, 0f)
                lineToRelative(-0.622f, -0.637f)
                lineToRelative(-0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.924f, -2.924f)
                lineToRelative(0.01f, -0.89f)
                lineToRelative(-0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.134f)
                lineToRelative(0.637f, -0.622f)
                lineToRelative(-0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.924f, -2.924f)
                lineToRelative(0.89f, 0.01f)
                lineToRelative(0.622f, -0.636f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.134f, 0f)
                lineToRelative(-0.715f, 0.698f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.704f, 0f)
                lineToRelative(-0.92f, 0.944f)
                lineToRelative(-1.32f, -0.016f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.911f, 1.912f)
                lineToRelative(0.016f, 1.318f)
                lineToRelative(-0.944f, 0.921f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.704f)
                lineToRelative(0.944f, 0.92f)
                lineToRelative(-0.016f, 1.32f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.912f, 1.911f)
                lineToRelative(1.318f, -0.016f)
                lineToRelative(0.921f, 0.944f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.704f, 0f)
                lineToRelative(0.92f, -0.944f)
                lineToRelative(1.32f, 0.016f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.911f, -1.912f)
                lineToRelative(-0.016f, -1.318f)
                lineToRelative(0.944f, -0.921f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.704f)
                lineToRelative(-0.944f, -0.92f)
                lineToRelative(0.016f, -1.32f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.912f, -1.911f)
                close()
            }
        }.build()
        return _patchExclamation!!
    }

private var _patchExclamation: ImageVector? = null
