package page

import core.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Home : Widget {
    constructor() {}

    var title: String = "Hello World"

    override fun mounted() {
        super.mounted()
        init()
    }

    private fun init() {
        runBlocking {
            delay(2000)
            setState {
                title = "Hello World, after set state"
            }
        }
    }

    override fun build(): Widget {
        return Container(
            child = Column(
                children = listOf(
                    Text(title),
                    Text("this is kotlin declarative ui application"),
                )
            )
        )
    }
}