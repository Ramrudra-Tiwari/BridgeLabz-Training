package com.collections.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // input list as given in question
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // list to store result without duplicates
        List<Integer> uniqueList = new ArrayList<>();

        // removing duplicates while keeping order
        for (Integer num : numbers) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // printing output
        System.out.println("Input List: " + numbers);
        System.out.println("Output List: " + uniqueList);
    }
}
