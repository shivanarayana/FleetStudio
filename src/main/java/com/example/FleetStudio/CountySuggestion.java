package com.example.FleetStudio;


import java.util.List;

public class CountySuggestion {

    private List<County> countries;

    public CountySuggestion(List<County> countries) {
        this.countries = countries;
    }

    public List<County> getCountries() {
        return countries;
    }

    public void setCountries(List<County> countries) {
        this.countries = countries;
    }
}
