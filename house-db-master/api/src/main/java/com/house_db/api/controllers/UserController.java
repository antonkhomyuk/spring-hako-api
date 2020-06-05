package com.house_db.api.controllers;

import com.house_db.persistence.dto.UserDto;
import com.house_db.persistence.mappers.UserMapper;
import com.house_db.persistence.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserMapper userMapper;
    private final UserService userService;

    public UserController(UserMapper userMapper,
                          UserService userService) {
        this.userMapper = userMapper;
        this.userService = userService;
    }


    @GetMapping
    public List<UserDto> getUsers() {
        return userService.getAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("details/{userId}")
    public UserDto getById(@PathVariable("userId") Long id) {
        return userMapper.toDto(userService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody UserDto userDto) {
        userService.create(userMapper.toEntity(userDto));
        return ResponseEntity.ok().build();
    }

    @PatchMapping()
    public ResponseEntity update(@RequestBody UserDto userDto) {
        userService.update(userMapper.toEntity(userDto));
        return ResponseEntity.ok().build();
    }
}
