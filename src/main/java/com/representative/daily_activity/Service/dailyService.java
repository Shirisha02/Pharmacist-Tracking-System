package com.representative.daily_activity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.representative.daily_activity.Entity.dailyEntity;
import com.representative.daily_activity.Repository.dailyRepository;

@Service
public class dailyService {

    @Autowired
    private dailyRepository repository;

    public List<dailyEntity> getAllActivities() {
        return repository.findAll();
    }

    public dailyEntity createActivity(dailyEntity activity) {
        return repository.save(activity);
    }

    public dailyEntity getActivityById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Activity not found"));
    }

    public void deleteActivity(Long id) {
        repository.deleteById(id);
    }
}
