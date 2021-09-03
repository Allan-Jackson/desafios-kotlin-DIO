import java.io.EOFException
import java.util.*

//SOLUÇÃO 1: USANDO MÉTODO SORTEDBY DA LISTA
fun main(args: Array<String>) {
    while (true) {
        try {
            readLine()!!.toInt()

            var v: List<Int> = readLine()!!.split(" ").map{it.toInt()}
            v = v.sortedByDescending{it} //ordena pelo maior valor

            when (v.first()) { //pega o primeiro elemento (o maior)
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


/* SOLUÇÃO 2: USANDO MÉTODO SORT DO ARRAY<INT>
fun main() {
    while (true) {
        try {
            readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt() } }
            val sorted = v.toTypedArray() //converte para Array<Int>

            sorted.sort() //ordena o Array em ordem crescente (ascending)

            when (sorted.last()) { //pega o último elemento (maior valor)
                in 0 .. 9 -> {
                    println(1)
                }
                in 10 .. 19 -> {
                    println(2)
                }
                else -> {
                    println(3)
                }
            }
        }catch (e:Exception) {
            break
        }
    }
}
*/
