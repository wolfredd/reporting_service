package com.sagatrading.reportingservice.order;

import com.sagatrading.reportingservice.marketData.MarketData;
import com.sagatrading.reportingservice.marketData.MarketDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List getAllOrders(){
        List<Order> allOrders =  orderRepository.findAll();
        List<Order> allOrdersNew =  orderRepository.findAll();

        for (Order order: allOrders) {
            if (order.getSide() == null){
                allOrders.remove(order);
            }
        }

        System.out.println(allOrders);
        return allOrders;
    }
}

