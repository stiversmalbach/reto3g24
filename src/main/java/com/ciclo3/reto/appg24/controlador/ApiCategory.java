package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Category;
import com.ciclo3.reto.appg24.entidad.Client;
import com.ciclo3.reto.appg24.servicio.CategoryService;
import com.ciclo3.reto.appg24.servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")

public class ApiCategory {

    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category> findAllCategories(){
        return service.getCategories();
    }
    @PostMapping("/save")
    public ResponseEntity saveCategories(@RequestBody Category category){
        service.saveCategories(category);
        return ResponseEntity.status(201).build();
    }
}
