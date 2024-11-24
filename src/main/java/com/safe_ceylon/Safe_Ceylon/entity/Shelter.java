package com.safe_ceylon.Safe_Ceylon.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.stream.Location;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Shelter")
public class Shelter {

    @Id
    private int Shelter_id;

    @Column(nullable = false , unique = true)
    private String Contact_Number;

    @Column(nullable = false)
    private Long Capacity;

    @Column(nullable = false , unique = true)
    private String Location;

}
