package com.vaadin.flow.component.treegrid.persist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountPersister implements CommandLineRunner {

  @Autowired
  private AccountService service;

  @Override
  public void run(String... args) throws Exception {
    AccountData data = new AccountData();
    List<Account> list = data.getAccounts();
    service.saveAll(list);

    Thread.sleep(5000);

    System.exit(0);
  }

}
