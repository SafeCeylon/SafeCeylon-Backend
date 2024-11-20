package com.safe_ceylon.Safe_Ceylon.service.interfac;


import com.safe_ceylon.Safe_Ceylon.dto.MDOfficerDTO;

import java.util.List;

public interface MDOfficerService {

    public String saveMdofficer(MDOfficerDTO mdOfficerDTO);

    public String updateMdofficer(MDOfficerDTO mdOfficerDTO);

    String deleteMdofficer(Long empNumber);

    List<MDOfficerDTO> getAllOfficers();
}
