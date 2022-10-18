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
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<County>> typeReference = new TypeReference<List<County>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/data.json");
			try {
				List<County> Countys = mapper.readValue(inputStream, typeReference);
				countyService.save(Countys);
				System.out.println("Countys Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save Countys: " + e.getMessage());
			}
		};
	}
}