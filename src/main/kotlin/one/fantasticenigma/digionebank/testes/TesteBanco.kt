package one.fantasticenigma.digionebank.testes

import one.fantasticenigma.digionebank.Banco

fun main() {
    val nome: String = "DigiOne"
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.info())

}