package example

import java.util.*

data class Fish (var name: String)

fun fishExamples() {
    val fish = Fish("splashy")
    myWith (fish.name) {
        println(capitalized())
    }

    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2.name)

    println(fish.let { it.name.capitalized() }
        .let{it + "fish"}
        .let{it.length}
        .let{it + 31})
    println(fish)
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun String.capitalized(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()
    }
}

fun runExample() {
    JavaRun.runNow {
        println("Last parameter is a lambda as a Runnable")
    }
}

fun main() {
    fishExamples()
    runExample()
}