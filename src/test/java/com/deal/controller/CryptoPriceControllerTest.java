package com.deal.controller;

import com.deal.service.CryptoCurrencyPriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class CryptoPriceControllerTest {

    @Mock
    private CryptoCurrencyPriceService service;

    @InjectMocks
    private CryptoPriceController controller;

    @Test
    void getPriceCryptoCurrency_SymbolExists_ReturnsPrice() {
        // given
        String symbol = "BTC";
        BigDecimal expectedPrice = new BigDecimal("50000");
        doReturn(expectedPrice).when(this.service).getPrice(symbol); // изменение здесь

        // when
        var result = this.controller.getPriceCryptoCurrency(symbol);

        // then
        assertEquals(expectedPrice, result.getBody());
    }
}