package com.sap.cc.videostore;

public abstract class Movie {
   
    private String title;
   

    public Movie(String title) {
        this.title = title;
   
    }


    public String getTitle() {
        return title;
    }
    
    public abstract int determineFrequentRenterPoints(int daysRented);
    public abstract double determineAmount(int daysRented);

}