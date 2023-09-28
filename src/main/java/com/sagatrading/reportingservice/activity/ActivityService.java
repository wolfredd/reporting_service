package com.sagatrading.reportingservice.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public List getAllActivities(){
        List<Activity> allActivities =  activityRepository.findAll();
        System.out.println(allActivities);
        return allActivities;
    }

    public List getAllUsersActivities(Integer userId){
        List<Activity> userActivities =  activityRepository.findAllByUserId(userId);
        System.out.println(userActivities);
        return userActivities;
    }

}
