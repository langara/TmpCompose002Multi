package me.marek.common

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.withTransform

@Composable
fun Example2() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(Color.Magenta)
        inset(10.0f) {
            drawLine(
                start = Offset.Zero,
                end = Offset(size.width, size.height),
                strokeWidth = 5.0f,
                color = Color.Red
            )
        }
        floatArrayOf(0.3f, 0.7f, 1.3f).forEach {
            withTransform({
                translate(10.0f, 12.0f)
                rotate(45f * it)
                scale(it, 1f / it)
            }) {
                drawRect(Color(0f, 0f, 1f, it / 2f))
                drawCircle(Color(1f, 0f, 0f, it / 2f))
            }
        }
    }
}
