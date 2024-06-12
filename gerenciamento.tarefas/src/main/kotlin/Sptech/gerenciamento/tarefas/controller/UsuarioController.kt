package Sptech.gerenciamento.tarefas.controller

import Sptech.gerenciamento.tarefas.domain.Usuario
import Sptech.gerenciamento.tarefas.dto.UsuarioRequest
import Sptech.gerenciamento.tarefas.dto.UsuarioResponse
import Sptech.gerenciamento.tarefas.service.UsuarioService
import org.apache.coyote.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController (
    val usuarioService: UsuarioService
) {
    @GetMapping
    fun listarUsuarios(): ResponseEntity<List<UsuarioResponse>> {
        val usuarios = usuarioService.getLista();
        return ResponseEntity.status(200).body(usuarios);
    }

    @GetMapping("/admin")
    fun listarUsuariosADM(): ResponseEntity<List<Usuario>> {
        val usuarios = usuarioService.getListaAdm();
        return ResponseEntity.status(200).body(usuarios)
    }

    @PostMapping
    fun criarUsuarios(@RequestBody novoUsuario: UsuarioRequest): ResponseEntity<UsuarioResponse> {
        val criado = usuarioService.criar(novoUsuario);
        return ResponseEntity.status(201).body(criado);
    }

}