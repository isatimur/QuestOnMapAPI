package ru.qom.api.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qom.api.dao.repository.AccountRepository;

/**
 * Created by Тимакс on 05.09.2015.
 */
@Service("accountDAO")
public class AccountDAO {
    @Autowired
    AccountRepository accountRepository;


    public void findAll() {

    }
}
