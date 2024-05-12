package cn.shithub.java2kotlin

fun main() {
    val s = whenTest(3)
    println(s)
    rangeTest()
    whileTest()
}

fun whenTest(i: Int): String {
    val res = when {
        i % 2 == 0 -> "even"
        else -> "odd"
    }
    return res
}

fun rangeTest() {
    for (i in 1..4) {
        print("$i ")
    }
    println()

    for (i in 1..<4) {
        print("$i ")
    }
    println()

    for (i in 1..7 step 2) {
        print("$i ")
    }
    println()

    for (i in 7 downTo 1 step 2) {
        print("$i ")
    }
    println()

    for (i in 'a'..'d') {
        print("$i ")
    }
    println()

    for (i in 'Z' downTo 'Q' step 3) {
        print("$i ")
    }
    println()
}

fun whileTest() {
    var i = 0
    var j = 0
    while (i < 3) {
        print("$i ")
        i++
    }
    println()
    do {
        print("$j ")
        j++
    } while (j < 4)

}