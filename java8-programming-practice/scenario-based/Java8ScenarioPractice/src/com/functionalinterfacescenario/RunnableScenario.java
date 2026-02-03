package com.functionalinterfacescenario;
public class RunnableScenario {

    public static void main(String[] args) {

        // 1. Run a background task
        System.out.println("----- Background Task -----");
        Runnable backgroundTask = () -> System.out.println("Background task running...");
        new Thread(backgroundTask).start();

        // 2. Execute file cleanup task
        System.out.println("\n----- File Cleanup Task -----");
        Runnable cleanupTask = () -> System.out.println("Cleaning temporary files...");
        new Thread(cleanupTask).start();

        // 3. Print message in separate thread
        System.out.println("\n----- Message Thread -----");
        Runnable messageTask = () -> System.out.println("Hello from another thread!");
        new Thread(messageTask).start();
    }
}
