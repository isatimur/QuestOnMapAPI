package ru.qom.api.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.qom.api.dao.service.AccountDAO;

@RestController
public class AccountController {

    @Autowired
    AccountDAO accountDAO;

    @RequestMapping("/users")
    public ResponseEntity findUsers() {
        return (ResponseEntity) ResponseEntity.ok().build();
    }
}