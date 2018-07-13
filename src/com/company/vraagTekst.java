package com.company;

import java.util.Scanner;

public class vraagTekst {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een tekst op.");
        String tekstInvoer = invoer.nextLine();
        System.out.println("Geef een zoektekst op.");
        String tekstZoeken = invoer.nextLine();
        int positie = tekstInvoer.indexOf(tekstZoeken);
        int positieLaatst = tekstInvoer.lastIndexOf(tekstZoeken);
        if (positie != -1) {
            if (positie == positieLaatst)
            System.out.println("De zoekterm komt eenmaal voor.");
            else
            System.out.println("De zoekterm komt meer dan eenmaal voor.");
        }
        else{
            System.out.println("De zoekterm komt niet voor.");

        }
            }

        }
