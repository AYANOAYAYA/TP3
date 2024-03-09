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
        int[] T = {4, 8, 2, 6, 10, 1};
        int ecart = 0, i, j;

        for (i = 0; i < T.length - 1; i++) {
            for (j = i + 1; j < T.length; j++) {
                int ecartNow = Math.abs(T[i] - T[j]);
                ecart = Math.max(ecart, ecartNow);
            }
        }

        System.out.println("Le plus grand écart dans le tableau est : " + ecart);
    }
}
