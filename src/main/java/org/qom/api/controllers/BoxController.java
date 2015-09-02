package org.qom.api.controllers;

import org.qom.api.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoxController {

    @Autowired
    BoxRepository boxRepository;

    @RequestMapping("/boxes")
    public ResponseEntity findUsers() {
        return ResponseEntity.ok().body(boxRepository.findAll());
    }
}