const val VELOCIDADE = 0.5

fun main() {

    val distancia = readLine()!!.toInt()

    val tempo = (distancia / VELOCIDADE).toInt()

    println("$tempo minutos")

}