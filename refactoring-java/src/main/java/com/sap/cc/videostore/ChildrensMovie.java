package com.sap.cc.videostore;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int determineFrequentRenterPoints(int daysRented) {
		return 1;
	}

	public double determineAmount(int daysRented) {
		//determine amounts for rental line
		
		        double rentalAmount = 1.5;
		        if (daysRented > 3)
		            rentalAmount += (daysRented - 3) * 1.5;
		       
		return rentalAmount;
	}

}