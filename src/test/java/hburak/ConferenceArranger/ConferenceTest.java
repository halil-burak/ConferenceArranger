package hburak.ConferenceArranger;

import junit.framework.TestCase;

public class ConferenceTest extends TestCase {
	public ConferenceTest() {
		
	}
	
	protected void setUp() {
		Conference conf = new Conference();
		conf.setDuration(45);
		conf.setName("Run");
	}
	
	
}
