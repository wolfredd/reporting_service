package com.sagatrading.reportingservice.marketData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketDataRepository extends JpaRepository<MarketData, Integer> {
}
