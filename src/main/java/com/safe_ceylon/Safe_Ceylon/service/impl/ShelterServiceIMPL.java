package com.safe_ceylon.Safe_Ceylon.service.impl;

import com.safe_ceylon.Safe_Ceylon.dto.ShelterDTO;
import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import com.safe_ceylon.Safe_Ceylon.entity.Shelter;
import com.safe_ceylon.Safe_Ceylon.repository.ShelterRepo;
import com.safe_ceylon.Safe_Ceylon.service.interfac.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShelterServiceIMPL implements ShelterService {

    @Autowired
    private ShelterRepo shelterRepo;


    @Override
    public String saveSheleter(ShelterDTO shelterDTO) {

        Shelter shelter = new Shelter(

                shelterDTO.getShelter_id(),
                shelterDTO.getContact_Number(),
                shelterDTO.getCapacity(),
                shelterDTO.getLocation()
        );
        shelterRepo.save(shelter);
        return "Successfully Saved";
    }

    @Override
    public String updateSheleter(ShelterDTO shelterDTO) {

        if (shelterRepo.existsById(shelterDTO.getShelter_id())) {
            Shelter shelter = shelterRepo.getReferenceById(shelterDTO.getShelter_id());

            shelter.setContact_Number(shelterDTO.getContact_Number());
            shelter.setCapacity(shelterDTO.getCapacity());
            shelter.setLocation(shelterDTO.getLocation());
            shelterRepo.save(shelter);

            return shelterDTO.getShelter_id() + " Update Success";
        } else {

            throw new RuntimeException("No data found");
        }
      }
    }