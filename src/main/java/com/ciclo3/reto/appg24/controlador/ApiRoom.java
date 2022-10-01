package com.ciclo3.reto.appg24.controlador;

import com.ciclo3.reto.appg24.entidad.Category;
import com.ciclo3.reto.appg24.entidad.Room;
import com.ciclo3.reto.appg24.servicio.CategoryService;
import com.ciclo3.reto.appg24.servicio.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Room")
@CrossOrigin(origins = "*")

public class ApiRoom {

    @Autowired
    private RoomService service;

    @GetMapping("/all")
    public List<Room> findAllRooms(){
        return service.getRooms();
    }
    @PostMapping("/save")
    public ResponseEntity saveRooms(@RequestBody Room room){
        service.saveRoom(room);
        return ResponseEntity.status(201).build();
    }
}
