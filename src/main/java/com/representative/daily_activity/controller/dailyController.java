package com.representative.daily_activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.representative.daily_activity.Entity.dailyEntity;
import com.representative.daily_activity.Service.dailyService;

@Controller
@RequestMapping("/api/daily-activity")
public class dailyController {

    @Autowired
    private dailyService service;

    @GetMapping
    public List<dailyEntity> getAllActivities() {
        return service.getAllActivities();
    }

    @PostMapping("/adddetails")
    public ResponseEntity<dailyEntity> createActivity(@ModelAttribute dailyEntity activity) {
    	System.out.println("details");
    	//System.out.println(activity);
        dailyEntity createdActivity = service.createActivity(activity);
        return new ResponseEntity<>(createdActivity, HttpStatus.CREATED);
//        return new RedirectView("/daily_submission");
    }
    
    @GetMapping("/dispalyactivity")
    public String dispalyActivity() {
//        dailyEntity createdActivity = service.createActivity(activity);
//    	ModelAndView mvc = new ModelAndView();
//    	mvc.setViewName("daily_submission");
        return "daily_submission";
    }

    @GetMapping("/{id}")
    public ResponseEntity<dailyEntity> getActivityById(@PathVariable Long id) {
        dailyEntity activity = service.getActivityById(id);
        return ResponseEntity.ok(activity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id) {
        service.deleteActivity(id);
        return ResponseEntity.noContent().build();
    }
}

