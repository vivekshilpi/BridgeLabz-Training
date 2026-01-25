package avltree.gaming_app;

public class PlayerNode
{
    public int playerId;
    public String name;
    public int score;
    public int height;
    public PlayerNode left;
    public PlayerNode right;

    public PlayerNode(int playerId, String name, int score)
    {
        this.playerId = playerId;
        this.name = name;
        this.score = score;
        this.height = 1;
    }
}
