package com.indus.training.core;

import junit.framework.TestCase;

/**
 * Provides Test Cases for State Class
 */
public class TestState extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void TestScenario() {

		State stateObj = new State("Andhra Pradesh", "15°54′46.80″ North");
		State.Capital capitalObj = stateObj.new Capital("Amaravathi");
		stateObj.setCapital(capitalObj);
		stateObj.setChiefminister("Chandra Babu Naidu");
		assertEquals("Andhra Pradesh", stateObj.getName());
		assertEquals("Amaravathi", stateObj.getCapital().getName());
		assertEquals("Chandra Babu Naidu", stateObj.getChiefminister());
	}

}
