package com.house_db.persistence.repositories;

import com.house_db.persistence.entities.Controller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ControllerRepository extends CrudRepository<Controller, Long> {

//    @Query("SELECT controller from Controller controller WHERE controller.type = :typeId")
//    Optional<Controller> findByType(@Param("typeId") Long typeId);

    @Query("SELECT controller from Controller controller WHERE controller.type.id = :typeId")
    Iterable<Controller> findAllByType(@Param("typeId") Long typeId);
}
