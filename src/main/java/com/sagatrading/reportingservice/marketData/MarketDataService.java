package com.sagatrading.reportingservice.marketData;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MarketDataService {

    @Autowired
    private MarketDataRepository marketDataRepository;


    public List getAllMarketData(){
        List<MarketData> marketDatas =  marketDataRepository.findAll();
        System.out.println(marketDatas);
        return marketDatas;
    }
}
