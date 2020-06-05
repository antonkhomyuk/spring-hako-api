package com.house_db.persistence.services;

import com.house_db.persistence.entities.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    void delete(Long id);

    User create(User user);

    User update(User user);

    List<User> getAll();
}
