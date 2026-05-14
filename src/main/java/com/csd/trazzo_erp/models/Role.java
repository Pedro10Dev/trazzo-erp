package com.csd.trazzo_erp.models;

import com.csd.trazzo_erp.enums.RoleName;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Role extends BaseEntity {
    
    @Enumerated(EnumType.STRING)
    @Column(unique=true, nullable = false, name = "role_name")
    private RoleName name;
    
}
