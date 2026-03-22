package com.example.gerenciamento_categorias.services;

import com.example.gerenciamento_categorias.models.CategoriaModel;
import com.example.gerenciamento_categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaModel salvar(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<CategoriaModel> listarTodos() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public CategoriaModel atualizar(Long id, CategoriaModel categoriaAtualizada) {
        categoriaAtualizada.setId(id);
        return categoriaRepository.save(categoriaAtualizada);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}