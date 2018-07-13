package com.company;

import java.util.Scanner;

public class aantalWerknemer {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Wat is het aantal werknemers");
        int werknemers = Integer.parseInt(invoer.nextLine());
        double totaalLoon = 0;
        for (int i = 0; i < werknemers; i++) {
            System.out.println("Geef het loon voor werknemer" + i);
            double loon = Double.parseDouble(invoer.nextLine());
            totaalLoon = totaalLoon + loon;
            
        }

        System.out.println("Het totaalloon is " + totaalLoon);
    }
}
