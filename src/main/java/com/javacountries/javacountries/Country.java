package com.javacountries.javacountries;

public class Country {
    private String name;
    private int population;
    private int landAreaKm;
    private int medianAge;



    public Country(String name, int population, int landAreaKm, int medianAge) {
        this.name =
                name;
        this.population =
                population;
        this.landAreaKm =
                landAreaKm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =
                name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population =
                population;
    }

    public int getLandAreaKm() {
        return landAreaKm;
    }

    public void setLandAreaKm(int landAreaKm) {
        this.landAreaKm =
                landAreaKm;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge =
                medianAge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" +
                name +
                '\'' +
                ", population=" +
                population +
                ", landAreaKm=" +
                landAreaKm +
                '}';
    }
}
