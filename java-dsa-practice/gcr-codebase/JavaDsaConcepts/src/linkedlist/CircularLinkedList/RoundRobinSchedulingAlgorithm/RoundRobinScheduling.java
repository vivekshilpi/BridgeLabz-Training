package linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduling {

    private PriorityNode head;

    //method to add new process at the end of the list
    public void addProcess(int processID, int burstTime, int priority){
        PriorityNode newProcess = new PriorityNode(processID, burstTime, priority);

        if(head == null){
            head = newProcess;
            head.next = head; //creating a circular link
        }

        else{
            PriorityNode currentNode = head;
            while(currentNode.next != head){
                currentNode = currentNode.next;
            }
            currentNode.next = newProcess;
            newProcess.next = head;  //pointing newNode's next to head to maintain circular list
        }
    }
    // Remove a process by Process ID
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        PriorityNode current = head;
        PriorityNode previous = null;

        do {
            if (current.processID == processID) {
                if (previous == null) { // If head is the process to remove
                    if (current.next == head) { // Only one node in the list
                        head = null;
                    } else {
                        PriorityNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    previous.next = current.next;
                }
                System.out.println("Process " + processID + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process " + processID + " not found.");
    }
    // Simulate Round Robin Scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        PriorityNode current = head;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int completedProcesses = 0;

        System.out.println("Simulating Round Robin Scheduling:");
        while (head != null) {
            System.out.println("Executing Process " + current.processID + " with Burst Time " + current.burstTime);

            if (current.burstTime <= timeQuantum) { // Process finishes in this cycle
                totalTurnAroundTime += completedProcesses * timeQuantum + current.burstTime;
                totalWaitingTime += completedProcesses * timeQuantum;
                int processID = current.processID;
                current = current.next; // Move to the next process
                removeProcess(processID); // Remove the completed process
                completedProcesses++;
            } else { // Process requires more time
                current.burstTime -= timeQuantum;
                current = current.next; // Move to the next process
            }

            displayProcesses(); // Display the queue after each round
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turn-Around Time: " + (double) totalTurnAroundTime / completedProcesses);
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        PriorityNode current = head;
        System.out.println("Processes in the queue:");
        do {
            System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime
                    + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}
