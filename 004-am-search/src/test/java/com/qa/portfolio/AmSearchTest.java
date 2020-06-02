package com.qa.portfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test file for AmSearch Class.
 * 
 * Run this file to assess progress.
 * 
 * DO NOT EDIT THIS FILE!
 * 
 */
public class AmSearchTest {

	private AmSearch answers;
	
	@Before
	public void setup() {
		answers = new AmSearch();
	}
	
	@Test
	public void singleAmTest() {
		assertEquals(1, answers.amSearch("I am in Paris"));
	}
	
	@Test
	public void multiAmTest() {
		assertEquals(2, answers.amSearch("I am in Paris am I?"));
	}
	
	@Test
	public void ignoreCaseTest() {
		assertEquals(2, answers.amSearch("I AM in Paris aM I?"));
	}
	
	@Test
	public void beginningAndEndingAmTest() {
		assertEquals(2, "Am I in Paris? I'm sure I am");
	}
	
	@Test
	public void amNotAsAWordTest() {
		assertEquals(2, "I am in Amsterdam am I?");
	}
	
	@Test
	public void amNotAsAWordEndingTest() {
		assertEquals(0, "I have been in Amsterdam");
	}
}
