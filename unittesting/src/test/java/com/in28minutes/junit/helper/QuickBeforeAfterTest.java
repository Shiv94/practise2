package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	@BeforeClass
	public static void BeforeClass() {

		System.out.println("Before class");
	}

	@Before
	public void setup() {
		System.out.println("Before Test");

	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void TearDown() {
		System.out.println("After Test");
	}
	
	@org.junit.AfterClass
	public static void AfterClass(){
		System.out.println("After class");
	}
	
	
	
}
