package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class oefJaar {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        Scanner invoer = new Scanner (System.in);
        System.out.println("Geef een jaar in de toekomst.");
        int jaarGevraagd = Integer.parseInt(invoer.nextLine());
        int jaar = vandaag.getYear();
        while (jaar > jaarGevraagd) {
            System.out.println("Het opgegeven jaar moet minstens 2018 betreffen. Geef een nieuw jaar in.");
            jaarGevraagd = Integer.parseInt(invoer.nextLine());
        }

        System.out.println("Geef een maand in de toekomst");
        int maandGevraagd = Integer.parseInt(invoer.nextLine());
        int maand = vandaag.getMonthValue();
        if (maand == maandGevraagd) {
            while (maand > maandGevraagd) {
                System.out.println("De opgegeven maand moet in de toekomst liggen. Geef een nieuwe maand in.");
                maandGevraagd = Integer.parseInt(invoer.nextLine());
            }
        }
        System.out.println("Geef een dag in de toekomst");
        int dagGevraagd = Integer.parseInt(invoer.nextLine());
        int dag = vandaag.getDayOfMonth();
        if (jaar == jaarGevraagd && maand == maandGevraagd) {
            while (dag > dagGevraagd) {

                System.out.println("De opgegeven dag moet in de toekomst liggen. Geef een nieuwe dag in.");
                dagGevraagd = Integer.parseInt(invoer.nextLine());

            }
        }
        System.out.println("De datum is " + dagGevraagd + "/" + maandGevraagd + "/" + jaarGevraagd);




    }
}
