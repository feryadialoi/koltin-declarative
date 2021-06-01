package core.navigation

import core.Widget

class PageRoute {
    lateinit var widget: Widget

    constructor(widget: Widget) {
        this.widget = widget
    }

    fun launch() {
        widget.mounted()
    }
}