package com.safe_ceylon.Safe_Ceylon.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MDOfficerDTO {

    private Long empNumber;

    private String nicNumber;

    private String firstName;


    private String lastName;


    private String email;


    private String contactNumber;


    private String officerPhotoUrl;
}
