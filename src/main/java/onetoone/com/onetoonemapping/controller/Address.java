package onetoone.com.onetoonemapping.controller;

import jakarta.persistence.*;

@Entity
@Table(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(mappedBy = "address")
    private User user;
}
