package com.sagatrading.reportingservice.redisSubscriber;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sagatrading.reportingservice.marketData.MarketData;
import com.sagatrading.reportingservice.marketData.MarketDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class RedisSubscriber {

    @Autowired
    MarketDataRepository marketDataRepository;
    public void handleMessage(String message) {
        //System.out.println(message);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            MarketData myObject = objectMapper.readValue(message, MarketData.class);

            System.out.println("recieved from Market Data Service: " + myObject);
            marketDataRepository.save(myObject);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}


