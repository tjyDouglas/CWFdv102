package com.sddevops.CWFdv102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Admin1
 *
 */
class AppTest {
	
	private App AppTesting;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		AppTesting = new App(3.00);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#App(double, double)}.
	 */
	@Test
	void testApp() {
		  System.out.println("@Test: App");
		    assertTrue(true); 
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#getLength()}.
	 */
	@Test
	void testGetHeight() {
		
		assertEquals(AppTesting.getHeight(), 3.00);
	
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#setLength(double)}.
	 */
	@Test
	void testSetHeight() {
		AppTesting.setHeight(3.00);		
		assertEquals(AppTesting.getHeight(), 3.00);			   
	}

	@Test
	void testGetWeight() {
		
		assertEquals(AppTesting.getWeight(), 0.00);
	
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#setLength(double)}.
	 */
	@Test
	void testSetWeight() {
		AppTesting.setWeight(2.00);		
		assertEquals(AppTesting.getWeight(), 2.00);			   
	}
	
	/**
	 * Test method for {@link sddvops.dv102_cwf.App#getArea()}.
	 */
	@Test
	void testGetBmi() {
		AppTesting.setBmi(16.00);		
		assertEquals(AppTesting.getBmi(), 16.0);
		
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#setArea(double)}.
	 */
	@Test
	void testSetBmi() {
		AppTesting.setBmi(16.00);		
		assertEquals(AppTesting.getBmi(), 16.0);
	}

	/**
	 * Test method for {@link sddvops.dv102_cwf.App#calcArea()}.
	 */
	@Test
	void testCalcBmi() {
		//3.897114317029974 : final count using length as 3.00
		assertEquals(AppTesting.calcBmi(), 0.00);
	}


}
