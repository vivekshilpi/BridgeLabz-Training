package queue.ImplementAQueueUsingStacks;

public class Main {

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        System.out.println("Queue before dequeue operation");
        //enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        //display method to display queue
        queue.display();

        //dequeue operation
        System.out.println("Top element removed: "+queue.dequeue());
        queue.display();

        //peek operation
        System.out.println("Peek element is: "+queue.peek());

    }
}
