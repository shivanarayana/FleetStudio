package com.example.FleetStudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountyService {

    @Autowired
    CountyRepository countyRepository;

    public CountyService(CountyRepository CountyRepository) {
        this.countyRepository = CountyRepository;
    }

    public List<County> list() {
        return (List<County>) countyRepository.findAll();
    }

    public String save(List<County> Countys) {
        return "(List<County>) countyRepository.save(Countys)";
    }

//    public List<County> getCountryByName() {
//        countyRepository.get
//    }
}
