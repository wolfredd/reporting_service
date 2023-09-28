package com.sagatrading.reportingservice.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_order_reporting")
public class Order {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

    @jakarta.persistence.Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE)
    @JsonProperty("id")
    private UUID id;
    private String product;
    private int quantity;
    private double price;
    private OrderSide side;
    private OrderType type;



    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", side=" + side +
                ", type=" + type +
                '}';
    }
}
