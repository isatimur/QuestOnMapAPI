package org.qom.api.controllers;

import org.qom.api.dao.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoxController {

    @Autowired
    BoxRepository accountRepository;

    @RequestMapping("/boxes/{username}")
    public ResponseEntity findBoxes(@PathVariable String username) {
        return ResponseEntity.ok().body(accountRepository.findByAccountUsername(username));
    }
}