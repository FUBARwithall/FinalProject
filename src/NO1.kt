class Segitiga(val baris:Int) {
    var k = 0
    fun printSegitiga() {
        for (i in 1..baris) {
            for (space in 1..baris - i) {
                print(" ")
            }
            while (k != 2 * i - 1) {
                print("*")
                ++k
            }

            println()
            k = 0
        }
    }
}

fun main() {
    val segitiga = Segitiga(8)
    segitiga.printSegitiga()
}