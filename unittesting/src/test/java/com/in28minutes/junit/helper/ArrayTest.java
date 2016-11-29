package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testArraySort() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

	}
	//when you are testing for an exception you are hoping for it to happen
	//if it does not then this results in failure
	@Test(expected= NullPointerException.class)
	public void test(){
		int[] numbers=null;
		
		Arrays.sort(numbers);
		
	}
	@Test(timeout=1000)
	public void test1(){
		int[] numbers= {1,5,2,3};
		for(int i=1;i<10000;i++){
			numbers[0]=i;
			Arrays.sort(numbers);
		}
		
	}
	

}
