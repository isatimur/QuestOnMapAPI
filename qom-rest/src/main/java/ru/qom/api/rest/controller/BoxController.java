package ru.qom.api.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.qom.api.dao.service.BoxDAO;

@RestController
@RequestMapping("/boxes")
public class BoxController {

    @Autowired
    BoxDAO boxDAO;

    @RequestMapping("/{username}")
    public ResponseEntity findBoxes(@PathVariable String username) {
        return ResponseEntity.ok(boxDAO.findByAccountUsername(username));
    }
}