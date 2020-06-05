package com.house_db.persistence.services;

import com.house_db.persistence.entities.Controller;

import java.util.List;

public interface ControllerService {

    Controller getById(Long id);

    List<Controller> getByType(Long typeId);

    List<Controller> getAllControllers();

    void delete(Long id);

    Controller create(Controller controller);

    Controller update(Controller controller);
}
