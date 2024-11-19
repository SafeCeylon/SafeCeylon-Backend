package com.safe_ceylon.Safe_Ceylon.service.interfac;

import com.safe_ceylon.Safe_Ceylon.entity.MDOfficer;
import org.springframework.stereotype.Service;


@Service
public interface MDOfficerService {
    MDOfficer saveOfficer(MDOfficer mdofficer);
}
