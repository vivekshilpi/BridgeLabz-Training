package browser_buddy;

class Page {
    String url;
    Page prev;
    Page next;

    Page(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
 
