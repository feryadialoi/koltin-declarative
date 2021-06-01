package core

open class Widget {
    open fun mounted() {
        build()
    }

    open fun setState(onSetState: () -> Unit) {
        onSetState()
        build()
    }

    open fun build(): Widget {
        return this
    }
}