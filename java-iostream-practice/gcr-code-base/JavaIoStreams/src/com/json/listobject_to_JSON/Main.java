
package com.json.listobject_to_JSON;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
        car car1 = new car("Toyota", "Fortuner", 3500000.5);
        car car2 = new car("BMW", "BMW", 9913500000.5);
        car car3 = new car("LAND LOVER", "TATA", 83500000.5);
        
        
        List<car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        
        
        ObjectMapper mapper = new ObjectMapper();  
        
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(carList);
        System.out.println(json);
        mapper.writeValue(new File("DataFiles/listObj.json"), carList);
	}
}
