import core.Widget
import core.navigation.PageRoute

class Application: Widget {
    constructor(initialRoute: PageRoute) {
        initialRoute.launch()
    }
}