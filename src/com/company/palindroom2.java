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
    private static String isPalindroom (tekst){
        for (int i = woord.length() - 1; i >= 0; i--) {
            anderWoord = anderWoord + woord.charAt(i);

        }
        if (woord.equalsIgnoreCase(anderWoord))
            System.out.println("Dit is een palindroom");
        else
            System.out.println("Dit is geen palindroom");


    }
}
