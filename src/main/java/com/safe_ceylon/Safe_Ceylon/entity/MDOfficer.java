package com.safe_ceylon.Safe_Ceylon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="MDOfficer")
public class MDOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empNumber;


    @Column(nullable = false , unique = true)
    private String nicNumber;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String contactNumber;

   // @Column(nullable = false)
   // private String officerPhotoUrl;





}
