package stack.SortAStackUsingRecursion;

import java.util.Stack;

public class SortStack {

    public void sortStack(Stack<Integer> stack){
        if(stack.isEmpty() || stack.size() == 1){
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertElement(top, stack);
    }

    public void insertElement(int element, Stack<Integer> stack){
        if(stack.isEmpty() || element >= stack.peek()){
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertElement(element, stack);
        stack.push(top);
    }
}
