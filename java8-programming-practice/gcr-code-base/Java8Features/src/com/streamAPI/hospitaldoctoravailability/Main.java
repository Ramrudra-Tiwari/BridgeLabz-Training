
package com.streamAPI.hospitaldoctoravailability;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Doctor> doctorList = new ArrayList<>();
		
		doctorList.add(new Doctor("allu",true,"Phiso"));
		doctorList.add(new Doctor("ravi",false,"Krotho"));
		doctorList.add(new Doctor("kali",true,"Spetho"));
		doctorList.add(new Doctor("suriya",false,"Aortho"));
		doctorList.add(new Doctor("somu",true,"Geortho"));
		
		doctorList.stream()
					.filter(Doctor-> Doctor.isAvailableOnWeekend()==true)
					.sorted(Comparator.comparing(Doctor::getSpecialty))
					.forEach(System.out::println);
	}
}
