package hburak.ConferenceArranger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class ConferenceArrangerMain 
{
	final static String FILE_NAME = "deneme.txt";
	
    public static void main( String[] args ) throws IOException
    {
        File inputFile;
        inputFile = new File(ConferenceArrangerMain.class.getClassLoader().getResource(FILE_NAME).getFile());
        ConferenceArranger confArrngr = new ConferenceArranger(inputFile);
        ConferenceSorter confSorter = new ConferenceSorter();
        List<Conference> confList = new ArrayList<Conference>();
        confList = confArrngr.arrange();
        /*
         * 180 minutes -> from 09:00 AM to 12:00 AM
         */
        confSorter.initializer(confList, 0, confList.size(), 180);
        /* 
         * from 01:00 PM to at least 04:00 PM or at most 05:00 PM
         * this means that total duration in minutes after lunch until networking is at least 180 minutes or at most 240 minutes
         * this will be decided by generating a random number between 0 and 60 inclusive  
         */
        Random generator = new Random();
        int i = generator.nextInt(60);
        confSorter.initializer(confList, 0, confList.size(), 180 + i);
    }
}
