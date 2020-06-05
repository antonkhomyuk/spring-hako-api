package com.house_db.api.controllers;

import com.house_db.persistence.dto.ControllerDto;
import com.house_db.persistence.entities.Controller;
import com.house_db.persistence.entities.ControllerType;
import com.house_db.persistence.mappers.ControllerMapperFactory;
import com.house_db.persistence.services.ControllerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/controllers")
public class ControllerRestController {

    private final ControllerService service;
    private final ControllerMapperFactory mapperFactory;

    public ControllerRestController(ControllerService service, ControllerMapperFactory mapperFactory) {
        this.service = service;
        this.mapperFactory = mapperFactory;
    }

    @GetMapping("/{typeId}")
    public List<ControllerDto> getByType(@PathVariable(name = "typeId") Long typeId) {
        return service.getByType(typeId).stream().map((item) -> mapperFactory.getMapper(ControllerType.of(typeId)).toDto(item)).collect(Collectors.toList());
    }

    @GetMapping
    public List<ControllerDto> getAllControllers() {
        return service.getAllControllers().stream().map((item) -> mapperFactory.getMapper(item.getType()).toDto(item)).collect(Collectors.toList());
    }

    @GetMapping("details/{id}")
    public Controller getById(@PathVariable(name = "id") Long id) {
        return service.getById(id);
    }

    @PatchMapping("details/{id}")
    public ResponseEntity update(@PathVariable(name = "id") Long id, @RequestBody ControllerDto controllerDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    public ResponseEntity registerController(@RequestBody ControllerDto controllerDto) {
        return ResponseEntity.ok().build();
    }
}

