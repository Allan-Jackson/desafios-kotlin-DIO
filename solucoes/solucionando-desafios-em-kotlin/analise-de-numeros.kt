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