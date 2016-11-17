package hburak.ConferenceArranger;

/**
 * 
 * @author hburak
 *
 */
public class Conference {
	
	private String name;
	private int duration;
	
	/**
	 * Constructor with parameters
	 * @param name
	 * @param duration
	 */
	public Conference(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	/**
	 * Default constructor for this class
	 */
	public Conference() {
		
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
