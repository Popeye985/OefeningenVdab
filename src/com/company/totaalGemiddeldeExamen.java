package com.company;

import java.util.Scanner;

public class totaalGemiddeldeExamen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        double totaal = 0;
        double gemiddelde = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Geef punten voor examen" + i);
            double punten = Double.parseDouble(invoer.nextLine());
            totaal = totaal + punten;

        }
        gemiddelde = totaal / 5;

        System.out.println("Het totaal is " + totaal);
        System.out.println("Het gemiddelde is " + gemiddelde);


    }
}
