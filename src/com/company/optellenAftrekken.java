package com.company;


import java.util.Scanner;

public class optellenAftrekken {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int getalOptellen = 1;
        int getalAftrekken = 2;
        int getal1;
        int getal2;
        int stoppen = 0;
        int getalInput;

        do {

            System.out.println("Wilt u:");
            System.out.println("\t 1. Twee getallen optellen?");
            System.out.println("\t 2. Twee getallen aftrekken?");
            System.out.println("\t 0. Stoppen.");
            getalInput = Integer.parseInt(invoer.nextLine());


            switch (getalInput) {
                case 1:
                    System.out.println("Geef een eerste getal");
                    getal1 = Integer.parseInt(invoer.nextLine());

                    System.out.println("Geef een tweede getal");
                    getal2 = Integer.parseInt(invoer.nextLine());

                    int resultaat = getal1 + getal2;

                    System.out.println("Het resultaat is " + (getal1 + getal2));
                    break;
                case 2:
                    System.out.println("Geef een eerste getal");
                    getal1 = Integer.parseInt(invoer.nextLine());

                    System.out.println("Geef een tweede getal");
                    getal2 = Integer.parseInt(invoer.nextLine());

                    int resultaat2 = getal1 - getal2;
                    System.out.println("Het resultaat is " + (getal1 - getal2));
                    break;

                case 0:
                    break;
                default:
                    System.out.println("U moet 1,2 of 0 ingeven");

            }

        } while (getalInput != stoppen);
        System.out.println("Einde programma.");

    }
}



