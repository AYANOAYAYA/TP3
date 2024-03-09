/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author pro
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i;
		do{
			System.out.println("Entrez la taille du tableau (entre 10 et 50) :");
			n = in.nextInt();
		}while(n < 10 || n > 50);

		int[] T = new int[n];

		System.out.println("Remplissez le tableau :");

		for(i = 0; i < n; i++){
			System.out.println("Element "+ (i + 1) + " : ");
			T[i] = in.nextInt();
		}

		System.out.println("Les éléments du tableau sont :");

		for(i = 0; i < n; i++){
			System.out.println("Elément " + (i+1) + " : " + T[i]);
		}

		int count = 0;
        	for (int i = 0; i < n; i++) {
            		if (T[i] == 5) {
                		count++;
            		}
        	}

		int[] ind = new int[count];
		int[] newArray = new int[T.length - count];
		System.out.println("\nla nouvelle liste\n");
		for(i = 0, j = 0; i < T.length; i++){
                      	if(T[i] != 5){
                      		newArray[j] = T[i];
                          	j++;
                      	}
              	}
              	for(i = 0; i < newArray.length; i++){
              		System.out.println("L'élément " + (i + 1) + " : " + newArray[i]);
              	}
	}
}
