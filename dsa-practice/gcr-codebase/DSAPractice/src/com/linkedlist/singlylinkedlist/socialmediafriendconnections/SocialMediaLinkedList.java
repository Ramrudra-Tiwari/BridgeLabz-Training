package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//Creating  linked list to manage users and friends
public class SocialMediaLinkedList {

    private UserNode head; // head of user list

    //To  add new user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // find user by id
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // add friend connection between two users
    public void addFriend(int userId1, int userId2) {

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        FriendNode f1 = new FriendNode(userId2);
        f1.next = user1.friendHead;
        user1.friendHead = f1;

        FriendNode f2 = new FriendNode(userId1);
        f2.next = user2.friendHead;
        user2.friendHead = f2;
    }

    // remove friend connection
    public void removeFriend(int userId1, int userId2) {
        removeFriendFromList(userId1, userId2);
        removeFriendFromList(userId2, userId1);
    }

    // helper method to remove friend
    private void removeFriendFromList(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode temp = user.friendHead;

        if (temp != null && temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }

        while (temp != null && temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // display friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = user1.friendHead;

        while (f1 != null) {
            FriendNode f2 = user2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // search user by id or name
    public void searchUser(String key) {
        UserNode temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(key) || String.valueOf(temp.userId).equals(key)) {
                System.out.println("User Found: " + temp.userId + " " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // count friends of each user
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}
