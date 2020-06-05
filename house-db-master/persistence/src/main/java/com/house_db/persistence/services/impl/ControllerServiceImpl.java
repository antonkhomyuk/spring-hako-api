package com.house_db.persistence.services.impl;

import com.house_db.persistence.entities.Controller;
import com.house_db.persistence.exceptions.ControllerNotFoundException;
import com.house_db.persistence.repositories.ControllerRepository;
import com.house_db.persistence.services.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ControllerServiceImpl implements ControllerService {

    private final ControllerRepository controllerRepository;

    @Autowired
    public ControllerServiceImpl(ControllerRepository controllerRepository) {
        this.controllerRepository = controllerRepository;
    }

    @Override
    public Controller getById(Long id) {
        return controllerRepository.findById(id).orElseThrow(ControllerNotFoundException::new);
    }

    @Override
    public List<Controller> getByType(Long typeId) {
        return StreamSupport.stream(controllerRepository.findAllByType(typeId).spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public List<Controller> getAllControllers() {
        return StreamSupport.stream(controllerRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        controllerRepository.deleteById(id);
    }

    @Override
    public Controller create(Controller controller) {
        return controllerRepository.save(controller);
    }

    @Override
    public Controller update(Controller controller) {
        return controllerRepository.save(controller);
    }
}
