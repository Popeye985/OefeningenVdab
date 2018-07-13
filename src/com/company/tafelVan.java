package com.company;

import java.util.Scanner;

public class tafelVan {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een geheel getal");
        int getal = Integer.parseInt(invoer.nextLine());
        for (int i = 0; i <=10; i++) {
            int product = getal * i;
            System.out.println( i + " " + "x "  + getal + " = " + product);
        }


        }

    }

