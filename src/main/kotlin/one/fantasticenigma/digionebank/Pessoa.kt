package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Victor"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$name - $cpf"
}

fun main() {
    val victor = Pessoa()

    println(victor.pessoaInfo())

}