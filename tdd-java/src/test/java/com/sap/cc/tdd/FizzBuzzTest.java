package com.sap.cc.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void oneShouldGiveOne() {
		assertThat(fizzBuzz.print(1)).isEqualTo("1");
	
	}
	@Test
	public void twoShouldGiveTwo() {
		assertThat(fizzBuzz.print(2)).isEqualTo("2");
	
	}
	@Test
	public void threeShouldGiveThree() {
		assertThat(fizzBuzz.print(3)).isEqualTo("Fizz");
	
	}

	@Test
	public void fiveShouldGiveFive() {
		assertThat(fizzBuzz.print(5)).isEqualTo("Buzz");
	
	}
	@Test
	public void tenShouldGiveTen() {
		assertThat(fizzBuzz.print(10)).isEqualTo("Buzz");
	
	}
	@Test
	public void fifteenShouldGiveFifteen() {
		assertThat(fizzBuzz.print(15)).isEqualTo("FizzBuzz");
	
	}
	

}
