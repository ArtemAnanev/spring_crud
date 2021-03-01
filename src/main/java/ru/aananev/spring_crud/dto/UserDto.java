package ru.aananev.spring_crud.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String middlename;
    private String birthdate;
    private String partnertype;
}
