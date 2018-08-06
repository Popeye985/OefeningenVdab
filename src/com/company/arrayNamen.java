package com.company;

import java.util.Scanner;

public class arrayNamen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        String [] namen = new String[3];
        for (int i = 0; i < namen.length; i++) {
            System.out.println("Geef een naam in");
            namen[i] = invoer.nextLine();

        }
        for (int i = namen.length -1; i >= 0; i--) {
            System.out.println(namen[i]);

        }



    }
}
