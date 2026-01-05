package com.linkedlist.doublylinkedlist.undoeditor;

//Creating  Node representing one text state
public class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    // Creating Constructor to store text state in this 
    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
