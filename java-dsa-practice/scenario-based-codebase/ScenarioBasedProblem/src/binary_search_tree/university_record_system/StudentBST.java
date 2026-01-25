package binary_search_tree.university_record_system;

class StudentBST {

    private Student root;

    // Insert
    public void insert(int rollNo, String name) {
        root = insertRec(root, rollNo, name);
    }

    private Student insertRec(Student root, int rollNo, String name) {
        if (root == null)
            return new Student(rollNo, name);

        if (rollNo < root.rollNo)
            root.left = insertRec(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insertRec(root.right, rollNo, name);

        return root;
    }

    // Delete
    public void delete(int rollNo) {
        root = deleteRec(root, rollNo);
    }

    private Student deleteRec(Student root, int rollNo) {
        if (root == null) return null;

        if (rollNo < root.rollNo)
            root.left = deleteRec(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = deleteRec(root.right, rollNo);
        else {
            // Node with 0 or 1 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node with 2 children
            Student successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.right = deleteRec(root.right, successor.rollNo);
        }
        return root;
    }

    private Student minValue(Student node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Search
    public void search(int rollNo) {
        Student result = searchRec(root, rollNo);
        if (result != null)
            System.out.println("Found → Roll: " + result.rollNo + ", Name: " + result.name);
        else
            System.out.println("Student not found.");
    }

    private Student searchRec(Student root, int rollNo) {
        if (root == null || root.rollNo == rollNo)
            return root;

        if (rollNo < root.rollNo)
            return searchRec(root.left, rollNo);

        return searchRec(root.right, rollNo);
    }

    // Display Sorted Roll Numbers
    public void displayInOrder() {
        System.out.println("📋 Sorted Student Records (Roll No Ascending):");
        inorder(root);
    }

    private void inorder(Student root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll: " + root.rollNo + ", Name: " + root.name);
            inorder(root.right);
        }
    }
}

