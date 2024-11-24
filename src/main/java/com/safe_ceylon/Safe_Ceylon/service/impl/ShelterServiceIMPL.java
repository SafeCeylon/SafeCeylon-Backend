package com.safe_ceylon.Safe_Ceylon.service.impl;

import com.safe_ceylon.Safe_Ceylon.repository.ShelterRepo;
import com.safe_ceylon.Safe_Ceylon.service.interfac.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelterServiceIMPL implements ShelterService {

    @Autowired
    private ShelterRepo shelterRepo;



}
