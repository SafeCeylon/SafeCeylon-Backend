package com.safe_ceylon.Safe_Ceylon.service.interfac;

import com.safe_ceylon.Safe_Ceylon.dto.ShelterDTO;

public interface ShelterService {
    String saveSheleter(ShelterDTO shelterDTO);

    String updateSheleter(ShelterDTO shelterDTO);
}
