package ua.com.nixsolutions.my_budget.persistence.model.save;

public record AccountSaveModel(
        String fullName,
        String briefName,
        Long clientId
) {
}
