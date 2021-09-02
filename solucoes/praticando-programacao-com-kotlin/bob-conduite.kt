import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val testCases =
        input.nextInt() //após o nextQualquerTipo, deve-se usar um nextLine para pegar o '\n' que continua no buffer de entrada
    input.nextLine() //para pegar o '\n' do buffer de entrada

    for (i in 1..testCases) {
        val (r1, r2) = input.nextLine().split(' ').map { it.toInt() }
        val r = r1.plus(r2)
        println(r)
    }
}