package com.example.gerenciamento_categorias.controllers;

import com.example.gerenciamento_categorias.models.CategoriaModel;
import com.example.gerenciamento_categorias.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaModel> criar(@RequestBody CategoriaModel categoria) {
        CategoriaModel novaCategoria = categoriaService.salvar(categoria);
        URI uri = URI.create("/categorias/" + novaCategoria.getId());
        return ResponseEntity.created(uri).body(novaCategoria);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> listar() {
        return ResponseEntity.ok(categoriaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> buscar(@PathVariable Long id) {
        CategoriaModel categoria = categoriaService.buscarPorId(id);

        if (categoria == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaModel> atualizar(@PathVariable Long id, @RequestBody CategoriaModel categoria) {
        CategoriaModel atualizada = categoriaService.atualizar(id, categoria);
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        categoriaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
