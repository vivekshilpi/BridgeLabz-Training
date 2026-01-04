package linkedlist.DoublyLinkedList.UndoRedoFunctionality;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Add new states
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        // Display the current state
        editor.displayCurrentState(); // Output: Hello World!

        // Perform undo operations
        editor.undo();
        editor.displayCurrentState(); // Output: Hello World

        editor.undo();
        editor.displayCurrentState(); // Output: Hello

        // Perform redo operations
        editor.redo();
        editor.displayCurrentState(); // Output: Hello World

        // Add a new state after undo
        editor.addState("New State Added");
        editor.displayCurrentState(); // Output: New State Added

        // Try to redo after adding a new state (should not work)
        editor.redo(); // Output: No more actions to redo.
    }
}
