package com.json.readJSON;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(new File("DataFiles/stduent.json"));

        // Access first object in array
        JsonNode student = rootNode.get(0);

        System.out.println(student.get("id").asInt());
        System.out.println(student.get("name").asText());
        System.out.println(student.get("email").asText());
        System.out.println(student.get("salary").asLong());
    }
}
