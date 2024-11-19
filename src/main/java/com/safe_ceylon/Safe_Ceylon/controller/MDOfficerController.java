package com.safe_ceylon.Safe_Ceylon.controller;


import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;
import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import com.safe_ceylon.Safe_Ceylon.service.interfac.MDOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/mdofficer")
@CrossOrigin

public class MDOfficerController {

    @Autowired
    private MDOfficerService mdofficerService;

    @PostMapping("/save")
    public String saveMdofficer(@RequestBody MDOfficerDTO mdOfficerDTO) {
        mdofficerService.saveMdofficer(mdOfficerDTO);
        return "SAVED";
    }

    @PutMapping("/update")
    public String updateMdofficer(@RequestBody MDOfficerDTO mdOfficerDTO) {
        mdofficerService.updateMdofficer(mdOfficerDTO);
        return "UPDATED";
    }

    @DeleteMapping(
            path="/delete-officer/{empNumber}"
    )
    public String deleteMdofficer(@PathVariable Long empNumber) {
        mdofficerService.deleteMdofficer(empNumber);
        return "DELETED";

    }






}
