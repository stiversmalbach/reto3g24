package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Category;
import com.ciclo3.reto.appg24.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    /**
     * Mostrar datos
     */
    public List<Category> getCategories(){
        return repository.findAll();
    }
    /**
     * Guardar categoria
     * Parametro categoria
     * Retorna categoria
     */
    public Category saveCategories(Category category){
        return repository.save(category);
    }
}
