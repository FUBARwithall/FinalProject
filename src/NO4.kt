class Exes ( val Koordinat:Int) {
    fun printExes() {

        for (i in 0 until Koordinat) {
            for (j in 0 until Koordinat) {
                if (i == j || i + j == Koordinat - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}

fun main() {
    var exes = Exes(15)
    exes.printExes()
}