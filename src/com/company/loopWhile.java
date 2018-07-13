package com.company;

import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een getal boven 0");
        int getal = Integer.parseInt(invoer.nextLine());

        while (getal <= 0) {

            System.out.println("Dit is geen geldig getal. Geef een nieuw getal in.");
            getal = Integer.parseInt(invoer.nextLine());

        }

            System.out.println("Fantastisch!");


        }
    }


