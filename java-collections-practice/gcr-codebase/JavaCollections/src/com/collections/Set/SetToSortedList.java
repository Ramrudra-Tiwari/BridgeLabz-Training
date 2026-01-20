package com.collections.Set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {

    public static void main(String[] args) {

        // creating hash set as given in question
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        // converting set to list
        List<Integer> sortedList = new ArrayList<>(numbers);

        // sorting list in ascending order
        Collections.sort(sortedList);

        // printing output
        System.out.println("Input Set: " + numbers);
        System.out.println("Sorted List: " + sortedList);
    }
}
