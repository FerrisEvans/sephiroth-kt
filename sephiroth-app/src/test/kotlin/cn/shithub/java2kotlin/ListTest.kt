package cn.shithub.java2kotlin


fun main(args: Array<String>) {
    mapOp()
}

fun mapOp() {
    val m1 = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(m1)
    println(m1.count())

    val m2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    // m2.put("d", 4)
    m2["d"] = 4
    println(m2)
    m2.remove("a")
    println(m2)
    println(m2.containsKey("a"))
    println(m2["a"]) // m2.get("a")

}

fun listOp() {
    val l1 = listOf(1, 2, 3)
    val l2 = mutableListOf(4, 5, 6)

    println(l1)
    println(l2)
    // li.add(4) compile error
    l2.add(7)
    println(l2)

    println(l1.first())
    println(l1.last())
    println(l2.count())

    println(4 in l2 && 3 in l2)
}