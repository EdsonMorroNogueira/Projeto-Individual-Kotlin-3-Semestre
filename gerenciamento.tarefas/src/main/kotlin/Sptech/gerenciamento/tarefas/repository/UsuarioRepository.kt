package Sptech.gerenciamento.tarefas.repository

import Sptech.gerenciamento.tarefas.domain.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long> {
}