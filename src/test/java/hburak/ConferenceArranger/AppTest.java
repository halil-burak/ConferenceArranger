package hburak.ConferenceArranger;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private final static Logger LOGGER = Logger.getLogger(AppTest.class.getName());
	
	private Conference conf;
	private ConferenceArranger confArrngr;
	private ConferenceSorter confSorter;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	File dictionary = new File(ConferenceArrangerMain.class.getClassLoader().getResource("deneme.txt").getFile());
        conf = new Conference();
        LOGGER.log(Level.ALL, Thread.currentThread().getStackTrace().toString() + " Finished.");
    }
}
