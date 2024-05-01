package com.deal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CryptoDealBotTechTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoDealBotTechTaskApplication.class, args);
    }

}
