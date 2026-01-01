package LibraryManagementSystem;

class Magazine extends LibraryItem {
    private String issueDate;

    public Magazine(String itemId, String title, String author, String issueDate) {
        super(itemId, title, author);
        this.issueDate = issueDate;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}