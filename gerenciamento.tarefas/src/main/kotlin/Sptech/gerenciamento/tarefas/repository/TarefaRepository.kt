package Sptech.gerenciamento.tarefas.repository

import Sptech.gerenciamento.tarefas.domain.Tarefa
import org.springframework.data.jpa.repository.JpaRepository

interface TarefaRepository : JpaRepository<Tarefa, Long> {
}