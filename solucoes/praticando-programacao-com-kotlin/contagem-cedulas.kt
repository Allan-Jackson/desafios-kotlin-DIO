import java.util.Scanner

fun main(){
    var valor = Scanner(System.`in`).nextInt()
    val notas = listOf(100, 50, 20, 10, 5, 2, 1)
    println(valor);

    for (nota in notas){
        val qtde = (valor/nota).toInt()
        valor %= nota
        println("$qtde nota(s) de R$ $nota,00")
    }
}


/* MANEIRA 2:
fun main() {
    val cedulas = mutableMapOf<Int,Int>()
    var valCedulas = listOf(100,50,20,10,5,2,1)

    var resto = Scanner(System.`in`).nextInt()

    println(resto)
    valCedulas.forEach{ //carrega o 'map'
        cedulas.put(it,resto/it) //0
        resto %= it
    }
    cedulas.forEach{ (key,value) ->
        println("$value nota(s) de R$ $key,00")
    }
}
 */