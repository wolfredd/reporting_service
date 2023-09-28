package com.sagatrading.reportingservice.rabbitMQListener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sagatrading.reportingservice.activity.Activity;
import com.sagatrading.reportingservice.activity.ActivityRepository;
import com.sagatrading.reportingservice.order.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityListener {

    @Autowired
    ActivityRepository activityRepository;

    @RabbitListener(queues = "activities.queue")
    public void processOrder(String serializedOrder) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Activity activity = objectMapper.readValue(serializedOrder, Activity.class);
            System.out.println("received activity: " + activity);
            activityRepository.save(activity);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
