package binary_search_tree.music_app;

class SongNode {

    int trackId;
    String title;
    String artist;

    SongNode left, right;

    public SongNode(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
        left = right = null;
    }
}

