import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable


fun main() {
    var platform by mutableStateOf("Compose Web!")
    var bgColor by mutableStateOf(Color("#003244"))

    renderComposable(rootElementId = "root") {
        // main div
        Div({
            style {
                padding(25.px)
                backgroundColor(bgColor)
            }
        }) {


            H1({
                style {
                    color(Color("white")) // White text
                }
            }) {
                Text("Hello $platform")
            }

            Button(attrs = {
                // Click listener
                onClick {
                    platform = "Chrome Extension!" // Changing text
                    bgColor = Color("#00F488") // Changing background color to green
                }
            }) {
                Text("Click Me!")
            }
        }
    }
}
