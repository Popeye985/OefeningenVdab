package com.company;

import java.util.Random;
import java.util.Scanner;

public class hogerLager {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        Random rnd = new Random();
        int getal = rnd.nextInt(100) + 1;
        int teller=0;
        int getalRaden;

        do {
            System.out.println("Raad het getal! Geef een getal tussen 1 en 100.");
            getalRaden = Integer.parseInt(invoer.nextLine());


            if (getalRaden < getal) {
                System.out.println("Hoger");
            }
            if (getalRaden > getal) {
                System.out.println("Lager");


            }
            teller++;

        } while (getal != getalRaden);
        System.out.println("U hebt het juiste getal geraden in " + teller + " beurten.");
    }

}






