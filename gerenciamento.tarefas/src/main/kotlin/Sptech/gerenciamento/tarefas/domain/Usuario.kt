package Sptech.gerenciamento.tarefas.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
data class Usuario (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:Size(min = 5, max = 50)
    @field:NotBlank
    var apelido: String? = null,

    @field:NotBlank
    @field:Size(min = 1, max = 100)
    var email: String? = null,

    @field:NotBlank
    @field:Size(min = 8, max = 255)
    var senha: String? = null,

    var dtCriado:LocalDateTime = LocalDateTime.now(),
)