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
		int n, i, j;
		System.out.println("Entrez la taille du tableau :");
		n = in.nextInt();

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
        	for (i = 0; i < n; i++) {
            		if (T[i] >0) {
                		count++;
            		}
        	}

		int[] TP=new int[count];
            	for(i = 0, j = 0; i < T.length; i++){
                        if(T[i] > 0){
  	                      TP[j]=T[i];
	                      j++;
	       	         }
  	   	}
	        for(i = 0; i < TP.length; i++){
	                System.out.println("l'élément "+ (i + 1)+" : "+TP[i]); 
		}  

                System.out.println("\nLa liste negative\n");
                int tailleneg=0;
                for(i = 0; i < T.length; i++){
 	               if(T[i] < 0)
 	                      tailleneg++;
		}

	}
}
