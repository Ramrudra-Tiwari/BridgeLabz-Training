package com.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void main(String[] args) {

        // creating first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // copy of first set
        Set<Integer> result = new HashSet<>(set1);

        // add elements from second set
        result.addAll(set2);

        // find common elements
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        // remove common elements to get symmetric difference
        result.removeAll(common);

        // printing output
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Symmetric Difference: " + result);
    }
}
