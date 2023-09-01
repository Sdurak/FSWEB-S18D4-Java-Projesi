package com.workintech.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name= "customer", schema= "spring")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @Column(name= "first_name")
    private String first_name;

    @Column(name= "last_name")
    private String last_name;

    @Column(name= "email")
    private String email;

    @Column(name= "salary")
    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "address_id")
    private Address address;  //composition ile çağırdık. address i bağladık.

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Account> accountList;

    public void add(Account account) {
    }
}
