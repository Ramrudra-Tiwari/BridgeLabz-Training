package com.json.parseJSON;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws Exception{
		File file = new File("DataFiles/child.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode node = (JsonNode) mapper.readTree(file);
		
		for(JsonNode n : node) {
			int age = n.get("age").asInt();
			if(age>=25) {
				System.out.println(n);
			}
		}
	}
}