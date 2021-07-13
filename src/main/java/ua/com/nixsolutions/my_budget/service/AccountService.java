package ua.com.nixsolutions.my_budget.service;

import ua.com.nixsolutions.my_budget.persistence.model.AccountResponse;
import ua.com.nixsolutions.my_budget.persistence.model.save.AccountSaveModel;

import java.util.List;

public interface AccountService {

    AccountResponse create(AccountSaveModel account);

    AccountResponse makeAccountMain(Long accountId);

    List<AccountResponse> findAll();

    void deleteByFullName(String fullName);

    void deleteByBriefName(String briefName);

}
