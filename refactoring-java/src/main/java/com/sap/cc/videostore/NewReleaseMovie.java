package com.sap.cc.videostore;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int determineFrequentRenterPoints(int daysRented) {
		int frequentRenterPoints = 1;
		// add bonus for a two day new release rental
		if (daysRented > 1) frequentRenterPoints++;
		
		return frequentRenterPoints;
	}

	public double determineAmount(int daysRented) {
		//determine amounts for rental line
		
		 return daysRented * 3;
	
	}

}