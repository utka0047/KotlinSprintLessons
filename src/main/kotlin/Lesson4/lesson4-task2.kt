const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100 // V - объём

fun main() {

    val weight1 = 20
    println("Груз с весом $weight1 кг соответствует категории 'Average': ${weight1 < WEIGHT_MAX && weight1 >= WEIGHT_MIN}")

    val volume2 = 80
    val weight2 = 50
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${(weight2 < WEIGHT_MAX && weight2 >= WEIGHT_MIN) && volume2 < VOLUME_MAX}")

    val volume3 = 100
    println("Груз с весом $volume3 л соответствует категории 'Average': ${volume3 < VOLUME_MAX}")
}