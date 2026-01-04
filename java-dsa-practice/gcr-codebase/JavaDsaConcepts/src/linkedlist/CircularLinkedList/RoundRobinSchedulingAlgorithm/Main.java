package linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduling processQueue = new RoundRobinScheduling();

        // Add processes
        processQueue.addProcess(1, 10, 3);
        processQueue.addProcess(2, 5, 2);
        processQueue.addProcess(3, 8, 1);

        // Display initial processes
        System.out.println("Initial Processes:");
        processQueue.displayProcesses();

        // Simulate Round Robin Scheduling with a time quantum of 4
        System.out.println("\nStarting Round Robin Scheduling with Time Quantum = 4:");
        processQueue.simulateRoundRobin(4);
    }
}
