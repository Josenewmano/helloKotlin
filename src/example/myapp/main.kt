package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium(length = 25, width = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.colour}")
    shark.eat()
    println("Plecostomus: ${pleco.colour}")
    pleco.eat()
}

fun main() {
    makeFish()
}


