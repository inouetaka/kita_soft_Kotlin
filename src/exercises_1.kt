fun main(args: Array<String>) {
    ex1_1()
    ex1_2()
    ex1_3()
    ex1_4()
    ex1_5()
    ex1_6()
    ex1_7(1, 3)
    ex1_8()
    ex1_9(1)
    ex1_10(2.0)
    ex1_11(10.0, 5.0)
    ex1_12()
}

fun ex1_1(hello: String = "Hello World") {
    println("例題1-1:\n ${hello}")
}

fun ex1_2(x: Int = 11) {
    println("例題1-2:\n x = ${x}")
}

fun ex1_3(x: Int = 13, y: Int = 17) {
    println("例題1-3:\n x = ${x}, y = ${y}")
}

fun ex1_4(y: Int = 13, z: Int =17) {
    var x = 0
    x = y + z
    println("例題1-4:\n x = ${x}")
}

fun ex1_5() {
    println("例題1-5:\n x = ${13 * 17}")
}

fun ex1_6(x: Int = 7) {
    var x = x * 3
    println("例題1-6:\n x = ${x}")
    x = x / 2
    println(" x = ${x}")
}

fun ex1_7(x: Int, y: Int) {
    println("例題1-7:\n x = ${x}, y = ${y}")
    var z = x
    val x = y
    val y = z
    println(" x = ${x}, y = ${y}")
}

fun ex1_8(x: Int = 19, y: Int = 23) {
    val z = x * 23
    println("例題1-8:\n z = ${z}")
}

fun ex1_9(x: Int) {
    println("例題1-9:\n X × 2 = ${x * 2}\n X × 3 = ${x * 3}\n X × 4 = ${x * 4}")
}

fun ex1_10(x: Double) {
    println("例題1-10:\n X^1 = ${Math.pow(x, 1.0)}\n X^2 = ${Math.pow(x, 2.0)}\n X^3 = ${Math.pow(x, 3.0)}")
}

fun ex1_11(x: Double, y: Double) {
    println("例題1-11:\n x / y = ${x / y}\n x % y = ${x % y }")
}

fun ex1_12() {
    var inc: Int = 0
    var dec: Int = 0
    print("練習問題1-12:\n")
    for (a in 1..10) print("インクリメント:${inc++}, デクリメント:${dec--}\n")
}