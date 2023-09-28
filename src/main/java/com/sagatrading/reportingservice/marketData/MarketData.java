package com.sagatrading.reportingservice.marketData;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_marketData")
public class MarketData {

    @jakarta.persistence.Id
    @GeneratedValue//(strategy = GenerationType.SEQUENCE)
    @JsonProperty("id")
    private Integer Id;
    //@JsonProperty("orderType")
    @Enumerated(EnumType.STRING)
    private OrderType orderType;
    private String product;
    @Enumerated(EnumType.STRING)
    private Side side;
    private String orderID;
    private Double price;
    private Integer qty;
    private Integer cumQty;
    private Double cumPrx;
    private String exchange;
    private Date timestamp;







}
