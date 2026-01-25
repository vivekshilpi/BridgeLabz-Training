package avltree.gaming_app;

public class AVLLeaderboard
{
    public PlayerNode root;
    public int count;

    public int height(PlayerNode n)
    {
        if (n == null)
            return 0;
        return n.height;
    }

    public int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public int getBalance(PlayerNode n)
    {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }

    public PlayerNode rightRotate(PlayerNode y)
    {
        PlayerNode x = y.left;
        PlayerNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public PlayerNode leftRotate(PlayerNode x)
    {
        PlayerNode y = x.right;
        PlayerNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public PlayerNode insert(PlayerNode node, int id, String name, int score)
    {
        if (node == null)
            return new PlayerNode(id, name, score);

        if (score < node.score)
            node.left = insert(node.left, id, name, score);
        else if (score > node.score)
            node.right = insert(node.right, id, name, score);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public PlayerNode minValueNode(PlayerNode node)
    {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public PlayerNode delete(PlayerNode root, int score)
    {
        if (root == null)
            return root;

        if (score < root.score)
            root.left = delete(root.left, score);
        else if (score > root.score)
            root.right = delete(root.right, score);
        else
        {
            if (root.left == null || root.right == null)
            {
                PlayerNode temp = (root.left != null) ? root.left : root.right;

                if (temp == null)
                    root = null;
                else
                    root = temp;
            }
            else
            {
                PlayerNode temp = minValueNode(root.right);
                root.score = temp.score;
                root.name = temp.name;
                root.playerId = temp.playerId;
                root.right = delete(root.right, temp.score);
            }
        }

        if (root == null)
            return root;

        root.height = max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void displayTop10(PlayerNode node)
    {
        if (node == null || count >= 10)
            return;

        displayTop10(node.right);

        if (count < 10)
        {
            System.out.println("Rank " + (count + 1) + " : " + node.name + " | Score = " + node.score);
            count++;
        }

        displayTop10(node.left);
    }
}
