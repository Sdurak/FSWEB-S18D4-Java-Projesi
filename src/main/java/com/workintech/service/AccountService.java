package com.workintech.service;

import com.workintech.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(int id);
    Account save(Account account);
    void delete(Account account);
}
