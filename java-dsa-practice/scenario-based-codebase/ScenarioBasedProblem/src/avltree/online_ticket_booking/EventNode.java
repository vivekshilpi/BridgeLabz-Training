package avltree.online_ticket_booking;

public class EventNode
{
    public int time;
    public String name;
    public EventNode left, right;

    public EventNode(int time, String name)
    {
        this.time = time;
        this.name = name;
    }
}
