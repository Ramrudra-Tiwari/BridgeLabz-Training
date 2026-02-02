package com.json.validateJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("DataFiles/check.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.readTree(file);
			System.out.println("Format is valid.");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not found");
		}
		catch(JsonParseException e) {
			System.out.println("Format not valid!");
		}
	}
}