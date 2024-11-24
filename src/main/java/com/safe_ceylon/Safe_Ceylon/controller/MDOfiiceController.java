package com.safe_ceylon.Safe_Ceylon.controller;


import com.safe_ceylon.Safe_Ceylon.dto.MDOfficeDTO;
import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;
import com.safe_ceylon.Safe_Ceylon.service.interfac.MDOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/mdoffice")

public class MDOfiiceController {

    @Autowired
    private MDOfficeService mdofficeService;

    @PostMapping("/save")
    public String saveMdOffice(@RequestBody MDOfficeDTO mdofficeDTO) {
        mdofficeService.saveMdOffice(mdofficeDTO);
        return "SAVED";
    }
}
