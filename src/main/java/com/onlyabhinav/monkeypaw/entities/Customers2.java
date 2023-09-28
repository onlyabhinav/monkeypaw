package com.onlyabhinav.monkeypaw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "\"CUSTOMERS2\"", schema = "MGM")
public class Customers2 {
    @Id
    @Column(name = "\"ID\"", nullable = false)
    private Integer id;

    @Column(name = "\"CustomerId\"", nullable = false)
    private Integer customerId;

    @Column(name = "\"Surname\"", length = 300)
    private String surname;

    @Column(name = "\"Email\"", length = 300)
    private String email;

    @Column(name = "\"Phone\"", length = 300)
    private String phone;

    @Column(name = "\"CreditScore\"")
    private Short creditScore;

    @Column(name = "\"Geography\"", length = 300)
    private String geography;

    @Column(name = "\"Gender\"", length = 300)
    private String gender;

    @Column(name = "\"Age\"")
    private Short age;

    @Column(name = "\"Tenure\"")
    private Short tenure;

    @Column(name = "\"Balance\"")
    private BigDecimal balance;

    @Column(name = "\"NumOfProducts\"")
    private Short numOfProducts;

    @Column(name = "\"HasCrCard\"")
    private Boolean hasCrCard;

    @Column(name = "\"IsActiveMember\"")
    private Boolean isActiveMember;

    @Column(name = "\"EstimatedSalary\"")
    private BigDecimal estimatedSalary;

}