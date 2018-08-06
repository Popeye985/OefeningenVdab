package com.company;

import java.util.Scanner;

public class getallenOptellen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een eerste getal");
        int getal1 = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef een tweede getal");
        int getal2 = Integer.parseInt(invoer.nextLine());
        int som = getal1 + getal2;
        System.out.printf("De som van %d en %d = %d", getal1, getal2, som );
    }
}
