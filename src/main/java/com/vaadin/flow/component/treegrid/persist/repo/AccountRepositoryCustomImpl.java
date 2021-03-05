package com.vaadin.flow.component.treegrid.persist.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vaadin.flow.component.treegrid.persist.entity.Account;

public class AccountRepositoryCustomImpl implements AccountRepositoryCustom {

  @PersistenceContext
  private EntityManager entityManager;

  public void saveAll(List<Account> list) {
    list.forEach(e -> entityManager.persist(e));
  }

}
