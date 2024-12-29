package com.representative.daily_activity.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.representative.daily_activity.Entity.contactAdminEntity;
import com.representative.daily_activity.Entity.dailyEntity;
import com.representative.daily_activity.Repository.contactAdminRepository;

@Service
public class contactAdminService {

    @Autowired
    private contactAdminRepository repository;
    
    public List<contactAdminEntity> getAllContact() {
        return repository.findAll();
    }

    public contactAdminEntity createContact(contactAdminEntity contact) {
        return repository.save(contact);
    }
}
