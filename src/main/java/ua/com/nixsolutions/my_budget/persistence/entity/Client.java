package ua.com.nixsolutions.my_budget.persistence.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id", nullable = false)
    private Long chatId;

    @Column(name = "date_registration")
    private Instant registrationDate;


    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Account> accounts = new ArrayList<>();

    public Client() {
        this.registrationDate = Instant.now();
    }

}
