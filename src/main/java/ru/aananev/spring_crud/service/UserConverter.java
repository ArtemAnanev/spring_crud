package ru.aananev.spring_crud.service;

import org.springframework.stereotype.Component;
import ru.aananev.spring_crud.dto.UserDto;
import ru.aananev.spring_crud.entity.User;

@Component
public class UserConverter {

    public User fromUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setMiddlename(userDto.getMiddlename());
        user.setBirthdate(userDto.getBirthdate());
        user.setPartnertype(userDto.getPartnertype());
        user.setLogin(userDto.getLogin());
        return user;
    }

    public UserDto fromUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .middlename(user.getMiddlename())
                .birthdate(user.getBirthdate())
                .partnertype(user.getPartnertype())
                .login(user.getLogin())
                .build();
    }
}
