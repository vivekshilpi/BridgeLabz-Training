package browser_buddy;

class BrowserTab {

    private Page current;

    // Visit a new page
    public void visit(String url) {
        Page newPage = new Page(url);

        if (current != null) {
            current.next = null;        // clear forward history
            newPage.prev = current;
            current.next = newPage;
        }

        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Back navigation
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Forward navigation
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current != null ? current.url : null;
    }
}

