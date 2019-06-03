package com.javacountries.javacountries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
@RequestMapping("/names")
public class CountryNameController {
    @RequestMapping(value="all", produces={"application/json"})
    public ResponseEntity<?> alignAlphabetically(){
        JavacountriesApplication.myCountrylist.countryList.sort((c1,c2)-> c1.getName().compareToIgnoreCase(c2.getName()));
        return new ResponseEntity<>(JavacountriesApplication.myCountrylist.countryList, HttpStatus.OK);
    }

    @RequestMapping(value="/start/{letter}",produces = {"application/json"})
    public ResponseEntity<?>getCountryWithLetter(@PathVariable char letter){
        ArrayList<Country> tempCountry = JavacountriesApplication.myCountrylist.findCountries(c->c.getName().toUpperCase().charAt(0)==Character.toUpperCase(letter));
        return new ResponseEntity<>(tempCountry, HttpStatus.OK);
    }
}
