package com.safe_ceylon.Safe_Ceylon.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="MDOffice")
public class MDOffice {

    @Id
    @Column(nullable = false , unique = true)
    private int MD_Office_ID;

    @Column(nullable = false , unique = true)
    private String Contact_Number;

    @Column(nullable = false , unique = true)
    private String  Location;



}
