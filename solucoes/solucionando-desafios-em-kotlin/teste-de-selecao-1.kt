import java.util.Scanner

//SOLUÇÃO 1: USANDO MÉTODO NEXTINT DO SCANNER
fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

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

/* SOLUÇÃO 2: USANDO ATRIBUIÇÃO POR DESESTRUTURAÇÃO
fun main() {

    val input = Scanner(System.`in`)

    val (a,b,c,d) = input.nextLine().split(" ").map{it.toInt()}

    if (b  >  c &&  d > a && (c+d) > (a + b) &&   c > 0 &&  d > 0 && a % 2 ==0 ) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }

}*/


/* SOLUÇÃO 3: USANDO READLINE E ACESSANDO O VALOR DA LISTA PELO ÍNDICE
fun main() {

    val input = readLine()!!.split(" ").map{ it.toInt() } //retorna uma List<Int>
    val a = input[0]
    val b = input[1]
    val c = input[2]
    val d = input[3]

    if (b  >  c &&  d > a && (c+d) > (a + b) &&   c > 0 &&  d > 0 && a % 2 ==0 ) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }
}*/
