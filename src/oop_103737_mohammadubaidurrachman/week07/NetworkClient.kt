package oop_103737_mohammadubaidurrachman.week07

class NetworkClient private constructor(
    val url: String
) {

    fun connect() {

        println("Connecting to $url...")
    }
}