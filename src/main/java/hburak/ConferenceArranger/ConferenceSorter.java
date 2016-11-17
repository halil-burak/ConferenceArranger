package hburak.ConferenceArranger;

import java.util.List;
import java.util.Stack;

/**
 * 
 */
public class ConferenceSorter {
	public static final int TARGET_VALUE_BEFORE_BREAK = 180;
	private Stack<Conference> stack = new Stack<Conference>();
	private int sumInStack = 0;
	
	 public void initializer(List<Conference> confList, int fromIndex, int endIndex, int totalduration) {
		Conference[] data = new Conference[confList.size() + 1];
		for (int n = 0; n < confList.size(); n++) {
			Conference temp = new Conference();
			temp = confList.get(n);
			data[n] = temp;
		}
		 populateSubset(data, fromIndex, endIndex, totalduration);
	 }
	
	/**
	 * Calculation and ordering of integers
	 */
	private void populateSubset(Conference[] data, int fromIndex, int endIndex, int totalduration) {
		if(sumInStack == totalduration) {
			if(totalduration == 180) {
				printAM(stack);
			} else {
				printPM(stack);
			}
			//return;
		}
		
		for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {
			if (sumInStack + data[currentIndex].getDuration() <= totalduration) {
				stack.push(data[currentIndex]);
				sumInStack += data[currentIndex].getDuration();

				/*
				 * Make the currentIndex +1, and then use recursion to proceed
				 * further.
				 */
				populateSubset(data, currentIndex + 1, endIndex, totalduration);
				Conference temp = stack.pop();
				sumInStack -= (Integer) temp.getDuration();
			}
		}
	}
	/**
	 * print the pattern of conferences
	 * @param stack2
	 */
	private void printAM(Stack<Conference> stack) {
		// print out the stack structure
		StringBuilder sb = new StringBuilder();
		int daystart = 540;// 9 hours equals 540 minutes
        sb.append("Track:\n");
        for (Conference i : stack) {
            sb.append(daystart/60).append(":").append(daystart%60).append("0 AM - ").append(i.getName()).append("- ").append(i.getDuration()).append(" mins").append("\n");
            daystart += i.getDuration();
        }
        sb.append("12:00 AM - Lunch\n");
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
	}
	
	private void printPM(Stack<Conference> stack) {
		// print out the stack structure
		StringBuilder sb = new StringBuilder();
		int daystart = 780;// 9 hours equals 540 minutes
		sb.append("Track:\n");
		for (Conference i : stack) {
			sb.append(daystart / 60).append(":").append(daystart % 60).append("0 AM - ").append(i.getName())
					.append("- ").append(i.getDuration()).append(" mins").append("\n");
			daystart += i.getDuration();
		}
		sb.append("12:00 PM - Lunch\n");
		System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
	}
}
