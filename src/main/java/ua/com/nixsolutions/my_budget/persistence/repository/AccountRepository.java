package ua.com.nixsolutions.my_budget.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.nixsolutions.my_budget.persistence.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {

   boolean existsAccountByFullNameAndUserId(String fullName, Long userId);

   boolean existsAccountByBriefNameAndUserId(String briefName, Long userId);

   void deleteByFullName(String fullName);

   void deleteByBriefName(String briefName);

}
