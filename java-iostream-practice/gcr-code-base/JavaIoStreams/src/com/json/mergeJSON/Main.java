package com.json.mergeJSON;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("RUN DIR = " + System.getProperty("user.dir"));

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node1 = mapper.readTree(new File("DataFiles/stduent.json"));
        JsonNode node2 = mapper.readTree(new File("DataFiles/stduent2.json"));

        if (node1.isArray() && node2.isArray()) {

            ArrayNode array1 = (ArrayNode) node1;
            ArrayNode array2 = (ArrayNode) node2;

            array1.addAll(array2);

            System.out.println(array1.toPrettyString());

        } else {
            System.out.println("JSON is not an array");
        }

    } // end of main

} // end of class
