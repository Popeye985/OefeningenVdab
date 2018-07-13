package com.company;

import java.util.Scanner;

public class forLoop {


    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Geef naam " + (i + 1));
            String naam = invoer.nextLine();
            System.out.println("Dag " + naam);

        }
    }

}