fun main() {
    print("Введите расстояние в километрах: ")
    val km = readLine()!!.toInt()
    print("Введите расстояние в футах: ")
    val feet = readLine()!!.toInt()

    val feetToMeters = 0.305
    val feetToKilometers = feetToMeters / 1000

    val distanceFeetInKm = feet * feetToKilometers
    
    if (km < distanceFeetInKm) {
        println("Расстояние в километрах ($km км) меньше, чем в футах (${distanceFeetInKm} км)")
    } else {
        println("Расстояние в футах (${distanceFeetInKm} км) меньше, чем в километрах ($km км)")
    }
}
