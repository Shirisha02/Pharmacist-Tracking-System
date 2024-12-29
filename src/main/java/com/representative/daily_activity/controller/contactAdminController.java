package com.representative.daily_activity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


import com.representative.daily_activity.Entity.contactAdminEntity;
import com.representative.daily_activity.Entity.dailyEntity;
import com.representative.daily_activity.Service.contactAdminService;


@Controller
@RequestMapping("/api/contact_admin")
public class contactAdminController {

    @Autowired
    private contactAdminService service;
    
    @GetMapping
    public List<contactAdminEntity> getAllContact() {
        return service.getAllContact();
    }
    @PostMapping("/submit")
    public ResponseEntity<contactAdminEntity> createContact(@ModelAttribute contactAdminEntity contact) {
    	System.out.println("details");
    	//System.out.println(activity);
    	contactAdminEntity createdContact = service.createContact(contact);
        return new ResponseEntity<>(createdContact, HttpStatus.CREATED);
    }  
    
    @GetMapping("/dispalycontact")
    public String dispalyContact() {
//        dailyEntity createdActivity = service.createActivity(activity);
//    	ModelAndView mvc = new ModelAndView();
//    	mvc.setViewName("daily_submission");
        return "Contact_Admin";
    }
}