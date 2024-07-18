//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val max = 42
    val factNumber = 13
    val lambdaNumber = 7
    val recursiveNumber = 9

    // Define a lambda
    val factorialLamda: (Int) -> Long = { n ->
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        result
    }

    val sumResult = sumTo(max)
    println("Sum from 1 to $max is $sumResult")

    val facResult = factorial(factNumber)
    println("Factorial of $factNumber is $facResult")

    val lambdaResult = factorialLamda(lambdaNumber)
    println("Factorial of Lambda function $lambdaNumber is $lambdaResult")

    val recursiveResult = factorialRecursive(recursiveNumber)
    println("Factorial of Recursive function $recursiveNumber is $recursiveResult")
}

fun sumTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}

fun factorial(n: Int): Long {
    var fact = 1L
    for (i in 1..n) {
        fact *= i
    }
    return fact
}

fun factorialRecursive(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorialRecursive(n - 1)
    }
    }