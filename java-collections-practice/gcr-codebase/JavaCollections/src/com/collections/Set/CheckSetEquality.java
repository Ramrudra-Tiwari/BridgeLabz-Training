package com.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class CheckSetEquality {

    public static void main(String[] args) {

        // creating first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        // checking if both sets contain same elements
        boolean result = set1.equals(set2);

        // printing output
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are both sets equal? " + result);
    }
}
