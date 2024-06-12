package Sptech.gerenciamento.tarefas.service

import Sptech.gerenciamento.tarefas.domain.Usuario
import Sptech.gerenciamento.tarefas.dto.UsuarioRequest
import Sptech.gerenciamento.tarefas.dto.UsuarioResponse
import Sptech.gerenciamento.tarefas.repository.UsuarioRepository
import org.modelmapper.ModelMapper
import org.modelmapper.TypeToken
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UsuarioService (
    val usuarioRepository: UsuarioRepository,
    val mapper: ModelMapper = ModelMapper()
) {

    fun validarLista(lista: List<*>){
        if (lista.isEmpty()) {
            throw ResponseStatusException(HttpStatusCode.valueOf(204))
        }
    }

    fun getLista(): List<UsuarioResponse> {
        val lista = usuarioRepository.findAll();
        validarLista(lista);

        val listaDtos: List<UsuarioResponse> = mapper.map(
            lista, object:TypeToken<List<UsuarioResponse>>() {}.type
        )
        return listaDtos;
    }

    fun criar(novoUsuario: UsuarioRequest): UsuarioResponse{
        val usuario = mapper.map(novoUsuario, Usuario::class.java)
        val criado = usuarioRepository.save(usuario);
        val dto = mapper.map(criado, UsuarioResponse::class.java)

        return dto;
    }

    fun getListaAdm(): List<Usuario>{
        val lista = usuarioRepository.findAll();
        validarLista(lista);

        return lista;
    }
}