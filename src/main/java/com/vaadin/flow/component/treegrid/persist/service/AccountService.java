package com.vaadin.flow.component.treegrid.persist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaadin.flow.component.treegrid.persist.entity.Account;
import com.vaadin.flow.component.treegrid.persist.repo.AccountRepository;

@Service
@Transactional
public class AccountService {

  private final AccountRepository repo;

  @Autowired
  public AccountService(AccountRepository repo) {
    this.repo = repo;
  }

  public void saveAll(List<Account> list) {
    repo.saveAll(list);
  }

}
