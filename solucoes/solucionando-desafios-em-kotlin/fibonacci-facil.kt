//SOLUÇÃO MAIS SIMPLES:
fun main(){
    val n = readLine()!!.toInt()
    var sum = 0
    var num = 1
    var prox = 0

    for(i in 1..(n-1)){
        print("$sum ")

        sum = num + prox
        num = prox
        prox = sum
    }
    print("$sum")
    //println()
}


/* SOLUÇAO 2: UTILIZANDO LISTA E EXECUTANDO LAMBDA ATRAVES DE VARIAVEL
fun main(){
    val n = readLine()!!.toInt()
    fibo(n)
}

val fibo = {qtde: Int ->
    var numero =1
    var anterior = 0
    var soma: Int
    var sequencia = mutableListOf("0 ")


    for(i in 1 until qtde){
        sequencia.add(numero.toString())
        sequencia.add(" ")
        soma = numero + anterior
        anterior = numero
        numero = soma
    }
    sequencia.forEach{ print(it) }
}
*/


//FORMA 3: fique à vontade se quiser tentar quebrar a cabeça!

//import java.util.Scanner as Reader

//fun printFibonacci(qtde: Int){
//    var sum: Int
//    var num = 1
//    var prev = 0
//
//    when(qtde){
//        0 -> return
//        1 -> print("0")
//        2 -> print("0 1")
//        else ->{
//            print("0 1 ")
//            for (count in 3..qtde) {
//                sum = prev + num
//                print(sum)
//                prev = num
//                num = sum
//                if(count!=qtde){
//                    print(" ")
//                }
//            }
//        }
//    }
//}
//
//fun `primeiros-passos-em-kotlin`.main(args: Array<String>) {
//    val rep = Reader(System.`in`).nextInt()
//
//    printFibonacci(rep)
//}