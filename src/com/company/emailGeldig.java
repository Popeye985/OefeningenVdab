package com.company;

import java.util.Scanner;

public class emailGeldig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef e-mailadres: ");
        String email = scanner.nextLine();
        while (!isGeldigEmailAdres(email)){
            System.out.println("Fout, kieken.");
            System.out.print("Geef e-mailadres: ");
            email = scanner.nextLine();
        }
        System.out.printf("Het adres is %s", email);

    }
    private static boolean isGeldigEmailAdres (String email) {
        int positie = -1;
        if (email.indexOf('@') != email.lastIndexOf('@')) {
            return false;
        }


        if (email.indexOf('@') > email.indexOf('.')) {
            return false;

        }else
            return true;
    }


    }

