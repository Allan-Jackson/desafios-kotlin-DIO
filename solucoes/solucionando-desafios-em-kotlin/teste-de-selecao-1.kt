import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
//continue a solucao
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val d = input.nextInt()

    if (b  >  c &&  d > a && (c+d) > (a + b) &&   c > 0 &&  d > 0 && a % 2 ==0 ) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }

}