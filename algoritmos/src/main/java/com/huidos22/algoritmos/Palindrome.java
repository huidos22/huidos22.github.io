package com.huidos22.algoritmos;

import java.util.Scanner;

public class Palindrome {

	public static void main(String... args) {

		Scanner sc1 = new Scanner(System.in);
		String a = sc1.next().trim().toLowerCase();

		System.out.println(isPalindrome(a)?"is Palindrome":"is not");
		sc1.close();
	}

	private static boolean isPalindrome(String a) {
		boolean isPal = false;
		a = a.replaceAll(" ", "");

		char[] arrA = a.toCharArray();
		char[] arrB = new char[a.length()];
		int bInt = 0;
		for (int i = arrA.length - 1; i >= 0; i--) {
			arrB[bInt] = arrA[i];
			bInt++;
		}
		int j = 0;
		while (j < arrA.length) {
			if (arrA[j] == arrB[j]) {
				isPal = true;

			} else {
				isPal = false;
				break;
			}
			j++;
		}
		return isPal;
	}
}
