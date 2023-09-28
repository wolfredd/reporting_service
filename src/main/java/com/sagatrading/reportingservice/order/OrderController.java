package com.sagatrading.reportingservice.order;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/getallorders")
    public ResponseEntity<List> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }
}
