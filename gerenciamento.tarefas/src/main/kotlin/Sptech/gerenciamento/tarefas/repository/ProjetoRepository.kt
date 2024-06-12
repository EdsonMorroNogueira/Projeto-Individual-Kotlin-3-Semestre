package Sptech.gerenciamento.tarefas.repository

import Sptech.gerenciamento.tarefas.domain.Projeto
import org.springframework.data.jpa.repository.JpaRepository

interface ProjetoRepository : JpaRepository<Projeto, Long> {
}