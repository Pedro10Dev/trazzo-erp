package com.csd.trazzo_erp.models;

import java.time.LocalDate;

import com.csd.trazzo_erp.Enums.DocumentType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "persons", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"documentType", "documentNumber"})
})
@Data
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;
    
    @Column(nullable = false,name = "last_name")
    private String lastName;

    @Column(name = "second_last_name")
    private String secondLastName;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "document_type", nullable = false)
    private DocumentType documentType;
    
    @Column(name = "document_number", nullable = false) 
    private String documentNumber;
    
    private String address;
    
    @Column(nullable = false,name = "birth_date")
    private LocalDate birthDate;
    
    @Column(name = "email", nullable = false, unique = true) 
    private String email;
    
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;  
    
    private String gender; 
}
