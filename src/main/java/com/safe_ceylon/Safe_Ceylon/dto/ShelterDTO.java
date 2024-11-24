package com.safe_ceylon.Safe_Ceylon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ShelterDTO {



    private int Shelter_id;

    private String Contact_Number;

    private Long Capacity;

    private String Location;

}
