package com.safe_ceylon.Safe_Ceylon.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DvictimDTO {


    private int Dv_id;

    private int Shelter_id;

    private String D_type;

    private LocalDateTime Record_date;
}
