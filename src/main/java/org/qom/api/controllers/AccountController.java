package org.qom.api.controllers;

import org.qom.api.dao.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/users")
    public ResponseEntity findUsers() {
        return ResponseEntity.ok().body(accountRepository.findAll());
    }
}