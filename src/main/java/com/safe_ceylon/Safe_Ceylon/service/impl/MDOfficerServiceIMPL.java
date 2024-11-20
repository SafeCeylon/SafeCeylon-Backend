package com.safe_ceylon.Safe_Ceylon.service.impl;


import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;
import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import com.safe_ceylon.Safe_Ceylon.repository.MDOfficerRepo;
import com.safe_ceylon.Safe_Ceylon.service.interfac.MDOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MDOfficerServiceIMPL implements MDOfficerService {

    @Autowired
    private MDOfficerRepo mdofficerRepo;


    @Override
    public String saveMdofficer(MDOfficerDTO mdOfficerDTO) {

        MDOfficer mdOfficer = new MDOfficer(

                mdOfficerDTO.getEmpNumber(),
                mdOfficerDTO.getNicNumber(),
                mdOfficerDTO.getFirstName(),
                mdOfficerDTO.getLastName(),
                mdOfficerDTO.getEmail(),
                mdOfficerDTO.getContactNumber(),
                mdOfficerDTO.getOfficerPhotoUrl()
        );
        mdofficerRepo.save(mdOfficer);
        return "Successfully Saved";

    }

    @Override
    public String updateMdofficer(MDOfficerDTO mdOfficerDTO) {

        if (mdofficerRepo.existsById(mdOfficerDTO.getEmpNumber())) {
            MDOfficer mdOfficer = mdofficerRepo.getReferenceById(mdOfficerDTO.getEmpNumber());
            mdOfficer.setFirstName(mdOfficerDTO.getFirstName());
            mdOfficer.setLastName(mdOfficerDTO.getLastName());
            mdOfficer.setEmail(mdOfficerDTO.getEmail());
            mdOfficer.setContactNumber(mdOfficerDTO.getContactNumber());
            mdOfficer.setNicNumber(mdOfficerDTO.getNicNumber());
            mdOfficer.setOfficerPhotoUrl(mdOfficerDTO.getEmail());
            mdofficerRepo.save(mdOfficer);

            return mdOfficerDTO.getFirstName() + " Update Success";
        } else {

            throw new RuntimeException("No data found");
        }
    }

    @Override
    public String deleteMdofficer(Long empNumber) {
        if(mdofficerRepo.existsById(empNumber)) {
            mdofficerRepo.deleteById(empNumber);
            return "Successfully Deleted";
        }else {
            throw new RuntimeException("No data found");
        }
    }

    @Override
    public List<MDOfficerDTO> getAllOfficers() {

        List<MDOfficer> getAllOfficers = mdofficerRepo.findAll();
        List<MDOfficerDTO> officerDTOList = new ArrayList<>();

        for(MDOfficer mdOfficer : getAllOfficers) {

            MDOfficerDTO mdofficerDTO = new MDOfficerDTO (

                    mdOfficer.getEmpNumber(),
                    mdOfficer.getNicNumber(),
                    mdOfficer.getFirstName(),
                    mdOfficer.getLastName(),
                    mdOfficer.getEmail(),
                    mdOfficer.getContactNumber(),
                    mdOfficer.getOfficerPhotoUrl()
            );
            officerDTOList.add(mdofficerDTO);
        }
        return officerDTOList;
    }
}
