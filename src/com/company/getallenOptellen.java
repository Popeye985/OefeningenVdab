package com.company;

import java.util.Scanner;

public class getallenOptellen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een eerste getal");
        int getal1 = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef een tweede getal");
        int getal2 = Integer.parseInt(invoer.nextLine());
        int som = getSom (getal1, getal2);
        int verschil = getVerschil(getal1, getal2);
        double quotient = getQuotient(getal1, getal2);
        int product = getProduct(getal1, getal2);

        System.out.printf("De som van %d en %d = %d\n", getal1, getal2, som );
        System.out.printf("Het verschil van %d en %d = %d\n", getal1, getal2, verschil);
        System.out.printf("Het quotient van %d en %d = %.2f\n", getal1, getal2, quotient);
        System.out.printf("Het product van %d en %d = %d\n", getal1, getal2, product);
    }

    private static int getSom(int getal1, int getal2) {
        return getal1 + getal2;


    }
    private static int getVerschil(int getal1, int getal2) {
        return getal1 - getal2;

    }
    private static double getQuotient (double getal1, double getal2){
        return getal1 / getal2;
    }
    private static int getProduct (int getal1, int getal2){
        return getal1 * getal2;
    }

}
