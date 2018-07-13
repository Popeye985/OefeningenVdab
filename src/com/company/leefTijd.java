package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class leefTijd {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        int dagVandaag = vandaag.getDayOfMonth();
        int maandVandaag = vandaag.getMonthValue();
        int jaarVandaag = vandaag.getYear();
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef uw geboortejaar");
        int geboorteJaar = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef uw geboortemaand");
        int geboorteMaand = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef uw geboortedag");
        int geboorteDag = Integer.parseInt(invoer.nextLine());
        int leeftijd = jaarVandaag - geboorteJaar;

        if (geboorteMaand > maandVandaag) {
            leeftijd--;
        }
        if (geboorteMaand == maandVandaag && geboorteDag >= dagVandaag ){
            leeftijd++;
        }

        System.out.println("Uw leeftijd is " + leeftijd);

    }




}
