package ru.qom.api.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.qom.api.dao.service.AccountDAO;

@RestController
@RequestMapping("/users")
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    AccountDAO accountDAO;

    @RequestMapping(value = "/{username}")
    public ResponseEntity findByUsername(@PathVariable String username) {
        return ResponseEntity.ok(accountDAO.findByUsername(username));
    }

    @RequestMapping(value = "/{accountId}/info")
    public ResponseEntity findUserInfoByUsername(@PathVariable Long accountId) {
        return ResponseEntity.ok(accountDAO.getAccountInfos(accountId));
    }

    @RequestMapping(value = "/{accountId}/info/{name}")
    public ResponseEntity findUserInfoByUsername(@PathVariable Long accountId, @PathVariable String name) {
        return ResponseEntity.ok(accountDAO.getAccountInfo(accountId, name));
    }


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findUsers() {
        return ResponseEntity.ok(accountDAO.findAll());
    }
}