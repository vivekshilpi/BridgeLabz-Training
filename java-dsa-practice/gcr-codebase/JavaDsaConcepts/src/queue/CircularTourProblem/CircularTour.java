package queue.CircularTourProblem;

import java.util.Deque;
import java.util.LinkedList;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Deque<Integer> deque = new LinkedList<>();
        int totalSurplus = 0, surplus = 0, start = 0;

        // Traverse petrol pumps
        for (int i = 0; i < n; i++) {
            int netGain = petrol[i] - distance[i];
            totalSurplus += netGain;
            surplus += netGain;
            deque.addLast(i);

            // If surplus becomes negative, remove pumps from the front
            while (surplus < 0 && !deque.isEmpty()) {
                int removedPump = deque.pollFirst(); // Remove the first pump
                surplus -= (petrol[removedPump] - distance[removedPump]); // Adjust surplus
                start = removedPump + 1; // Move start forward
            }
        }

        // If total surplus is negative, no circular tour is possible
        return (totalSurplus < 0) ? -1 : start;
    }
}
