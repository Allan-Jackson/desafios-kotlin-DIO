fun main(args: Array<String>) {
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.');
    val (n1,n2,n3) = readLine()!!.split(" ")

    val a = n1.replace(",",".").toDouble()
    val b = n2.replace(",",".").toDouble()
    val c = n3.replace(",",".").toDouble()

    val p = (a + b + c).format(1)

    val area = ( ( (a + b) *  c / 2 ) ).format(1)

    if ( a < (b + c) && b < (a + c) && c < (a + b) ) println("Perimetro = $p")

    else println("Area = $area")
}