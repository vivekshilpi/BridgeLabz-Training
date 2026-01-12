package browser_buddy;

import java.util.Stack;

class BrowserBuddy {

    private BrowserTab currentTab;
    private Stack<BrowserTab> closedTabs = new Stack<>();

    public BrowserBuddy() {
        currentTab = new BrowserTab();
    }

    public void visitPage(String url) {
        currentTab.visit(url);
    }

    public void back() {
        currentTab.back();
    }

    public void forward() {
        currentTab.forward();
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed");
    }

    // Restore last closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No tabs to restore");
            return;
        }
        currentTab = closedTabs.pop();
        System.out.println("Tab restored, current page: " +
                currentTab.getCurrentPage());
    }
}

