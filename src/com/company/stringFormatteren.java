package com.company;

import java.util.Scanner;

public class stringFormatteren {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            Scanner invoer = new Scanner(System.in);
            System.out.println("Geef een naam op");
            String naam = invoer.nextLine();
            String resultaat = String.format ("Naam: %20s ", naam );
            
        }


    }

}
