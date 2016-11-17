/**
 * 
 */
package hburak.ConferenceArranger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author hburak
 *
 */
public class ConferenceArranger {

	private final static Logger LOGGER = Logger.getLogger(ConferenceArranger.class.getName());
	private File input;

	/**
	 * 
	 * @param inputFile
	 * @throws IOException
	 */
	public ConferenceArranger(File inputFile) throws IOException {
		this.input = inputFile;
		initialize();
	}

	/**
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		loadConferencesFromFile();
	}

	/**
	 * 
	 */
	private List<Conference> loadConferencesFromFile() throws FileNotFoundException, IOException {
		List<Conference> confList = new ArrayList<Conference>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
			String line = "";
			String confDuration = "";
			String confName = "";
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				// using regex to split the names and duration values of each conference
				confName = line.replaceAll("[^A-Za-z\\s]+", "");
				if (line.contains("lightning")) {
					confDuration = "5";
					confName.replaceAll("^(.(?!lightning))*$", "");
				} else {
					confDuration = line.replaceAll("[^\\d.]", "");
				}
				Conference conf = new Conference(confName, Double.parseDouble(confDuration));
				confList.add(conf);
				System.out.println("Name of the conference: " + conf.getName() + "... Duration: " + conf.getDuration() + " mins.");
			}
		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "Input File Not Found!", e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return confList;
	}

	/**
	 * 
	 */
	public void arrange() {
		try (BufferedReader inputFileBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {
			List<Conference> confList = new ArrayList<Conference>();
			List<Double> list = new ArrayList<Double>();
			Conference tempConf = new Conference();
			confList = loadConferencesFromFile();
			for(int i = 0; i < confList.size(); i++) {
				tempConf = confList.get(i);
				list.add(tempConf.getDuration());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
