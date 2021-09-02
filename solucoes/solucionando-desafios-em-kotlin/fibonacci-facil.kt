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


//FORMA 2: fique à vontade se quiser tentar quebrar a cabeça!

//import java.util.Scanner as Reader

//fun calcNextFibonacci(rep: Int){
//    var sum: Int
//    var num = 1
//    var prev = 0
//
//    when(rep){
//        0 -> return
//        1 -> print("0")
//        2 -> print("0 1")
//        else ->{
//            print("0 1 ")
//            for (count in 3..rep) {
//                sum = prev + num
//                print(sum)
//                prev = num
//                num = sum
//                if(count!=rep){
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
//    calcNextFibonacci(rep)
//}