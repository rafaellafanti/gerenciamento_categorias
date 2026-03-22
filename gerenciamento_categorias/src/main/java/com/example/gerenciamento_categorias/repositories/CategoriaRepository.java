package com.example.gerenciamento_categorias.repositories;

import com.example.gerenciamento_categorias.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}
