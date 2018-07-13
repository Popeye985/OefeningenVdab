package com.company;

import java.util.Scanner;

public class alfabetischRangschikken {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        System.out.println("Geef een willekeurig woord in.");
        String woordWillekeurig = invoer.nextLine();
        String woordAlfa;

        do {
            System.out.println("Geef een woord in dat alfabetisch na het ingegeven woord komt.");
            woordAlfa = invoer.nextLine();
            if (woordAlfa.compareTo(woordWillekeurig) > 0 ) {
                System.out.println("Inderdaad, dit woord komt na \"" + woordWillekeurig + "\"");
            }
            else {
                System.out.println("\"" + woordAlfa + "\"" + " komt niet na  \"" + woordWillekeurig + "\"");
            }
        }while (woordWillekeurig.compareTo(woordAlfa) > 0);



    }
}
