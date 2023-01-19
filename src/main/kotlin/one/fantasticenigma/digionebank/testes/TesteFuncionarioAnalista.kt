package one.fantasticenigma.digionebank.testes

import one.fantasticenigma.digionebank.Analista


fun main() {
    val joao = Analista(nome =  "Joao Pedro", cpf = "12312312311", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}

