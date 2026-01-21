package com.collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        // Original Map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted Map: Value -> List of Keys
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        // Inverting the map
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // If value not present, create a new list
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            // Add key to the list
            invertedMap.get(value).add(key);
        }

        // Print result
        System.out.println(invertedMap);
    }
}
