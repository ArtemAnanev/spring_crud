package ru.aananev.spring_crud.service;

import ru.aananev.spring_crud.dto.UserDto;
import ru.aananev.spring_crud.exception.ValidationException;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto) throws ValidationException;
    void deleteUser(Integer userId);
    UserDto findByLogin(String login);
    List<UserDto> findAll();
}
