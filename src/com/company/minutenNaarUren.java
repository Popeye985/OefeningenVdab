package com.company;

import java.util.Scanner;

public class minutenNaarUren {
    public static void main(String[] args) {
        int aantalUren = 0;
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef het aantal minuten op");
        int aantalMinuten = Integer.parseInt(invoer.nextLine());
        while (aantalMinuten >= 60) {
            aantalMinuten = aantalMinuten - 60;
            aantalUren = aantalUren + 1;

        }

        System.out.println("Het aantal uren is " + aantalUren + " en het aantal minuten is " + aantalMinuten);
    }
}
