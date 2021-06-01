package core

class Button: Widget {
    var child: Widget
    var onClick: () -> Unit

    constructor(child: Widget, onClick: () -> Unit){
        this.child = child
        this.onClick = onClick
    }
}