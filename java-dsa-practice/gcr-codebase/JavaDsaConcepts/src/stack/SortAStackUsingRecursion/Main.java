package stack.SortAStackUsingRecursion;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(5);
        stack.push(9);
        stack.push(1);

        System.out.println("Stack Elements before sorting are : "+ stack);
        SortStack sort = new SortStack();
        sort.sortStack(stack);

        System.out.print("Stack Elements after sorting are : "+ stack);
    }
}
