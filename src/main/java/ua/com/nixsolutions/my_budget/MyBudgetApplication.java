package ua.com.nixsolutions.my_budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.com.nixsolutions.my_budget.persistence.repository.AccountRepository;

@SpringBootApplication
public class MyBudgetApplication {

    @Autowired
   static AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyBudgetApplication.class, args);

    }

}
