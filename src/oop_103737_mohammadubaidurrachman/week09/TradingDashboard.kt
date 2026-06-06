package oop_103737_mohammadubaidurrachman.week09

fun main() {

    val tradeHistory = listOf(

        TradeLog(
            "BTCUSDT",
            "LONG",
            20,
            15.5,
            "CLOSED"
        ),

        TradeLog(
            "ETHUSDT",
            "SHORT",
            10,
            -5.2,
            "CLOSED"
        ),

        TradeLog(
            "SOLUSDT",
            "LONG",
            15,
            8.7,
            "CLOSED"
        ),

        TradeLog(
            "BTCUSDT",
            "SHORT",
            25,
            -12.4,
            "CLOSED"
        ),

        TradeLog(
            "ETHUSDT",
            "LONG",
            10,
            0.0,
            "OPEN"
        ),

        TradeLog(
            "XRPUSDT",
            "LONG",
            5,
            22.1,
            "CLOSED"
        )
    )
}