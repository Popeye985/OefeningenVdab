package com.company;

import java.util.Scanner;

public class Graden {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef een puntwaarde van 0-20 ");
        int punten = Integer.parseInt(invoer.nextLine());
        if (punten < 10 && punten <= 0) {
            System.out.println("Onvoldoende");
        }
            else if (punten >= 10 && punten < 14){
                System.out.println("Voldoende");
            }
            else if (punten >= 14 && punten < 16) {
            System.out.println("Onderscheiding");
        }
                else if (punten >= 16 && punten < 18) {
                System.out.println("Grote onderscheiding");
            }
                    else if (punten >= 18 && punten <= 20 ) {
                System.out.println("Grootste onderscheiding");
            }
                        else {
                System.out.println("Ongeldige punten");
            }






    }

    }

