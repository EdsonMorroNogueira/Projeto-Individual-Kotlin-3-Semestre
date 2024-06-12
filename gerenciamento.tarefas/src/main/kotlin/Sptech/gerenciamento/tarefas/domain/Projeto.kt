package Sptech.gerenciamento.tarefas.domain

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Entity
data class Projeto (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:Size(min = 1, max = 255)
    @field:NotBlank
    var nome: String? = null,

    @field:Size(min = 1, max = 1000)
    var descricao: String? = null,

    @field:NotBlank
    var dtCriado: LocalDateTime = LocalDateTime.now(),

    @field:NotBlank
    var dtAtualizado: LocalDateTime = LocalDateTime.now(),
)