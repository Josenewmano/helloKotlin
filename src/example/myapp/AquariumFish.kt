package example.myapp

interface FishColour {
    val colour: String
}

object GoldColour : FishColour {
    override val colour = "gold"
}

interface FishAction {
    fun eat()
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark: FishColour, FishAction by PrintingFishAction("hunt and eat fish"){
    override val colour = "grey"
}

class Plecostomus(fishColour: FishColour = GoldColour): FishColour by fishColour, FishAction by PrintingFishAction("eat algae") {}
