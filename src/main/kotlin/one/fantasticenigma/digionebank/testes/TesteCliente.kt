package one.fantasticenigma.digionebank.testes

import one.fantasticenigma.digionebank.Cliente
import one.fantasticenigma.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
