package com.sagatrading.reportingservice.activity;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/activity")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/getallactivities")
    public ResponseEntity<List> getAllActivities(){
        return ResponseEntity.ok(activityService.getAllActivities());
    }

    @GetMapping("/viewclientsactivities/{userId}")
    public ResponseEntity<List> viewClientsActivities(
            @PathVariable("userId") Integer userId){
        return ResponseEntity.ok(activityService.getAllUsersActivities(userId));
    }
}
