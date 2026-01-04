package linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class PriorityNode {

    //create attributes
    int processID;
    int burstTime;
    int priority;
    PriorityNode next;

    public PriorityNode(int processID, int burstTime, int priority){
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
