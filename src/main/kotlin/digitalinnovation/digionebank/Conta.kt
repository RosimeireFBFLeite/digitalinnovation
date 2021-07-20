package digitalinnovation.digionebank

import java.math.BigDecimal

class Conta (
    // construtor primario (membro)//
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
){
    fun deposito(valor: BigDecimal){
    }
    fun saque(valor: BigDecimal) {
    }
}