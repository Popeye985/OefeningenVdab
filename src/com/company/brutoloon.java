package com.company;

import java.util.Scanner;

public class brutoloon {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef uw uurloon");
        double uurloon = Double.parseDouble(invoer.nextLine());
        System.out.println("Geef het gewerkte aantal uren");
        double aantalUren = Double.parseDouble(invoer.nextLine());
        double brutoLoon = uurloon * aantalUren;
        System.out.println("Uw brutoloon is " + brutoLoon);
    }
}
