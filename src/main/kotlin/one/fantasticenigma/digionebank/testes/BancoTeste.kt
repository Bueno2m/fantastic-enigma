package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val nome: String = "DigiOne"
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.info())

}