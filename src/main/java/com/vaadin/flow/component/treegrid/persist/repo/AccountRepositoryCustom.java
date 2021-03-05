package com.vaadin.flow.component.treegrid.persist.repo;

import java.util.List;

import com.vaadin.flow.component.treegrid.persist.entity.Account;

public interface AccountRepositoryCustom {

  void saveAll(List<Account> list);

}
