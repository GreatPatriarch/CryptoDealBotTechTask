package com.deal.controller;

import com.deal.service.CryptoCurrencyPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("prices-api")
@RequiredArgsConstructor
public class CryptoPriceController {

    private final CryptoCurrencyPriceService cryptoCurrencyPriceService;

    @GetMapping("by-crypto/{symbol}")
    public ResponseEntity<BigDecimal> getPriceCryptoCurrency(@PathVariable(name = "symbol") String symbol) {
        return ResponseEntity.ok(this.cryptoCurrencyPriceService.getPrice(symbol));
    }
}
