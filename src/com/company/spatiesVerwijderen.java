package com.company;

import java.util.Scanner;

public class spatiesVerwijderen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een tekst op");
        String tekst = invoer.nextLine();


        while (tekst.contains ("  ")) {
            tekst = tekst.replace("  ", " ");


        }
        System.out.println ("Uw tekst zonder spaties is: " + tekst);

    }
}
