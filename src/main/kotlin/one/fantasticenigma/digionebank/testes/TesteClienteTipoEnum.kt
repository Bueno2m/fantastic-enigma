package one.fantasticenigma.digionebank.testes

import one.fantasticenigma.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">>${pj.name} - ${pj.descricao}")
}