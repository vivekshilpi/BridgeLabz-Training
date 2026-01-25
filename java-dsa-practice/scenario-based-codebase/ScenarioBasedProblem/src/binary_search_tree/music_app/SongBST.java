package binary_search_tree.music_app;

class SongBST {

    private SongNode root;

    // Insert New Track (BST ordered by title)
    public void insert(int trackId, String title, String artist) {
        root = insertRec(root, trackId, title, artist);
    }

    private SongNode insertRec(SongNode root, int trackId, String title, String artist) {
        if (root == null)
            return new SongNode(trackId, title, artist);

        if (title.compareToIgnoreCase(root.title) < 0)
            root.left = insertRec(root.left, trackId, title, artist);
        else
            root.right = insertRec(root.right, trackId, title, artist);

        return root;
    }

    // Search Track by Track ID
    public void searchByTrackId(int trackId) {
        SongNode result = searchRec(root, trackId);
        if (result != null) {
            System.out.println("🎶 Track Found → ID: " + result.trackId +
                    ", Title: " + result.title +
                    ", Artist: " + result.artist);
        } else {
            System.out.println("❌ Track not found.");
        }
    }

    private SongNode searchRec(SongNode root, int trackId) {
        if (root == null)
            return null;

        if (root.trackId == trackId)
            return root;

        SongNode left = searchRec(root.left, trackId);
        if (left != null) return left;

        return searchRec(root.right, trackId);
    }

    //  Display Playlist Alphabetically (Inorder Traversal)
    public void displayAlphabetical() {
        System.out.println("🎼 Playlist (Alphabetical Order):");
        inorder(root);
    }

    private void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Title: " + root.title +
                    ", Artist: " + root.artist +
                    ", Track ID: " + root.trackId);
            inorder(root.right);
        }
    }
}
