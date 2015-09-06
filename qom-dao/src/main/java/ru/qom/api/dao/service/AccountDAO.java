package ru.qom.api.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qom.api.dao.domain.Account;
import ru.qom.api.dao.repository.AccountRepository;

import java.util.Optional;

/**
 * Created by Тимакс on 05.09.2015.
 */
@Service("accountDAO")
public class AccountDAO {
    @Autowired
    private AccountRepository accountRepository;

    public Account getAccount(Long id) {return accountRepository.findOne(id);}

    public boolean exists(Long id) {return accountRepository.exists(id);}

    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }
    public void deleteAccount(Long id){
        accountRepository.delete(id);
    }


    //public Map<AccountDetails>




}
