package com.deal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@RedisHash
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CryptoCurrency {
    @Id
    private String symbol;
    private BigDecimal markPrice;
}
