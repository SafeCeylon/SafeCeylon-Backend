package com.safe_ceylon.Safe_Ceylon.controller;


import com.safe_ceylon.Safe_Ceylon.dto.DvictimDTO;
import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;
import com.safe_ceylon.Safe_Ceylon.service.interfac.DvictimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/Dvictim")
@CrossOrigin


public class DvictimController {

    @Autowired
    private DvictimService dvictimService;

    @PostMapping("/save")
    public String saveDvictim(@RequestBody DvictimDTO dvictimDTO) {
        dvictimService.saveDvictim(dvictimDTO);
        return "SAVED";
    }





}
