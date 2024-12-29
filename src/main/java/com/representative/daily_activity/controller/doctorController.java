package com.representative.daily_activity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.representative.daily_activity.Entity.dailyEntity;
import com.representative.daily_activity.Entity.doctorEntity;
import com.representative.daily_activity.Service.doctorService;


@RestController
@RequestMapping("/api/doctors")
public class doctorController {

    @Autowired
    private doctorService doctorService;
    
    @GetMapping
    public List<doctorEntity> getAllDoctor() {
        return doctorService.getAllDoctors();
    }

//    @PostMapping("/addDoctors")
//    public ResponseEntity<doctorEntity> saveDoctor(@RequestBody doctorEntity doctor) {
//    	doctorEntity savedDoctor = doctorService.saveDoctor(doctor);
//        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
//    }
    
    
    @PostMapping("/addDoctors")
    public ResponseEntity<doctorEntity> saveDoctor(@ModelAttribute doctorEntity doctor) {
    	System.out.println("details");
    	//System.out.println(activity);
    	doctorEntity savedDoctor = doctorService.saveDoctor(doctor);
    	return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
//        return new RedirectView("/daily_submission");
    }
    
    @GetMapping("/displayDoctors")
   // public String displayDoctors() {
    public ResponseEntity<List<doctorEntity>> getAllDoctors() {
        List<doctorEntity> doctors = doctorService.getAllDoctors();
    	return new ResponseEntity<>(doctors, HttpStatus.OK);
        //return "Add_Doctor";
    }
    


    
}
