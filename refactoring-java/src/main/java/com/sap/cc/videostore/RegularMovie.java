package com.sap.cc.videostore;

public class RegularMovie extends Movie {

	public RegularMovie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int determineFrequentRenterPoints(int daysRented) {
		return 1;
	}

	public double determineAmount(int daysRented) {
		//determine amounts for rental line
		        double rentalAmount = 2;
		        if (daysRented > 2)
		            rentalAmount += (daysRented - 2) * 1.5;
		return rentalAmount;
	}

}