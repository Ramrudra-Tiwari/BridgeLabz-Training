package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//Creating a  main class to test social media system
public class SocialMediaMain {

    public static void main(String[] args) {

        SocialMediaLinkedList sm = new SocialMediaLinkedList();

        // adding users name and age
        sm.addUser(1, "Arvind", 22);
        sm.addUser(2, "Anni", 23);
        sm.addUser(3, "Titu", 21);
        sm.addUser(4, "", 22);

        // adding friends
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        //To display friends
        sm.displayFriends(1);

        //for  find mutual friends
        sm.findMutualFriends(1, 2);

        //for  search user
        sm.searchUser("Neha");

        //for  count friends
        sm.countFriends();

        //for remove friend
        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}
