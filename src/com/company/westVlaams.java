package com.company;

import java.util.Scanner;

public class westVlaams {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        String tekstAN;
        System.out.println("Geef een tekst op.");
        tekstAN = invoer.nextLine();
        char[] characters = tekstAN.toCharArray();
        for (int i = 0; i < characters.length ; i++) {
            if (characters[i] == 'g')
                characters[i] = 'h';
            else if (characters[i] == 'h')
                characters[i] = 'g';
            else if (characters[i] == 'G')
                characters[i] = 'H';
            else if (characters[i] == 'H')
                characters[i] = 'G';

            }
            String resultaat = new String(characters);
        System.out.println("In het Westvlaams klinkt het zo: " + resultaat);

        }

    }

