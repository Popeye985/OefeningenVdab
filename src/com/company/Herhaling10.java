package com.company;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Herhaling10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random rnd = new Random();
            int tezoeken = rnd.nextInt(10) + 1;
            boolean gevonden = false;
            int aantalPogingen = 0;
            do{
                aantalPogingen++;
                System.out.println("Raad een getal tussen 1 en 10.");
                int getalIngegeven = Integer.parseInt(scanner.nextLine());
                if (getalIngegeven == tezoeken) {
                    gevonden = true;

                } else {
                    if (tezoeken > getalIngegeven)
                    System.out.println("Het getal is groter.");


                    else {
                        System.out.println("Het getal is kleiner.");}
                }
                //Vul hier je eigen code in
            }while(!gevonden);
            System.out.printf("Je vond het getal in %d pogingen.", aantalPogingen);
        }
    }

