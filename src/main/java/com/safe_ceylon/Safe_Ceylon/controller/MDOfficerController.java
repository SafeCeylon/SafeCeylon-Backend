package com.safe_ceylon.Safe_Ceylon.controller;

import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import com.safe_ceylon.Safe_Ceylon.service.interfac.MDOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/MDOfficer")


public class MDOfficerController {

    @Autowired
    private MDOfficerService mdofficerService;

    @PostMapping
    public ResponseEntity<MDOfficer> saveOfficer(@RequestBody MDOfficer mdofficer) {
        try {
            MDOfficer savedOfficer = mdofficerService.saveOfficer(mdofficer);
            return new ResponseEntity<>(savedOfficer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
