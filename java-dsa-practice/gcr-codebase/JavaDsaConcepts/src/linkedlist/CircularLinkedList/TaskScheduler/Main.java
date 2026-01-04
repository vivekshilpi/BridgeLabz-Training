package linkedlist.CircularLinkedList.TaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addTask(1, "Task A", 3, "2025-01-30");
        scheduler.addTask(2, "Task B", 2, "2025-02-15");
        scheduler.addTask(3, "Task C", 1, "2025-03-10");

        // Display all tasks
        System.out.println("All Tasks:");
        scheduler.displayTasks();

        // Remove a task
        System.out.println("\nRemoving Task with ID 2:");
        scheduler.removeTask(2);
        scheduler.displayTasks();

        // Search tasks by priority
        System.out.println("\nSearch tasks with priority 1:");
        scheduler.searchByPriority(1);
    }
}
