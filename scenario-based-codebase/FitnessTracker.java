/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/
import java.util.*;

public class FitnessTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//create array for storing temperature
		int[] pushupCount = new int[7];

		int totalPushups = 0;
		int activeDays = 0;

		// take input using for loop
		for(int i=0; i<pushupCount.length; i++) {
			System.out.println("Enter Day " + (i+1) +  " Pushup count: ");
			pushupCount[i] = sc.nextInt();
		}

		// calculate totalpushups and active days
		for(int count : pushupCount) {
			// skip rest days
			if(count == 0) {
				continue;
			}
			// add pushup count to total if it is not a rest day
			totalPushups += count;
			activeDays++;
		}

		double avgPushups = totalPushups/activeDays; 	// calculate average

		// print result
		System.out.println("Total pushups in this week: " + totalPushups );
		System.out.println("Average No of pushups throughout week: " + avgPushups);
	}
}