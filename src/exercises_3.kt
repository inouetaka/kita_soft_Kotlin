fun main(args: Array<String>) {
    ex3_1()
}

fun ex3_1() {
    println(">> スペースを空けて2つの整数値を入力してください。")
    try {
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        if (x > y) {
            println("xはyより大きい。")
        }
        else {
            println("xはyより小さい。")
        }
    }
    catch(e: Exception) {
        println("数字以外が入力されました。")
    }
}