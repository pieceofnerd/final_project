package ua.com.nixsolutions.my_budget.service.impl;

import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.nixsolutions.my_budget.exception.AccountException;
import ua.com.nixsolutions.my_budget.persistence.model.AccountResponse;
import ua.com.nixsolutions.my_budget.persistence.model.save.AccountSaveModel;
import ua.com.nixsolutions.my_budget.persistence.repository.AccountRepository;
import ua.com.nixsolutions.my_budget.service.AccountService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional
    public AccountResponse create(AccountSaveModel account) {
        validateUniqueAccountFields(account);
        
    }

    @Override
    public AccountResponse makeAccountMain(Long accountId) {
        return null;
    }

    @Override
    public List<AccountResponse> findAll() {
        return null;
    }

    @Override
    public void deleteByFullName(String fullName) {

    }

    @Override
    public void deleteByBriefName(String briefName) {

    }

    private void validateUniqueAccountFields(AccountSaveModel saveModel) {

        String fullName = saveModel.fullName();
        String briefName = saveModel.briefName();
        Long userId = saveModel.clientId();

        if (accountRepository.existsAccountByFullNameAndUserId(fullName, userId)) {
            throw AccountException.duplicateFullName(fullName);
        }

        if (accountRepository.existsAccountByBriefNameAndUserId(briefName, userId)) {
            throw AccountException.duplicateFullName(briefName);
        }

    }
}
