package com.example.FleetStudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/components/schemas/CountySuggestion")
public class CountyController {

    @Autowired
    CountyService countyService;


    @GetMapping("/list")
    public List<County> list() {
        return countyService.list();
    }

}
