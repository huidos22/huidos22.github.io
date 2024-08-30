package com.huidos22.algoritmos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		boolean isAnagramBol = false;
		if (a.matches("[a-zA-Z]+") && b.matches("[a-zA-Z]+") && a.length() > 0 && b.length() > 0 && b.length() < 51) {
			char[] arrayA = a.toLowerCase().toCharArray();
			char[] arrayB = b.toLowerCase().toCharArray();
			Map<Character, Integer> mapA = new HashMap<Character, Integer>();
			Map<Character, Integer> mapB = new HashMap<Character, Integer>();

			for (int i = 0; i < arrayA.length; i++) {
				
				mapA.computeIfPresent(arrayA[i], (key, val) -> val + 1);
				mapA.putIfAbsent(arrayA[i],1);
			}

			for (int i = 0; i < arrayB.length; i++) {
				mapB.computeIfPresent(arrayA[i], (key, val) -> val + 1);
				mapB.putIfAbsent(arrayA[i],1);
			}
			

			if (mapA.size() == mapB.size()) {
				for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {
					Character keyA = entry.getKey();
					Integer valA = entry.getValue();
					if (mapB.containsKey(keyA) && mapB.get(keyA) == valA) {
						isAnagramBol = true;
					} else {
						isAnagramBol = false;
						break;
					}
				}
			} else {
				isAnagramBol = false;
			}
		}
		return isAnagramBol;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
