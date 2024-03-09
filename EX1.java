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
		int[] array = new int[3];

		array[0] = 21;
		array[1] = 22;
		array[2] = 23;

		for (int i = 0; i <= array.length; i++){
			System.out.println("Elément " + (i+1) + " : " + array[i]);
		}
	}
}
