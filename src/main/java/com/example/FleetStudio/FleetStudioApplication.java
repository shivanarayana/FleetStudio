package com.example.FleetStudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class FleetStudioApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetStudioApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CountyService countyService) {
        return args -> {
            // read json and write to db
            try {
                TypeReference<List<County>> typeReference = new TypeReference<List<County>>() {
                };
                InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
                List<County> Countys = new ObjectMapper().readValue(inputStream, typeReference);
                if (Countys != null && !Countys.isEmpty()) {
                    countyService.saveAll(Countys);
                    System.out.println("All Counties Saved!");
                }
            } catch (IOException e) {
                System.out.println("Unable to save Countys: " + e.getMessage());
            }
        };
    }
}