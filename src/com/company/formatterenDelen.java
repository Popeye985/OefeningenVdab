package com.company;

import java.util.Scanner;

public class formatterenDelen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef getal 1.");
        double getal1 = Double.parseDouble (invoer.nextLine());
        System.out.println("Geef getal 2");
        double getal2 = Double.parseDouble (invoer.nextLine());
        double quotient = getal1 / getal2;
        String resultaat = String.format("%f /  %f /  = %.2f", getal1, getal2, quotient );
        System.out.println(resultaat);

    }
}
