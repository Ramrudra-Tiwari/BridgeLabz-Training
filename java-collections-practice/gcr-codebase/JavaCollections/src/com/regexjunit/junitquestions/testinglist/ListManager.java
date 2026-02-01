package com.regexjunit.junitquestions.testinglist;
import java.util.*;

public class ListManager {
	
	//add
	public int addElement(List<Integer> list, int element){
		list.add(element);
		return element;
	}
	
	//remove
	public boolean removeElement(List<Integer> list, int element) {
		if(list.isEmpty()) {
			return false;
		}
		if(!list.contains(element)) {
			return false;
		}
		list.remove(element);
		return true;
	}
	
	//get elements
	public int getSize(List<Integer> list) {
		return list.size();
	}
}