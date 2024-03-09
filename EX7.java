/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author pro
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, sum = 0;
		float moyenne;
		System.out.println("Entrez la taille du tableau :");
		n = in.nextInt();

		int[] T = new int[n];

		System.out.println("Remplissez le tableau :");

		for(i = 0; i < n; i++){
			System.out.println("Element "+ (i + 1) + " : ");
			T[i] = in.nextInt();
		}

		for(i = 0; i < n; i++){
			sum += T[i];
		}

		System.out.println("La somme des élément du tableau est : " + sum);

		moyenne = (float) sum / n;
		System.out.println("La moyenne des élément du tableau est : " + moyenne);

		int[] T2 = new int[n];

		for(i = 0; i < n; i++){
			T2[i] = T[i];
		}

		System.out.println("Les éléments du tableau T2 sont :");

		for(i = 0; i < n; i++){
			System.out.println("Elément " + (i+1) + " : " + T2[i]);
		}

		Arrays.sort(T);

		System.out.println("Les éléments du tableau dans un ordre croissant sont :");

		for(i = 0; i < n; i++){
			System.out.println("Elément " + (i+1) + " : " + T[i]);
		}
	}
}
