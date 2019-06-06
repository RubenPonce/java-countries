package com.javacountries.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@RestController
@RequestMapping("/population")
public class CountryPopulationController {
    @RequestMapping(value="/size/{people}", produces={"application/json"})
    public ResponseEntity<?>sortByPopulation(@PathVariable int people){
//finish this.
        ArrayList<Country> stuff = JavacountriesApplication.myCountrylist.findCountries(c-> c.getPopulation() >= people);
        return new ResponseEntity<>(stuff, HttpStatus.OK);
    }

    @RequestMapping(value="/size/min",produces = {"application/json"})
    public ResponseEntity<?> sortByMinimumPopulation(){
        ArrayList<Country> minPopulation = JavacountriesApplication.myCountrylist.countryList;
        Country min = minPopulation.stream().min(Comparator.comparing(Country::getPopulation)).orElse(null);
    return new ResponseEntity<>(min, HttpStatus.OK);
    }
    @RequestMapping(value="/size/max",produces = {"application/json"})
    public ResponseEntity<?> sortByMaximumPopulation(){
        ArrayList<Country> minPopulation = JavacountriesApplication.myCountrylist.countryList;
        Country max = minPopulation.stream().max(Comparator.comparing(Country::getPopulation)).orElse(null);
        return new ResponseEntity<>(max, HttpStatus.OK);

    }
}
