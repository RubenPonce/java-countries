package com.javacountries.javacountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavacountriesApplication {
static CountryList myCountrylist;
    public static void main(String[] args) {
        myCountrylist = new CountryList();

        SpringApplication.run(JavacountriesApplication.class, args);
    }

}
