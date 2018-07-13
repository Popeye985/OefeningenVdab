package com.company;
import java.util.Scanner;

    public class somVanPositief {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int som = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("Geef een positief getal: ");
                int getal = Integer.parseInt(scanner.nextLine());
                if (getal < 0) {
                    System.out.println("Fout. Enkel positieve getallen mogen opgeteld worden.");
                } else {
                    som = som + getal;
                }
                System.out.println("De som van alle positieve getallen: " + som);
            }
        }
    }
