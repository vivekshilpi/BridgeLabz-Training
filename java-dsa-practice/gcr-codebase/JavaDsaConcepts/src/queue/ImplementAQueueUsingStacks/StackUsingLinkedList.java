package queue.ImplementAQueueUsingStacks;

public class StackUsingLinkedList {
    LinkNode top;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){
        LinkNode newNode = new LinkNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int peek(){
        if(top == null){
            return -1;
        }
        return top.data;
    }

    public int pop(){
        if(top == null){
            return -1;
        }
        int popped = top.data;
        top = top.next;

        return popped;
    }

    public void display(LinkNode top){
        LinkNode temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
