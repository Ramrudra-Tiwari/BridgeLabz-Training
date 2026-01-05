package com.linkedlist.doublylinkedlist.undoeditor;

//Creating Doubly linked list based undo-redo manager
public class UndoRedoManager {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_HISTORY = 10;

    // Add new text state in this 
    
    public void addState(String text) {

        TextStateNode newNode = new TextStateNode(text);

        // Remove redo history if new action happens
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        //Creating an S First state
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        // Add at end
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Maintain fixed history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // For Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // For Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // For Display the current text state in this 
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available");
        }
    }
}
