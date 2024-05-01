package com.deal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CryptocurrencyAllInfo {
    private String symbol;
    private BigDecimal markPrice;
    private BigDecimal  indexPrice;
    private BigDecimal   estimatedSettlePrice;
    private BigDecimal   lastFundingRate;
    private BigDecimal  nextFundingTime;
    private BigDecimal  interestRate;
    private Long time;
}
