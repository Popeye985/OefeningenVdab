
package com.company;

import java.util.Scanner;
public class uitslagVakken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef punten voor informatica: ");
        int puntenInformatica = Integer.parseInt(scanner.nextLine());
        System.out.print("Geef punten voor boekhouden: ");
        int puntenBoekhouden = Integer.parseInt(scanner.nextLine());
        System.out.print("Geef punten voor wiskunde: ");
        int puntenWiskunde = Integer.parseInt((scanner.nextLine()));
        int puntenWiskundeEnBoekhouden = puntenWiskunde + puntenBoekhouden;
        if (puntenInformatica >= 7 && puntenWiskundeEnBoekhouden >= 12) {
            System.out.println("Je bent geslaagd");
        } else {
            System.out.println("Je bent niet geslaagd");
            if (puntenInformatica < 7) {
                System.out.println("\tJe had te weinig punten voor informatica");
            } else if (puntenWiskundeEnBoekhouden < 12) {
                System.out.println("\tJe had te weinig punten voor wiskunde en boekhouden");

            }
        }
    }
}