package com.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // method to reverse a list
    public static <T> List<T> reverseList(List<T> list) {

        List<T> result = new ArrayList<>();

        // traverse list from end to start
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        // ArrayList example
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reverseList(arrayList));

        // LinkedList example
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }
}
