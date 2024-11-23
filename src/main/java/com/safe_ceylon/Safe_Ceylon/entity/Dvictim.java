package com.safe_ceylon.Safe_Ceylon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Dvictim")
public class Dvictim {

    @Id
    private int Dv_id;

    @Column(nullable = false)
    private int Shelter_id;

    @Column(nullable = false)
    private String D_type;

    @Column(nullable = false)
    private LocalDateTime Record_date;
}
