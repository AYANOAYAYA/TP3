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
		int[] array = new int[10];
		int i;

		System.out.println("Entrez 10 nombres :");

		for(i = 0; i < array.length; i++){
			System.out.println("Element "+ (i+1) + " : ");
			array[i] = in.nextInt();
		}

		System.out.println("Les éléments du tableau sont :");

		for(i = 0; i < array.length; i++){
			System.out.println("Elément " + (i+1) + " : " + array[i]);
		}
	}
}
