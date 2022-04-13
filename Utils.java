package com.codedecode.SpringRestAPIDemo.utils;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Utils {
	
	public static void main(String[] args) {
	
		System.out.println(findDuplicatesUsingFor("code decode")); // Time complexity = O(N2)
		
		System.out.println(findDuplicatesUsingArrays("code decode")); // Time complexity = O(N) , Space complexity = O(256)
		
		System.out.println(findDuplicatesUsingMaps("code decode")); // Time complexity = O(NLogn), 
	}

	private static Set<Character> findDuplicatesUsingMaps(String name) {
		
		Set<Character> duplicates = new LinkedHashSet<>();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		//code decode
		for(int i =0 ; i< name.length() ; i++) { // O(n)
			if(countMap.containsKey(name.charAt(i))) { //d
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1); // d, 3 , e ,3 // O(logn)
			}else {
				countMap.put(name.charAt(i), 1); //code  d,3
			}
		}
		for(Map.Entry<Character, Integer> entry :  countMap.entrySet())
		{
			if(entry.getValue() > 1) 
				duplicates.add(entry.getKey());
		}
		return duplicates;
	}

	private static Set<Character> findDuplicatesUsingArrays(String name) {
		Set<Character> duplicates = new LinkedHashSet<>();
		//code decode
		int[] arrayForChar = new int[256];
		
		for(int i = 0 ; i< name.length(); i++)  //O(n)
			arrayForChar[name.charAt(i)] = arrayForChar[name.charAt(i)] + 1;
		
		for( int i = 0 ; i< 256 ; i++) {   //O(n)
			if(arrayForChar[i] > 1) 
				duplicates.add((char) i);
		}
		
		// O(2N) ~~ O(N)
		return duplicates;
	}

	private static Set<Character> findDuplicatesUsingFor(String name) {
		Set<Character> duplicates = new LinkedHashSet<>();
		for(int i = 0 ; i<name.length(); i++) { //O(n)
			for(int j = i+1; j< name.length() ; j++ ) { //O(n2)
				if(name.charAt(i) == name.charAt(j)) {
					duplicates.add(name.charAt(j));
				}
			}
		}
		return duplicates;
	}

	

}
