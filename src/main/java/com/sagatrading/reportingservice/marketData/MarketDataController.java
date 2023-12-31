package com.sagatrading.reportingservice.marketData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// This means that this class is a Controller
@RequestMapping(path = "/marketdata") // This means URL's start with /demo (after Application path)
@CrossOrigin("*")
public class MarketDataController {
     // @Autowired This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data

    @Autowired
    private MarketDataService marketDataService;



    @GetMapping("/getallmarket")
    public ResponseEntity<List> getAllMarketData(){
        return ResponseEntity.ok(marketDataService.getAllMarketData());
    }

    //    @GetMapping("/hello")
    //    public ResponseEntity<String> hello(){
    //        return ResponseEntity.ok("hello");
    //    }
    //
    //
    //    @PostMapping(path = "/add") // Map ONLY POST Requests
    //    public @ResponseBody String addNewUser(@RequestParam String name
    //            , @RequestParam String email) {
    //        // @ResponseBody means the returned String is the response, not a view name
    //        // @RequestParam means it is a parameter from the GET or POST request
    //
    //        User n = new User();
    //        n.setName(name);
    //        n.setEmail(email);
    //        userRepository.save(n);
    //        return "Saved";
    //    }
    //
    //    @GetMapping(path = "/all")
    //    public @ResponseBody Iterable<User> getAllUsers() {
    //        // This returns a JSON or XML with the users
    //        return userRepository.findAll();
    //    }
}

