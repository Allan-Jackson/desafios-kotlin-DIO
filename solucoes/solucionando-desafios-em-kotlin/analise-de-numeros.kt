// SOLUÇÃO 1: USANDO LISTAS E MÉTODOS DE FILTRO (FILTER & PARTITION)
fun main(args: Array<String>) {
    val inteiros = mutableListOf<Int>()
    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
    val (pares,impares) = inteiros.partition{it % 2==0}
    val positivos = inteiros.filter{it > 0}
    val negativos = inteiros.filter{it < 0}

    println("%d valor(es) par(es)".format(pares.size))
    println("%d valor(es) impar(es)".format(impares.size))
    println("%d valor(es) positivo(s)".format(positivos.size))
    println("%d valor(es) negativo(s)".format(negativos.size))
}


/* SOLUÇÃO 2: USANDO WHEN
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    var contImpares = 0
    var contPares = 0
    var contPos = 0
    var contNeg = 0

    for(i in 1..5){
        val entrada = input.nextLine().toInt()

        when{
            entrada % 2 == 0 -> {contPares++}
            entrada % 2 != 0 -> {contImpares++}
        }
        when{
            entrada > 0 -> contPos++
            entrada < 0 -> contNeg++
        }
    }//END_FOR

    println("$contPares valor(es) par(es)")
    println("$contImpares valor(es) impar(es)")
    println("$contPos valor(es) positivo(s)")
    println("$contNeg valor(es) negativo(s)")
}
*/



/* SOLUÇÃO 3: USANDO IF...ELSE E LISTA
fun main(){

    val entrada: mutableListOf<Int>
    var contImpares = 0
    var contPares = 0
    var contPos = 0
    var contNeg = 0


    for(i in 1..5){entrada.add(readLine()!!.toInt())}

    entrada.forEach{
        if(it % 2 == 0){
            contPares++
        }else{
            contImpares++
        }
        if( it > 0){
            contPos++
        }else if(it < 0){
            contNeg++
        }
    }

    println("$contPares valor(es) par(es)")
    println("$contImpares valor(es) impar(es)")
    println("$contPos valor(es) positivo(s)")
    println("$contNeg valor(es) negativo(s)")
}
*/
