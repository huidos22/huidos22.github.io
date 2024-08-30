package com.huidos22.algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxAplphabeticalSubString {

	public static void main(String... stri) {

		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		// banana resultado = nana
		System.out.println(getMaxAlphabeticalSubString(cadena));

	}

	private static String getMaxAlphabeticalSubString(String s) {
		String maxSubStr = "";
		if (s.length() > 0 && s.length() < 101 && s.matches("[a-z]+")) {
			
			System.out.println(s.length());
			
			for (int i = 0; i < s.length(); i++) { // bucle para iniciar el substring
				for (int j = i + 1; j <= s.length(); j++) {// bucle para finalizar el substring
					
					String currentSubString = s.substring(i, j);
					System.out.println(currentSubString);
					
					if (currentSubString.compareTo(maxSubStr) > 0) {
						maxSubStr = currentSubString;
					}
				}

			}
		}
		return maxSubStr;

	}

}
