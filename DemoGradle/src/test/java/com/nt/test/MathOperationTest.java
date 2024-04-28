package com.nt.test;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import com.nt.basics.MathOperation;


public class MathOperationTest {
	
/*Successful testcases
@Test
public void testPositve() {
int expected=300;
int actual = new MathOperation().sum(100, 200);
assertEquals("Test Positive:", expected, actual);
}

@Test
public void testNegative() {
int expected=-300;
int actual = new MathOperation().sum(-100, -200);
assertEquals("Test Negative:", expected, actual);
}

@Test
public void testMixed() {
int expected=-100;
int actual = new MathOperation().sum(100, -200);
assertEquals("Test Positive:", expected, actual);
}

@Test
public void testZeros() {
int expected=0;
int actual = new MathOperation().sum(0, 0);
assertEquals("Test Positive:", expected, actual);
}
*/
	@Ignore 
	@Test
	public void testPositve() {
	int expected=300;
	int actual = new MathOperation().sum(100, 200);
	assertEquals("Test Positive:", expected, actual);
	} 
	
	@Test
	public void testNegative() {
	int expected=300;
	int actual = new MathOperation().sum(-100, -200);
	assertEquals("Test Negative:", expected, actual);
	} 
	
	@Test
	public void testMixed() {
	int expected=-100;
	int actual = new MathOperation().sum(100, -200);
	assertEquals("Test Positive:", expected, actual);
	} 
	
	@Test
	public void testZeros() {
	int expected=0;
	int actual = new MathOperation().sum(0, 0);
	assertEquals("Test Positive:", expected, actual);
	}

}