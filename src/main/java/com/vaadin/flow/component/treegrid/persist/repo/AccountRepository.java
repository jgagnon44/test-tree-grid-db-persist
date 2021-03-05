package com.vaadin.flow.component.treegrid.persist.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaadin.flow.component.treegrid.persist.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, AccountRepositoryCustom {

  void saveAll(List<Account> list);

}
