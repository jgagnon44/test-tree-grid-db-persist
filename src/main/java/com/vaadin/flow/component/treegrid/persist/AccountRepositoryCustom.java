package com.vaadin.flow.component.treegrid.persist;

import java.util.List;

public interface AccountRepositoryCustom {

  void saveAll(List<Account> list);

}
