package com.deal.service;

import com.deal.repository.CryptoCurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;


@Service
@RequiredArgsConstructor
public class DefaultCryptoCurrencyPriceService implements CryptoCurrencyPriceService {

    private final CryptoCurrencyRepository cryptoCurrencyRepository;

    @Override
    public BigDecimal getPrice(String symbol) {
       var cryptoCurrency = this.cryptoCurrencyRepository.findById(symbol)
               .orElseThrow(() -> new NoSuchElementException("Cryptocurrency price not found for: %s: ".formatted( symbol)));
       return cryptoCurrency.getMarkPrice();
    }
}
