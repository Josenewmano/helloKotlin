package example.myapp.decor

data class Decoration(val rocks: String) {

}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {

}

fun makeDecorations() {
    val dec1 = Decoration("granite")
    println(dec1)
    val dec2 = Decoration("slate")
    println(dec2)
    val dec3 = Decoration("slate")
    println(dec3)

    println(dec1 == dec2)
    println(dec2 == dec3)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
    val (diver, rock, wood) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main() {
    makeDecorations()
}