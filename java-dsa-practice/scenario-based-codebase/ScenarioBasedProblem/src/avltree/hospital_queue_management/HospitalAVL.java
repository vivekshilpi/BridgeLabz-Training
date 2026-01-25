package avltree.hospital_queue_management;

public class HospitalAVL
{
    public PatientNode root;

    public int height(PatientNode n)
    {
        return n == null ? 0 : n.height;
    }

    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

    public int getBalance(PatientNode n)
    {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    public PatientNode rightRotate(PatientNode y)
    {
        PatientNode x = y.left;
        PatientNode t = x.right;

        x.right = y;
        y.left = t;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public PatientNode leftRotate(PatientNode x)
    {
        PatientNode y = x.right;
        PatientNode t = y.left;

        y.left = x;
        x.right = t;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public PatientNode insert(PatientNode node, int time, String name)
    {
        if (node == null)
            return new PatientNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + max(height(node.left), height(node.right));

        int bal = getBalance(node);

        if (bal > 1 && time < node.left.time)
            return rightRotate(node);

        if (bal < -1 && time > node.right.time)
            return leftRotate(node);

        if (bal > 1 && time > node.left.time)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bal < -1 && time < node.right.time)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public PatientNode min(PatientNode node)
    {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public PatientNode delete(PatientNode node, int time)
    {
        if (node == null)
            return null;

        if (time < node.time)
            node.left = delete(node.left, time);
        else if (time > node.time)
            node.right = delete(node.right, time);
        else
        {
            if (node.left == null || node.right == null)
                node = (node.left != null) ? node.left : node.right;
            else
            {
                PatientNode t = min(node.right);
                node.time = t.time;
                node.name = t.name;
                node.right = delete(node.right, t.time);
            }
        }

        if (node == null)
            return null;

        node.height = 1 + max(height(node.left), height(node.right));
        int bal = getBalance(node);

        if (bal > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        if (bal > 1 && getBalance(node.left) < 0)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (bal < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        if (bal < -1 && getBalance(node.right) > 0)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void display(PatientNode node)
    {
        if (node != null)
        {
            display(node.left);
            System.out.println(node.time + " -> " + node.name);
            display(node.right);
        }
    }
}
