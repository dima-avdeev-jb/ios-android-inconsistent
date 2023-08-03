import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    MaterialTheme {
        Box(modifier = Modifier.size(100.dp), Alignment.Center) {
            CircleWithText()
        }
    }
}

@Composable
fun CircleWithText() {
    Box(Modifier.size(24.dp), contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(SolidColor(Color.Gray))
        }
        Text(
            text = "AB",
            color = Color.White,
            fontSize = 10.sp,
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center,
        )
    }
}
