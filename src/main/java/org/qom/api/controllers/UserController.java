package org.qom.api.controllers;

import org.qom.api.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    AccountRepository usersRepository;

    @RequestMapping("/users")
    public ResponseEntity findUsers() {
        return ResponseEntity.ok().body(usersRepository.findAll());
    }
}