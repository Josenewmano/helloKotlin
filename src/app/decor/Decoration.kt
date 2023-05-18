package app.decor

data class Decoration(val rocks: String) {}
data class Decoration2(val rocks: String, val wood: String, val diver: String) {}
enum class Colour(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(100), EAST(90), WEST(270)
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
    val (rocks, wood, diver) = d5
    println(rocks)
    println(wood)
    println(diver)
}

fun main() {
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}