package com.company;

import java.util.Scanner;

public class naarHuis {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wat is de temperatuur? ");
            int graden = Integer.parseInt(scanner.nextLine());
            if(mogenWeNaarHus(graden)){
                System.out.println("Spijtig, we moeten naar huis");
            }else{
                System.out.println("Joepie, we mogen blijven.");
            }

        }
        private static boolean mogenWeNaarHus(int graden){
            if (graden < 10 || graden > 35){
                return true;
            }else
                return false;

    }
}
