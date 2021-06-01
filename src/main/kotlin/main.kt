import core.App
import core.navigation.PageRoute
import page.Home

fun main() {
    App().runApp(
        Application(
            initialRoute = PageRoute(Home())
        )
    )

}

