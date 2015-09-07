package ru.qom.api.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.qom.api.dao.domain.Account;
import ru.qom.api.dao.domain.AccountDetails;
import ru.qom.api.dao.repository.AccountDetailsRepository;
import ru.qom.api.dao.repository.AccountRepository;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by Тимакс on 05.09.2015.
 */
@Service("accountDAO")
public class AccountDAO {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    public Account getAccount(Long id) {
        return accountRepository.findOne(id);
    }

    public boolean exists(Long id) {
        return accountRepository.exists(id);
    }

    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.delete(id);
    }

    public Collection<Account> findAll() {
        return (Collection<Account>) accountRepository.findAll();
    }

    public Collection<AccountDetails> getAccountInfos(Long accountId) {
        return accountDetailsRepository.getAccountInfos(accountId);
    }


    public Optional<AccountDetails> getAccountInfo(Long accountId, String name) {
        return accountDetailsRepository.getAccountInfo(accountId, name);
    }


}
