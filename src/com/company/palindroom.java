package com.company;

import java.util.Scanner;

public class palindroom {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een woord in");
        String woord = invoer.nextLine();
        String anderWoord = "";
        for (int i = woord.length() - 1; i >= 0; i--) {
            anderWoord = anderWoord + woord.charAt(i);

        }
        if (woord.equalsIgnoreCase(anderWoord))
            System.out.println("Dit is een palindroom");
        else
            System.out.println("Dit is geen palindroom");


    }
}

