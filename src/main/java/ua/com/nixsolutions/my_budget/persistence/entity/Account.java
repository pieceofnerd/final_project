package ua.com.nixsolutions.my_budget.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Column
    private Boolean active;

    @Column
    private Boolean main;

    @Column(name = "full_name", nullable = false, unique = true)
    @NotBlank(message = "Name is mandatory")
    private String fullName;

    @Column(name = "brief_name", unique = true)
    private String briefName;

    @Column(name = "user_id", nullable = false)
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Client userId;

    public Account() {
        this.active = true;
    }

}
