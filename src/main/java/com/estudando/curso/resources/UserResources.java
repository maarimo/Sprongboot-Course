package com.estudando.curso.resources;

import com.estudando.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("Maria", "maria@gmail.com", "7109823180", "3563");
        return ResponseEntity.ok().body(u);
    }
}
