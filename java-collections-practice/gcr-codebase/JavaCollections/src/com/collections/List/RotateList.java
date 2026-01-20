package com.collections.List;


import java.util.ArrayList;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {

        // creating list as given in question
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int rotateBy = 2;

        // rotating the list
        List<Integer> rotatedList = new ArrayList<>();

        // add elements from rotate position to end
        for (int i = rotateBy; i < numbers.size(); i++) {
            rotatedList.add(numbers.get(i));
        }

        // add remaining elements from start
        for (int i = 0; i < rotateBy; i++) {
            rotatedList.add(numbers.get(i));
        }

        // printing output
        System.out.println("Original List: " + numbers);
        System.out.println("Rotated List: " + rotatedList);
    }
}
