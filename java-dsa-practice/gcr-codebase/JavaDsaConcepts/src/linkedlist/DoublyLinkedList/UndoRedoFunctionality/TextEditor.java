package linkedlist.DoublyLinkedList.UndoRedoFunctionality;

public class TextEditor {
    private TextState head;
    private TextState current;
    private int maxSize = 10; // Limit the history size to 10
    private int size = 0;

    // Add a new text state
    public void addState(String newText) {
        TextState newState = new TextState(newText);

        if (head == null) {
            head = newState;
            current = head;
        } else {
            // Remove all redo states
            current.next = null;

            // Add the new state
            newState.prev = current;
            current.next = newState;
            current = newState;
        }

        size++;
        if (size > maxSize) {
            // Remove the oldest state
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    // Display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }
}
