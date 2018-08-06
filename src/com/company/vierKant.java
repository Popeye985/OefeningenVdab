package com.company;

import java.util.Scanner;

public class vierKant {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een zijdelengte");
        int zijde = Integer.parseInt(invoer.nextLine());
        for (int i = 0; i < zijde ; i++) {
            for (int j = 0; j < zijde; j++) {

                System.out.print("*");

            }
            System.out.println();

        }


        }
    }

