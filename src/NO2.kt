class SegitigaTerbalik(val rows:Int) {
    fun printSegitigaTerbalik() {
        for (i in rows - 1 downTo 1) {
            for (space in 1..rows - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}
fun main() {
    val segitigaTerbalik = SegitigaTerbalik(8)
    segitigaTerbalik.printSegitigaTerbalik()
}