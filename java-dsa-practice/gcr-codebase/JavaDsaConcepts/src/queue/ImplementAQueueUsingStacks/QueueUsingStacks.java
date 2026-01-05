package queue.ImplementAQueueUsingStacks;

public class QueueUsingStacks {

    StackUsingLinkedList stack1;
    StackUsingLinkedList stack2;

    public QueueUsingStacks(){
        this.stack1 = new StackUsingLinkedList();
        this.stack2 = new StackUsingLinkedList();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void enqueue(int x){
        stack1.push(x);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        int temp = stack2.pop();
        filltoStack1();
        return temp;
    }

    private void filltoStack1(){
        while(!stack2.isEmpty()){
            int temp = stack2.pop();
            stack1.push(temp);
        }
    }
    public int peek(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        return stack2.peek();
    }

    public void display(){
        if(stack1.isEmpty()){
            System.out.println("Your queue is empty");
            return;
        }

        while(!stack1.isEmpty()){
            int temp = stack1.pop();
            System.out.println(temp +" ");
            stack2.push(temp);
        }
    }
}
