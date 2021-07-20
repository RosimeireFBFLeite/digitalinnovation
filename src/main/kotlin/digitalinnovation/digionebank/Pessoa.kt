package digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rosimeire"
    var cpf: String = "123.123.123-12"
    private set

    inner class Endereco {
        var rua: String = "Rua Do Lara"
   }
}
fun main(){
    val rosimeire = Pessoa()


    println(rosimeire)
    println(rosimeire.nome)
    println(rosimeire.cpf)

    println(rosimeire.Endereco().rua)
}