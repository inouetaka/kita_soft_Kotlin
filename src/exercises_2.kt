import java.lang.Exception
import kotlin.math.pow

fun main(args: Array<String>) {
    ex2_1()
    ex2_2()
    ex2_3()
    ex2_4()
    ex2_5()
    ex2_6()
}

// readLine()!!.toInt()は間違い↓↓に直す。
fun example4() {
    val x = readLine()?.let {
        try {
            println("${it.toDouble().pow(3.0)}")
        }
        catch (e: Exception) {
            println("数値以外が入力されています。")
        }
    }
}

fun ex2_1() {
    println(">> 適当な文字列を入力してください。")
    val s = readLine().toString()
    println("入力された文字は: ${s}")
}

fun ex2_2() {
    println(">> 適当な数字を入力してください。")
    try {
        val x = readLine()!!.toInt()
        println("入力された数字: ${x}")
    }
    catch(e: Exception) {
        println("数字以外が入力されました。")
    }
}

fun ex2_3() {
    println(">> 適当な数字を入力してください。")
    try {
        val x = readLine()!!.toDouble()
        println("入力された数字: ${x}\n x^2 = ${Math.pow(x, 2.0)}\n x^3 = ${Math.pow(x, 3.0)}\n x^4 = ${Math.pow(x, 4.0)}")
    }
    catch(e: Exception) {
        println("数字以外が入力されました。")
    }
}

fun ex2_4() {
    println(">> スペースを空けて数字を入力してください。")
    try {
        val (x, y) = readLine()!!.split(" ").map(String::toDouble)
        println("入力された数字: ${x}, ${y}:\n x + y = ${x+y}\n x - y = ${x-y}\n x * y = ${x*y}\n x / y = ${x/y}\n x % y = ${x%y}")
    }
    catch(e: Exception) {
        println("数字以外が入力されました。")
    }
}

fun ex2_5() {
    println(">> スペースを空けて2つの整数値を入力してください。")
    try {
        val (x, y) = readLine()!!.split(" ").map(String::toDouble)
        println("入力された数字: ${x}, ${y}:\n AVE = ${(x+y)/2}")
    }
    catch(e: Exception) {
        println("数字以外が入力されました。")
    }
}

fun ex2_6() {
    println(">> 年齢を入力してください。")
    try {
        val age = readLine()!!.toInt()
        println("生まれてからの現在までの大体の日数: ${age*365}")
    }
    catch (e: Exception) {
        println("数字以外が入力されました。")
    }
}