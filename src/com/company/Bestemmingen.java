package com.company;

import java.util.Scanner;

public class Bestemmingen {
    public static void main(String[] args) {
        String[] bestemmingen = {"Zweden", "Zichemzussenbolder", "Tadzjikistan"};
        Double[] bestemmingenPrijzen = {10.00 , 15.00 , 20.00};
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef je naam.");
        String naam = invoer.nextLine();
        int bestemmingKeuze;
        do {

            for (int i = 0; i < bestemmingen.length; i++) {
                System.out.printf("\t %d. %s (€%.2f) \n", (i + 1), bestemmingen[i], bestemmingenPrijzen[i]);


            }
            System.out.println("Welke bestemming kies je? (1-3)");
            bestemmingKeuze = Integer.parseInt(invoer.nextLine());
            if (bestemmingKeuze < 1 || bestemmingKeuze > bestemmingen.length) {
                System.out.println("Uw keuze moet tussen 1 en 3 liggen. Kies opnieuw");

            }

        }while ( bestemmingKeuze < 1 || bestemmingKeuze > bestemmingen.length);


            System.out.printf("Dag %s, veel plezier in %s. Dit kost je €%.2f.", naam, bestemmingen[bestemmingKeuze - 1], bestemmingenPrijzen[bestemmingKeuze - 1]);
        }


        }






