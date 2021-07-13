package ua.com.nixsolutions.my_budget.persistence.model;

public record AccountResponse(
        Long accountId,
        Boolean main,
        String fullName,
        String briefName,
        Long clientId
) {
}
