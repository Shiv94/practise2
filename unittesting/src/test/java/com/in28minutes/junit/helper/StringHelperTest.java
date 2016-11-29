package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	@Before
	public void before(){
		helper= new StringHelper();
	}
	
	@Test
	public void testtruncateAInFirst2Positions() {
		
		//assert(expected,actual)
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		
	}
	@Test
	public void testtruncateAInFirst2Positions2() {
		
		//assert(expected,actual)		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame(){
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame2(){
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		
	}
	
	@After
	public void TearDown(){
		
		
	}
	
	
	
	
}
