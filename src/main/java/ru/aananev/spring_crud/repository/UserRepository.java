package ru.aananev.spring_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aananev.spring_crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByFirstname(String firstname);
}
