import java.io.EOFException

fun main(args: Array<String>) {
    while (true) {
        try {
            readLine()!!.toInt()

            var v: List<Int> = readLine()!!.split(" ").map{it.toInt()}
            v = v.sortedByDescending{it}

            when (v.first()) {
                in 1..9 -> println(1)
                in 10..19 -> println(2)
                else -> println(3)
            }
        }
        catch (e :Exception) {
            break
        }
    }
}