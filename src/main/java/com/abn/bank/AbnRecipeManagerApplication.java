package com.abn.bank;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.abn.bank", "com.abn.bank.api" , "org.openapitools.configuration"})
public class AbnRecipeManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbnRecipeManagerApplication.class, args);
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}