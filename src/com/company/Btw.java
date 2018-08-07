package com.company;

import java.util.Scanner;

public class Btw {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een productnaam");
        String productnaam = invoer.nextLine();
        System.out.println("Geef een nettoprijs");
        int nettoprijs = Integer.parseInt(invoer.nextLine());
        double prijsInc = btw21(productnaam, nettoprijs);
        System.out.printf("%s kost %.2f euro ", productnaam, prijsInc);

    }

    private static double btw21(String productnaam, int nettoprijs) {
        double brut;
        if (productnaam.charAt(productnaam.length() - 1) == 't') {

            brut = (double) nettoprijs * (1.21);


        } else {
            brut = (double) nettoprijs * (1.06);

        }
        return brut;


    }
}
