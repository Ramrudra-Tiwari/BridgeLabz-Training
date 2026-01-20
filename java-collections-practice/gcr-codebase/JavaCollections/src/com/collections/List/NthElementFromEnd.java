package com.collections.List;


import java.util.LinkedList;

public class NthElementFromEnd {

    public static void main(String[] args) {

        // creating linked list as given in question
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        // two pointers approach
        int first = 0;
        int second = 0;

        // move first pointer n steps ahead
        while (first < n) {
            first++;
        }

        // move both pointers until first reaches end
        while (first < list.size()) {
            first++;
            second++;
        }

        // printing result
        System.out.println("LinkedList: " + list);
        System.out.println("Nth element from end: " + list.get(second));
    }
}
