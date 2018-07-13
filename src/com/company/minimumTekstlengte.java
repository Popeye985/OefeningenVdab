package com.company;

import java.util.Scanner;

public class minimumTekstlengte {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        String tekst;
        int teller = 0;

        do {
            System.out.println("Geef een tekst van minstens 8 karakters lang.");
            tekst = invoer.nextLine();
            if (tekst.length() < 8) {
                teller++;

                System.out.println("Kieken, ik zei minstens 8 karakters.");
                tekst = invoer.nextLine();

            }

        } while (tekst.length() < 8);

        System.out.println("De lengte van uw tekst is " + tekst.length() + " karakters lang.");

    }
}
