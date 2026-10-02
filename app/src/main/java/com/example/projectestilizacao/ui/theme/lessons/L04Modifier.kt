package com.example.projectestilizacao.ui.theme.lessons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.projectestilizacao.ui.theme.ProjectEstilizacaoTheme
import com.example.projectestilizacao.ui.theme.components.ModifierDemo
import com.example.projectestilizacao.ui.theme.lesson.SliderControl
import com.example.projectestilizacao.ui.theme.lesson.SwitchControl
import kotlin.math.roundToInt

@Composable
fun L04Modifier(modifier: Modifier = Modifier) {
    var padding by remember { mutableStateOf(16f) }
    var fillWidth by remember { mutableStateOf(false)}
    LessonScaffold(
        title = "Modifier",
        notice = "As duas caixas usam os mesmos modificadores — só a ordem muda. " +
                "Aumente o padding e repare que na primeira a cor encolhe, e na " +
                "segunda a cor fica e o texto é que se afasta.",
        controls = {
            SliderControl(
                label = "padding",
                value = padding,
                onValueChange = {padding = it},
                range = 0.0f..48.0f
            )
            SwitchControl(
                label = "fillMaxWidth()",
                checked = fillWidth,
                onCheckedChange = {fillWidth = it}
            )
        }
    ) {
        ModifierDemo(
            padding = padding.roundToInt().dp,
            fillWidth = fillWidth
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun L04ModifierPreview() {
    ProjectEstilizacaoTheme() {

        L04Modifier()
    }
}