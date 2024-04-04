package br.com.vraptor.forum.service

import br.com.vraptor.forum.model.Curso
import br.com.vraptor.forum.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getReferenceById(id)
    }
}
