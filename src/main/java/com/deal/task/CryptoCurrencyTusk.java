package com.deal.task;

import com.deal.dto.CryptoCurrency;
import com.deal.dto.CryptocurrencyAllInfo;
import com.deal.repository.CryptoCurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class CryptoCurrencyTusk {

    private final CryptoCurrencyRepository cryptoCurrencyRepository;
    @Value("${binance.api.url}")
    private String url;
    private final RestClient restClient = RestClient.builder().build();

    @Scheduled(fixedRate = 3000)
    public void getRatesTask() {
        var currencyInfo = restClient
                .get()
                .uri(url)
                .retrieve()
                .body(CryptocurrencyAllInfo[].class);
        for (var info : currencyInfo) {
            var currencyPair = new CryptoCurrency(info.getSymbol(), info.getMarkPrice());
            cryptoCurrencyRepository.save(currencyPair);
        }
    }
}


