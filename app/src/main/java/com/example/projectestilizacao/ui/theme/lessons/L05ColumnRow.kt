package com.example.projectestilizacao.ui.theme.lessons

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.projectestilizacao.enums.ArrangementOption
import com.example.projectestilizacao.ui.theme.ProjectEstilizacaoTheme
import com.example.projectestilizacao.ui.theme.components.Caixa

@Composable
fun L05ColumnRow(
) {

    var arrangement by remember { mutableStateOf(ArrangementOption.START) }
    LessonScaffold(
        title = "Column e Row",
        notice = "As três caixas estão numa Row. 'arrangement' muda como o espaço " +
                "horizontal é distribuído; 'alignment' encosta as caixas no topo, no " +
                "meio ou na base. A Column faria o mesmo, só que na vertical.",
    ) {
        Text(
            text = "Teste"
        )
        Caixa("TESTE CAIXA")
    }

}

@Preview(showBackground = true)
@Composable
private fun L05ColumnRowPreview() {
    ProjectEstilizacaoTheme {
        L05ColumnRow()
    }
}