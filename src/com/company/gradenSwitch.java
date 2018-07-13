package com.company;

import java.util.Scanner;

public class gradenSwitch {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een puntwaarde van 0-20 ");
        int punten = Integer.parseInt(invoer.nextLine());
        String graad;
        switch (punten){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                graad = "onvoldoende";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                graad = "voldoende";
                break;
            case 14:
            case 15:
                graad = "onderscheiding";
                break;
            case 16:
            case 17:
                graad = "grote onderscheiding";
                break;
            case 18:
            case 19:
            case 20:
                graad = "grootste onderscheiding";
                break;
            default:
                graad = "ongeldige punten";





        }

        System.out.println(graad);
    }
}
