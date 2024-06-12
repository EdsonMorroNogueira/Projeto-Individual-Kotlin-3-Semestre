package Sptech.gerenciamento.tarefas.domain

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime
import java.util.*

@Entity
data class Tarefa (
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:Size(min = 1, max = 255)
    @field:NotBlank
    var titulo: String? = null,

    @field:Size(min = 1, max = 1000)
    var descricao: String? = null,

    @Enumerated(EnumType.STRING)
    @field:NotBlank
    @field:Size(min = 8, max = 255)
    var status: StatusTarefa = StatusTarefa.PENDENTE,

    @Enumerated(EnumType.STRING)
    @field:NotBlank
    var prioridade: PrioridadeTarefa = PrioridadeTarefa.MEDIA,

    @field:NotBlank
    var dtCriado: LocalDateTime = LocalDateTime.now(),

    @field:NotBlank
    var dtAtualizado: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    var usuario: Usuario,
)

enum class StatusTarefa {
    PENDENTE, EM_PROGRESSO, COMPLETA
}

enum class PrioridadeTarefa {
    BAIXA, MEDIA, ALTA
}