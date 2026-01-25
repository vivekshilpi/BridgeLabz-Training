package avltree.hospital_queue_management;

public class PatientNode
{
    public int time;            // check-in time (e.g., 1030)
    public String name;
    public int height;
    public PatientNode left, right;

    public PatientNode(int time, String name)
    {
        this.time = time;
        this.name = name;
        this.height = 1;
    }
}
