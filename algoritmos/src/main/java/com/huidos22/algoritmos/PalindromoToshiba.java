package com.huidos22.algoritmos;

import java.util.Scanner;

public class PalindromoToshiba {
	/*
	 * 
	 * [03:24 p. m.] Edgar Pimentel 1. Realizar un programa que acepte una cadena
	 * del teclado e indique si la palabra el palíndromo; por ejemplo: ANA,
	 * RECONOCER, ANILINA, OSO, SALAS, etc.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pal = "";
		pal += sc.nextLine(); // deja agregar espacios como una sola entrada
		sc.close();
		System.out.println(pal + " Es palindromo: " + isPalindromo(pal));
	}

	private static Boolean isPalindromo(String cadena) {
		boolean isPal = false;
		cadena = cadena.replaceAll(" ", "");// para que quite espacios

		if (cadena.matches("^[a-zA-Z\\s]+$") && !cadena.isBlank()) { // solo letras

			char[] arraCad = cadena.toCharArray();// crear un array de chars con la cadena
			char[] arrayB = new char[cadena.length()];// crear un segundo array con el tamanio de la cadena

			int count = 0; // contador sumatorio
			int backCount = arraCad.length - 1;// contador retroceso es -1 porque lenght cuenta empezando por 1

			while (backCount >= 0 && count < cadena.length()) {
				arrayB[count] = arraCad[backCount];// ultimo valor en el primer espacio de B y asi ...
				count++;
				backCount--;
			}
			for (int j = 0; j < cadena.length(); j++) {

				if (arraCad[j] == arrayB[j]) {
					isPal = true;
				} else {
					isPal = false;
					break;
				}
				System.out.println(arraCad[j] + " == " + arrayB[j]);
			}

			/** solucion chatgpt **/

			int length = cadena.length();
			for (int i = 0; i < length /2 ; i++) {//porque entre 2? 
				//si todo va bien va revisando igualdades de inicio+1 y final-1 
				//de lo contrario ya no es palindromo
				int finalHaciaAtras = length - i - 1;//para ir de reversa 
				//es el indice final - inicio_indice -1 
				System.out.println("i = " + i + " " + cadena.charAt(i));
				System.out.println("finalHaciaAtras " + finalHaciaAtras + " " + cadena.charAt(length - i - 1));
			}
		}
		return isPal;
	}
}
