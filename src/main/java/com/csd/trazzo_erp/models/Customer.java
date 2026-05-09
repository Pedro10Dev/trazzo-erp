package com.csd.trazzo_erp.models;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity {
    
    @Column(nullable = false, unique = true, name = "customer_code")
    private String customerCode;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    private Person person;

    private String notes;

    private boolean active = true;
    

}
