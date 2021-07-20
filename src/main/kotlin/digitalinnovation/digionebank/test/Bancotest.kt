package digitalinnovation.digionebank.test

import digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome ="DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "banco2")

    println(banco2.info())

}