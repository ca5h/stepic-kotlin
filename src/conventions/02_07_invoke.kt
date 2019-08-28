package conventions

//Implement the function Invokable.invoke() so it would count a number of invocations.

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
}

fun invokeTwice(invokable: Invokable) = invokable()()