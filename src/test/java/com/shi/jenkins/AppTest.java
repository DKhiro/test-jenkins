package com.shi.jenkins;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
		System.out.println("AppTest(String testName)......................70");
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		System.out.println("suite()......................2a");
		// return true;
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		System.out.println("testApp......................3a");
		assertTrue(true);
	}
}
