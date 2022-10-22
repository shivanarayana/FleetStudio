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

    public void saveAll(List<County> countyList) {
        for (County county : countyList) {
            saveCounty(county);
            if(county==null) break;
        }
        System.out.println("(List<County>) saved(Countys)");
    }

    public void saveCounty(County county) {
        if (county != null) {
            County county1 = new County();
            county1.setFips(county.getFips());
            county1.setName(county.getName());
            county1.setState(county.getState());
            countyRepository.save(county1);
        }
    }
}