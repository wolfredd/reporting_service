package com.sagatrading.reportingservice.rabbitMQListener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sagatrading.reportingservice.order.Order;
import com.sagatrading.reportingservice.order.OrderRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @Autowired
    OrderRepository orderRepository;

    @RabbitListener(queues = "orderProcessing.queue")
    public void processOrder(String serializedOrder) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Order order = objectMapper.readValue(serializedOrder, Order.class);
            System.out.println("recieved order: " + order);
            orderRepository.save(order);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
