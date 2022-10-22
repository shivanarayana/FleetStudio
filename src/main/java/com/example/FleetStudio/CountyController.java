package com.example.FleetStudio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountyController {

    private static final Logger logger = LoggerFactory.getLogger(CountyController.class);

    @Autowired
    CountyRepository countyRepo;

    @Autowired
    CountyService countyService;

    @GetMapping("/Hello")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/listAll")
    public List<County> list() {
        return countyService.list();
    }

    @GetMapping("/suggest/{name}")
    private List<County> getCountyFromName(@PathVariable("name") String name) {
        if (name.length() == 2) {
            return countyRepo.findByState(name);
        } else {
            return countyRepo.findByName(name);
        }
    }

    @GetMapping("/suggest/{name}/{state}")
    private List<County> getCountyFromBoth(@PathVariable("name") String name, @PathVariable("state") String state) {
        if (state.length() != 2) {
            state = state + name;
            name = state.substring(0, state.length() - name.length());
            state = state.substring(name.length());
        }
        return countyRepo.findByStateAndName(state, name);
    }

    @PostMapping("/add/county")
    private String saveCountry(@RequestBody County county) {
        countyService.saveCounty(county);
        return "1 record Saved";
    }

    @PostMapping("/add/countries")
    private String saveCountries(@RequestBody List<County> countyList) {
        countyService.saveAll(countyList);
        return "recordsSaved";
    }
}