package hburak.ConferenceArranger;

/**
 * 
 * @author hburak
 *
 */
public class Conference {
	
	private String name;
	private double duration;
	
	/**
	 * Constructor with parameters
	 * @param name
	 * @param duration
	 */
	public Conference(String name, double duration) {
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
	public double getDuration() {
		return duration;
	}
	/**
	 * 
	 * @param duration
	 */
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
}
