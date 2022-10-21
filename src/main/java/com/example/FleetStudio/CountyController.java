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

    @GetMapping("/listAllCountries")
    public List<County> list() {
        return countyService.list();
    }

    @GetMapping("/suggest/{name}")
    private List<County> getCountyFromName(@PathVariable("name") String name){
        if(name.length()==2){
            return countyRepo.findByState(name);
        }
        else {
            return countyRepo.findByName(name);
        }
    }

    @GetMapping("/suggest/{name}/{state}")
    private List<County> getCountyFromBoth(@PathVariable("name") String name,@PathVariable("state") String state){
        return countyRepo.findByStateAndName(state,name);
    }

    @PostMapping("/add/county")
    private String saveCountry(@RequestBody County county) {
        if (county != null) {
            County county1 = new County();
            county1.setFips(county.getFips());
            county1.setName(county.getName());
            county1.setState(county.getState());
            countyRepo.save(county1);
        }
        return "1 record Saved";
    }

    @PostMapping("/add/countries")
    private String saveCountries(@RequestBody List<County> countyList) {
        for (County county : countyList) {
            if (county != null) {
                County county1 = new County();
                county1.setFips(county.getFips());
                county1.setName(county.getName());
                county1.setState(county.getState());
                countyRepo.save(county1);
            }
        }
        return "recordsSaved";
    }
}