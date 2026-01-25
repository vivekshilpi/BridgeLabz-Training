package avltree.online_ticket_booking;

public class EventBST
{
    public EventNode root;

    // Insert Event
    public EventNode insert(EventNode node, int time, String name)
    {
        if (node == null)
            return new EventNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        return node;
    }

    // Find minimum
    public EventNode min(EventNode node)
    {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Cancel Event
    public EventNode delete(EventNode node, int time)
    {
        if (node == null)
            return null;

        if (time < node.time)
            node.left = delete(node.left, time);
        else if (time > node.time)
            node.right = delete(node.right, time);
        else
        {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            EventNode temp = min(node.right);
            node.time = temp.time;
            node.name = temp.name;
            node.right = delete(node.right, temp.time);
        }
        return node;
    }

    // Display in upcoming order
    public void display(EventNode node)
    {
        if (node != null)
        {
            display(node.left);
            System.out.println(node.time + " → " + node.name);
            display(node.right);
        }
    }
}
