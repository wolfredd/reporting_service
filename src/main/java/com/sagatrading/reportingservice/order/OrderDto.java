package com.sagatrading.reportingservice.order;

import lombok.Data;

@Data
public class OrderDto {
    private String product;
    private double quantity;
    private OrderSide orderSide;
}