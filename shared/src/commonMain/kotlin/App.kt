import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun App() {
    UserHead("SS", Color.LightGray)
}

expect fun getPlatformName(): String