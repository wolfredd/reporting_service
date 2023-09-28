package com.sagatrading.reportingservice.activity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

    List<Activity> findAllByUserId(Integer userId);
}
