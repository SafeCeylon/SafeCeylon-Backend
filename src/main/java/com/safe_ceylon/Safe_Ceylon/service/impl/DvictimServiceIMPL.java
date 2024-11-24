package com.safe_ceylon.Safe_Ceylon.service.impl;


import com.safe_ceylon.Safe_Ceylon.dto.DvictimDTO;
import com.safe_ceylon.Safe_Ceylon.entity.Dvictim;
import com.safe_ceylon.Safe_Ceylon.repository.DvictimRepo;
import com.safe_ceylon.Safe_Ceylon.service.interfac.DvictimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DvictimServiceIMPL implements DvictimService {

    @Autowired
    private DvictimRepo dvictimRepo;

    @Override
    public String saveDvictim(DvictimDTO dvictimDTO) {

        Dvictim dvictim = new Dvictim(
                dvictimDTO.getDv_id(),
                dvictimDTO.getShelter_id(),
                dvictimDTO.getD_type(),
                dvictimDTO.getRecord_date()
        );
        dvictimRepo.save(dvictim);
        return "";
    }
}