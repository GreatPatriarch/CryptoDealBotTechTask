package com.deal.service;

import java.math.BigDecimal;

public interface CryptoCurrencyPriceService {



    BigDecimal getPrice(String symbol);
}
