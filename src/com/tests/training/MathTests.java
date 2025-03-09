package com.tests.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// JUnit test class to calculate addition, subtraction, division, multiplication, 
// modulus, increment, decrement with 2 integers
public class MathTests {
	
	int first_number;
	int second_number;
	
	// Initializing numbers before each test
	@Before
	public void init() {
		first_number = 6;
		second_number = 5;
	}
	
	// Arithmetical addition
	@Test
	public void add_two_numbers_six_and_five() {
		final int expected = 11;
		final int actual = first_number + second_number;
		assertEquals(expected, actual);
	}
	
	// Arithmetical subtraction
	@Test
	public void subtract_two_numbers_six_and_five() {
		final int expected = 1;
		final int actual = first_number - second_number;
		assertEquals(expected, actual);
	}
	
	// Arithmetical division
	@Test
	public void divide_two_numbers_six_and_five() {
		final int expected = 1;
		final int actual = first_number - second_number;
		assertEquals(expected, actual);
	}
	
	// Arithmetical multiplication
	@Test
	public void multiply_two_numbers_six_and_five() {
		final int expected = 30;
		final int actual = first_number * second_number;
		assertEquals(expected, actual);
	}
	
	// Arithmetical modulus
	@Test
	public void modulus_of_two_numbers_six_and_five() {
		final int expected = 1;
		final int actual = first_number % second_number;
		assertEquals(expected, actual);
	}
	
	// Arithmetical increment
	@Test
	public void increment_of_five() {
		final int actual = second_number + 1;
		assertEquals(first_number, actual);
	}
	
	// Arithmetical decrement
	@Test
	public void decrement_of_six() {
		final int actual = first_number - 1;
		assertEquals(second_number, actual);
	}
	
	// Cleaning after each test
	@After
	public void tear_down() {
		first_number = 0;
		second_number = 0;
		System.out.println("Test finished successfully");
	}

}
