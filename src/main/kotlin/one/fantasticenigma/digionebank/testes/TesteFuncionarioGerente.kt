package one.fantasticenigma.digionebank.testes

import one.fantasticenigma.digionebank.Funcionario
import one.fantasticenigma.digionebank.Gerente

fun main() {
    val maria = Gerente(nome =  "Maria do Carmo", cpf = "12312312311", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}