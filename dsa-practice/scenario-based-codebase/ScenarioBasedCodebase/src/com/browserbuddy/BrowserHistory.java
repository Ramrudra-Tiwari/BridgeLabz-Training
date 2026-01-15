package com.browserbuddy;

public class BrowserHistory {

    private HistoryNode head;
    private HistoryNode current;

    public BrowserHistory(String homepage) {
        head = new HistoryNode(homepage);
        current = head;
    }

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    public void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Moved back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    public String getCurrentPage() {
        return current.url;
    }

    public void showHistory() {
        HistoryNode temp = head;
        System.out.print("History: ");
        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.url + "] ");
            } else {
                System.out.print(temp.url + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
