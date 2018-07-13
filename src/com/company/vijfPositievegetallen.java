package com.company;

        import java.util.Scanner;

public class vijfPositievegetallen {
    public static void main(String[] args) {
        Scanner invoer = new Scanner (System.in);
        int som = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Geef een positief getal: ");
            int getal = Integer.parseInt(invoer.nextLine());
            while (getal < 0) {
                System.out.println("Ik had gezegd een positief getal, kieken!");
                getal = Integer.parseInt(invoer.nextLine());
                System.out.println("Geef een positief getal");


            }
            som = som + getal;

        }

        System.out.println("De som van de positieve getallen is " + som);
    }
}
