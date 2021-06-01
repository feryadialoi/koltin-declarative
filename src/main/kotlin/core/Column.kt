package core

class Column: Widget {
    constructor(children: List<Widget>) {
        children.forEach { child ->
            child.build()
        }
    }
}