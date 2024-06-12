package Sptech.gerenciamento.tarefas.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class UsuarioRequest (
    @field:Size(min = 5, max = 50)
    @field:NotBlank
    var apelido: String? = null,

    @field:NotBlank
    @field:Size(min = 1, max = 100)
    var email: String? = null,

    @field:NotBlank
    @field:Size(min = 8, max = 255)
    var senha: String? = null,

)