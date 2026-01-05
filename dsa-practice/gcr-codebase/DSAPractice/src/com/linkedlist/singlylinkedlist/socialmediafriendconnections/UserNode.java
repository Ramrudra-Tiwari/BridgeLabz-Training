package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

// Creating node to store user details
public class UserNode {

    int userId;                 // user id
    String name;                // user name
    int age;                    // user age
    FriendNode friendHead;      // head of friend list
    UserNode next;              // next user

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
