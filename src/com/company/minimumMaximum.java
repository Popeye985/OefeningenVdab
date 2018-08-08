package com.company;

import java.util.Scanner;

public class minimumMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINIMUM= -5;
        final int MAXIMUM = 5;
        int getal = vraagGetal(scanner, MINIMUM, MAXIMUM);
        System.out.printf("Het getal is %d." , getal);

    }
    private static int vraagGetal (Scanner invoer, int min, int max ){
        System.out.printf("Geef een getal tussen %d en %d", min, max);
        int getal = Integer.parseInt(invoer.nextLine());
        while (getal < min || getal > max){
            System.out.println("Fout, kieken");
            System.out.printf("Geef een getal tussen %d en %d", min, max);
            getal = Integer.parseInt(invoer.nextLine());
        }
        return getal;
    }

}
