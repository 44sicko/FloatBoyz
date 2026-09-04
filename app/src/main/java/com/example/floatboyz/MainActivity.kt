package com.example.floatboyz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.floatboyz.ui.theme.FloatBoyzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloatBoyzTheme {
                AppNavegacao()
            }
        }
    }
}

@Composable
fun AppNavegacao() {
    var paginaAtual by remember { mutableIntStateOf(1) }
    val totalPaginas = 4

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F9FA))
    ) {
        when (paginaAtual) {
            1 -> Pagina1()
            2 -> Pagina2()
            3 -> Pagina3()
            4 -> Pagina4()
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "$paginaAtual / $totalPaginas",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6C757D)
            )

            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1B4D3E)),
                onClick = {
                    if (paginaAtual < totalPaginas) paginaAtual++ else paginaAtual = 1
                }
            ) {
                Text(
                    text = if (paginaAtual < totalPaginas) "Próximo" else "Recomeçar",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun Pagina1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 28.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "FloatBoyz",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B4D3E)
        )

        Text(
            text = "DESENVOLVIMENTO MOBILE",
            fontSize = 12.sp,
            color = Color(0xFF6C757D),
            modifier = Modifier.padding(top = 4.dp, bottom = 28.dp)
        )

        Text(
            text = "\"Você deve aproveitar os pequenos desvios pelo caminho. Ao máximo. Porque é neles que você vai encontrar as coisas mais importantes do que aquilo que você queria.\"",
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            color = Color(0xFF2B2D42),
            textAlign = TextAlign.Center,
            lineHeight = 22.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Text(
            text = "— Ging Freecss",
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF6C757D),
            modifier = Modifier.padding(top = 8.dp, bottom = 36.dp)
        )

        Text(
            text = "INTEGRANTES",
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.5.sp,
            color = Color(0xFF1B4D3E),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Matheus de Freitas Finotti",
            fontSize = 15.sp,
            color = Color(0xFF2B2D42),
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Murillo Rangel Fraga de Jesus",
            fontSize = 15.sp,
            color = Color(0xFF2B2D42),
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun Pagina2() {

}

@Composable
fun Pagina3() {

}

@Composable
fun Pagina4() {
}