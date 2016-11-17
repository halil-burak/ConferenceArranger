package hburak.ConferenceArranger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class ConferenceArrangerMain 
{
	final static String FILE_NAME = "C:\\deneme.txt";
    final static Charset ENCODING = StandardCharsets.UTF_8;
	
    public static void main( String[] args ) throws IOException
    {
        //readFromTxtFile(FILE_NAME);
        File inputFile;
        inputFile = new File(ConferenceArrangerMain.class.getClassLoader().getResource("deneme.txt").getFile());
        ConferenceArranger confArrngr = new ConferenceArranger(inputFile);
        confArrngr.arrange();
    }
}
