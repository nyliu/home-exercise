package com.naiyou;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HomeExercise {
	
	//function aboveBelow, accept a list of intergers and an integer as arguments;
	//returns a hash/object/map/etc. with the keys "above" and "below" with the 
	//corresponding count of integers from the list that are above or below the 
	//comparison value
	public Map<String, Integer> aboveBelow(List<Integer> numbers, int value) {
		
	    Map<String, Integer> results = new TreeMap<>();
	    
	    int aboveCount=0, belowCount = 0;
	    
	    for(Integer i: numbers) {
	    	if(i>value) aboveCount++;
	    	else if(i<value) belowCount++;
	    }
	    
	    results.put("above", aboveCount);
	    results.put("below", belowCount);
	    
	    return results;    
	}
	
	//function that rotates str on the right by n
	public String stringRotation(String str, int n) {
		int len = str.length();
		return str.substring(len-n)+str.substring(0,len-n);
	}
	
	
    //Driver code
	public static void main(String[] args) {
				
		HomeExercise homeExercise = new HomeExercise();
		
		// for function aboveBelow
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=1; i<=6; i++) {
			nums.add(i);
		}
		
		System.out.println(homeExercise.aboveBelow(nums, 3));
		
		// for function stringRotation
		System.out.println(homeExercise.stringRotation("MyString", 2));

	}

}
