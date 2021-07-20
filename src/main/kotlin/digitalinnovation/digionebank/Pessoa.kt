package digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rosimeire"
    var cpf: String = "123.123.123-12"
    var rua: String = "Do Lara"
    private set

    constructor()

    fun pessoaInfo() = " Nome: $nome, CPF: $cpf, Rua: $rua"

}
fun main(){
    val rosimeire = Pessoa()

    println(rosimeire.pessoaInfo())
}