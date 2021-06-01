package core.promise


class Promise<Resolve> {

    var resolve: Resolve? = null
    var reject: Exception? = null


    constructor(handle: (resolve: (Resolve) -> Unit, reject: (Exception) -> Unit) -> Unit) {
        handle(
            { itResolve ->
                Thread.sleep(2000)
                resolve = itResolve
            },
            { itReject ->
                reject = itReject
            }
        )
    }

    fun then(resolve: (Resolve) -> Unit): Promise<Resolve> {
        if (this.reject == null) {
            resolve(this.resolve!!)
        }

        return this
    }

    fun catch(reject: (Exception) -> Unit): Promise<Resolve> {
        if (this.reject != null) {
            println("rejected")
            reject(this.reject!!)
        }

        return this
    }

    fun finally(all: () -> Unit): Promise<Resolve> {
        all()
        return this
    }
}

fun main() {
    Promise<String> { resolve, reject ->
        val error = false
        if (error) {
            reject(Exception("error is true"))
        } else {
            resolve("Hello world")
        }
    }
        .then { result ->
            println(result)
        }
        .catch { error ->
            println(error)
        }
        .finally {
            println("finally ")
        }

    println("after run promise")
}