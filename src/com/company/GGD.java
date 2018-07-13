package com.company;

import java.util.Scanner;

public class GGD {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een getal");
        int Getal1 = Integer.parseInt(invoer.nextLine());

        System.out.println("Geef nog een getal");
        int Getal2 = Integer.parseInt(invoer.nextLine());


        while (Getal1 != Getal2) {

            if (Getal1 < Getal2) {
                Getal2 = Getal2 - Getal1;
            }
            else {
                Getal1 = Getal1 - Getal2;
            }

        }

        System.out.println("De grootste gemene deler is " + Getal2);


    }
}
