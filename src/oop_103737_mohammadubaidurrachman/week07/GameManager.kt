package oop_103737_mohammadubaidurrachman.week07

object GameManager {

    var isGameRunning = false

    fun startGame() {

        if (isGameRunning) {

            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }

        else {

            isGameRunning = true

            println("Memulai Game Engine...")
        }
    }
}