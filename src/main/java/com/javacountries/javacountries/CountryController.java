package com.javacountries.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class CountryController {
    @GetMapping(value = "/countries", produces = {"application/json"})
    public ResponseEntity<?> getAllCountries(){
        return new ResponseEntity<>( JavacountriesApplication.myCountrylist, HttpStatus.OK);
    }
}
