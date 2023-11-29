package ru.netology.hibernate.domain;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMERS")
@IdClass(CustomersId.class)
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    @Column(nullable = false)
    private String name;

    @Id
    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 12, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false, name = "city_of_living")
    private String cityOfLiving;
}
