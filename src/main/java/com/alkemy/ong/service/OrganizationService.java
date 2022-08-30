package com.alkemy.ong.service;

import com.alkemy.ong.dto.OrganizationDTO;

public interface OrganizationService {
    OrganizationDTO getPublicInformation(String id);

    OrganizationDTO update(OrganizationDTO dto, String id);
}
