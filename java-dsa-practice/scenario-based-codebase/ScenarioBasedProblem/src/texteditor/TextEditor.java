package texteditor;

import java.util.Stack;

public class TextEditor {

    public String text;
    public Stack<String> undoStack;
    public Stack<String> redoStack;

    public TextEditor() {
        this.text = "";
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String newText) {
        undoStack.push(text);
        text = text + newText;
        redoStack.clear();
        System.out.println("After Insert: " + text);
    }

    // Delete last n characters
    public void delete(int n) {
        if (n > text.length()) {
            System.out.println("Delete size too large");
            return;
        }

        undoStack.push(text);
        text = text.substring(0, text.length() - n);
        redoStack.clear();
        System.out.println("After Delete: " + text);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        redoStack.push(text);
        text = undoStack.pop();
        System.out.println("After Undo: " + text);
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        undoStack.push(text);
        text = redoStack.pop();
        System.out.println("After Redo: " + text);
    }
}
