package com.sap.cc.videostore;

import java.util.ArrayList;
import java.util.List;

class Statement {
    private String _name;
    private List<Rental> _rentals = new ArrayList<>();
    private double totalAmount;
    private int frequentRenterPoints;

    public Statement(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String generate() {
        clearTotals();
        String statementText = header();
        statementText = rentalLines(statementText);
        //add footer lines
        statementText = footer(statementText);
        return statementText;
    }

	public String footer(String statementText) {
		statementText += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        statementText += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
		return statementText;
	}

	public String rentalLines(String statementText) {
		for (Rental rental : _rentals) {
            statementText += rentalLine(rental);
        }
		return statementText;
	}

	private String rentalLine(Rental rental) {
		double rentalAmount = rental.determineAmount();
		// add frequent renter points
		frequentRenterPoints += rental.determineFrequentRenterPoints();
		totalAmount += rentalAmount;
		return formatRentalLine(rental, rentalAmount);
	}

	private String formatRentalLine(Rental rental, double rentalAmount) {
		//show figures for this rental
		String statementText = "";
		statementText += "\t" + rental.getMovie().getTitle() + "\t" +
		        String.valueOf(rentalAmount) + "\n";
		return statementText;
	}

	
    
    public void clearTotals() {
    	
    	totalAmount = 0;
        frequentRenterPoints = 0;
    	
    }
    
    public String header() {
    	
    	return "Rental Record for " + getName() + "\n";
    	
    }
}