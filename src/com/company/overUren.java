package com.company;

import java.util.Scanner;

public class overUren {
    public static void main(String[] args) {
        final double URENPERDAG = 7.6;
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef het totaal aantal gewerkte uren");
        double urenGewerkt = Double.parseDouble(invoer.nextLine());
        System.out.println("Wat is uw uurloon");
        double uurLoon = Double.parseDouble(invoer.nextLine());
        double overUren = urenGewerkt - URENPERDAG;

        if (urenGewerkt > URENPERDAG) {
            overUren = urenGewerkt - URENPERDAG;
            urenGewerkt = URENPERDAG;

        }

        else
            overUren = 0;
        double loon = (urenGewerkt * uurLoon) + (overUren*uurLoon*1.5);
        System.out.println("U heeft " + urenGewerkt + " uren gewerkt en " + overUren + " gepresteerd ten bedrage van " + loon + " €");

    }
}
