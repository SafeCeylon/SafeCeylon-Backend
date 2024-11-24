package com.safe_ceylon.Safe_Ceylon.controller;


import com.safe_ceylon.Safe_Ceylon.dto.DvictimDTO;
import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;
import com.safe_ceylon.Safe_Ceylon.dto.ShelterDTO;
import com.safe_ceylon.Safe_Ceylon.service.interfac.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/shelter")
@CrossOrigin
public class ShelterController {

    @Autowired
    ShelterService shelterService;

    @PostMapping("/save")
    public String saveSheleter(@RequestBody ShelterDTO shelterDTO) {
        shelterService.saveSheleter(shelterDTO);
        return "SAVED";
    }

    @PutMapping("/update")
    public String updateShelter(@RequestBody ShelterDTO shelterDTO) {
        shelterService.updateSheleter(shelterDTO);
        return "UPDATED";
    }



}
