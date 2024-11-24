package com.safe_ceylon.Safe_Ceylon.service.impl;


import com.safe_ceylon.Safe_Ceylon.dto.MDOfficeDTO;
import com.safe_ceylon.Safe_Ceylon.entity.MDOffice;

import com.safe_ceylon.Safe_Ceylon.repository.MDOfficeRepo;
import com.safe_ceylon.Safe_Ceylon.service.interfac.MDOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MDOfficeIMPL implements MDOfficeService {

    @Autowired
    private MDOfficeRepo mdofficeRepo;

    @Override
    public String saveMdOffice(MDOfficeDTO mdofficeDTO) {

        MDOffice mdoffice = new MDOffice(

                mdofficeDTO.getMD_Office_ID(),
                mdofficeDTO.getContact_Number(),
                mdofficeDTO.getLocation()
        );

        mdofficeRepo.save(mdoffice);
        return "Saved Sucessfully";

    }
}
