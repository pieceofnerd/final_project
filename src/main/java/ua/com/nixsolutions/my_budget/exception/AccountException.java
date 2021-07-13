package ua.com.nixsolutions.my_budget.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public  class AccountException {

    public static ResponseStatusException duplicateFullName(String fullName){
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Account name " + fullName + " already taken");
    }

    public static ResponseStatusException duplicateBriefName(String briefName){
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Account brief name " + briefName + " already taken");
    }
}
