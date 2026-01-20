package com.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    public static void main(String[] args) {

        // creating first set (subset)
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        // creating second set (main set)
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // checking if set1 is subset of set2
        boolean isSubset = set2.containsAll(set1);

        // printing result
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
