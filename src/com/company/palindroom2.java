package com.company;

import java.util.Scanner;

public class palindroom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef tekst: ");
        String tekst = scanner.nextLine();
        if (isPalindroom(tekst)){
            System.out.printf("%s is een palindroom", tekst);
        }else{
            System.out.printf("%s is geen palindroom", tekst);
        }
    }
    private static boolean isPalindroom (String tekst){
        String omgekeerd = "";
        for (int i = tekst.length() - 1; i >= 0; i++) {
            omgekeerd = tekst.charAt(i) + omgekeerd;

        }
        return tekst.equals(omgekeerd);

    }
}
