package com.codedecode.SpringRestAPIDemo.utils;

public class StringUtils {
	
	public static void main(String[] args) {
		String originalString = "code"; // deco // deco
		String toBeChecked = "deocde";
		int rotationCharacters = 2;
		System.out.println(checkForRotation(originalString, toBeChecked));
		
		System.out.println(leftRotate(originalString, rotationCharacters)); 
		System.out.println(rightRotate(originalString, rotationCharacters)); 
	}

	private static String rightRotate(String originalString, int rotationCharacters) {
		//decode  - // dedeco
		int partition = originalString.length() - rotationCharacters; //4
		String rotatedString = originalString.substring(partition) + originalString.substring(0, partition);
								//de									//deco
		return rotatedString;
	}

	private static String leftRotate(String originalString, int r) {
		
		//decode -  // codede
		String rotatedString = originalString.substring(r) + originalString.substring(0,r);
								//code							//de
		
		return rotatedString;
	}

	private static boolean checkForRotation(String originalString, String toBeChecked) {
		String concatenatedString = originalString + originalString;
		if(concatenatedString.contains(toBeChecked))
			return true;
		return false;
		
	}

}
