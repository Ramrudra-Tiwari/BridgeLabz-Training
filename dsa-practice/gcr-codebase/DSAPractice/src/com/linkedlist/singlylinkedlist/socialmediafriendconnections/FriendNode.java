package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

// Creating node to store friend id
public class FriendNode {

    int friendId;        // friend user id
    FriendNode next;     // next friend

    public FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
