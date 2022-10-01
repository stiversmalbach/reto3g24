package com.ciclo3.reto.appg24.repositorio;

import com.ciclo3.reto.appg24.entidad.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
