package com.representative.daily_activity.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.representative.daily_activity.Entity.doctorEntity;
import com.representative.daily_activity.Repository.doctorRepository;

@Service
public class doctorService {

    @Autowired
    private doctorRepository doctorRepository;

    public List<doctorEntity> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Optional<doctorEntity> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    public doctorEntity saveDoctor(doctorEntity doctor) {
        return doctorRepository.save(doctor);
    }

 
    }

 