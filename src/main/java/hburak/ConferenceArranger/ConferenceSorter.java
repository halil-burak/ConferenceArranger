package hburak.ConferenceArranger;

import java.util.Stack;

/**
 * 
 */
public class ConferenceSorter {
	public static final int TARGET_VALUE = 180;
	private Stack<Integer> stack = new Stack<Integer>();
	private int sumInStack = 0;
	
	/**
	 * Calculation and ordering of integers
	 */
	public void populateSubset() {
		if(sumInStack >= TARGET_VALUE) {
			if(sumInStack == TARGET_VALUE) {
				print(stack);
			}
			return;
		}
	}
	/**
	 * 
	 * @param stack2
	 */
	private void print(Stack<Integer> stack2) {
		// print out the stack structure
		
	}
}
