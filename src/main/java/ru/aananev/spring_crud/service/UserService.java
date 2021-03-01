package ru.aananev.spring_crud.service;

import ru.aananev.spring_crud.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    void deleteUser(Integer userId);
    UserDto findByFirstname(String firstname);
    List<UserDto> findAll();
}
