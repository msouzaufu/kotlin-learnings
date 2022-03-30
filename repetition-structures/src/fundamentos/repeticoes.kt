package fundamentos

fun main() {
//    printNumbersIncrease()
//    printNumbersDecrease()
//    printPairOneToTen()
//    printRange(5, 15)
    whileSmallerTen()
}


fun whileSmallerTen() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

fun printNumbersIncrease() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun printNumbersDecrease() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printPairOneToTen() {
    for (numero in 2..10 step 2) {
        println(numero)
    }
}

fun printRange(start: Int, end: Int) {
    for (numero in start..end) {
        println(numero)
    }
}