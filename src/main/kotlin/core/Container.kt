package core

class Container: Widget {
    constructor(child: Widget) {
        child.build()
    }
}