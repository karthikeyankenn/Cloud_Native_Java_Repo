package com.sap.cc.videostore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {

    private Movie regularMovie;
    private Movie newReleaseMovie;
    private Movie childrensMovie;

    @BeforeEach
    void setUp() {
        regularMovie = new RegularMovie("RRRrrrr!!!");
        newReleaseMovie = new NewReleaseMovie("Interstellar");
        childrensMovie = new ChildrensMovie("Zootopie");
        // regularMovie = new Movie("RRRrrrr!!!", Movie.REGULAR);
        //  newReleaseMovie = new Movie("Interstellar", Movie.NEW_RELEASE);
        //  childrensMovie = new Movie("Zootopie", Movie.CHILDRENS);
    }

    @Test
    public void testStatementNoRental() {
        Statement statement = new Statement("Me");
        assertEquals("Rental Record for Me\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementRegularShortRental() {
        Statement statement= new Statement("Me");
        statement.addRental(new Rental(regularMovie, 2));
        assertEquals("Rental Record for Me\n" +
                "\tRRRrrrr!!!\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementRegularLongRental() {
        Statement statement = new Statement("Me");
        statement.addRental(new Rental(regularMovie, 10));
        assertEquals("Rental Record for Me\n" +
                "\tRRRrrrr!!!\t14.0\n" +
                "Amount owed is 14.0\n" +
                "You earned 1 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementNewReleaseShortRental() {
        Statement statement = new Statement("Me");
        statement.addRental(new Rental(newReleaseMovie, 1));
        assertEquals("Rental Record for Me\n" +
                "\tInterstellar\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementNewReleaseLongRental() {
        Statement statement = new Statement("Me");
        statement.addRental(new Rental(newReleaseMovie, 3));
        assertEquals("Rental Record for Me\n" +
                "\tInterstellar\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementChildrensShortRental() {
        Statement statement = new Statement("Me");
        statement.addRental(new Rental(childrensMovie, 2));
        assertEquals("Rental Record for Me\n" +
                "\tZootopie\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementChildrensLongRental() {
        Statement statement= new Statement("Me");
        statement.addRental(new Rental(childrensMovie, 6));
        assertEquals("Rental Record for Me\n" +
                "\tZootopie\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 1 frequent renter points", statement.generate());
    }

    @Test
    public void testStatementSeveralRentals() {
        Statement statement = new Statement("Me");
        statement.addRental(new Rental(childrensMovie, 1));
        statement.addRental(new Rental(newReleaseMovie, 2));
        statement.addRental(new Rental(regularMovie, 1));
        assertEquals("Rental Record for Me\n" +
                "\tZootopie\t1.5\n" +
                "\tInterstellar\t6.0\n" +
                "\tRRRrrrr!!!\t2.0\n" +
                "Amount owed is 9.5\n" +
                "You earned 4 frequent renter points", statement.generate());
    }
}
