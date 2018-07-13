package com.company;

        import java.util.Scanner;

public class naamBold {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        String tekst;
        do {
            System.out.println("Geef een tekst van minstens 8 karakters lang." );
            tekst = invoer.nextLine();

            if (tekst.length() < 8){
                System.out.println("Ik zei 8 karakters, kieken. Opnieuw");
                System.out.println("Geef een tekst van minstens 8 karakters lang." );
                tekst = invoer.nextLine();

            }
        } while (tekst.length() < 8);

        System.out.println("Je tekst is  \"" + tekst.toUpperCase() + "\"" );


    }
}
