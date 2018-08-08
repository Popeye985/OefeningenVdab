package com.company;

import java.util.Scanner;

public class Westvlaams2 {
    public static void main(String[] args) {

        String tevertalen = "Heel goed. Ik houd van goud, aha";
        String westVlaams = vertaalWVL(tevertalen);
        System.out.println("In het Westvlaams: " + westVlaams);
        String limburgs = vertaalLim(tevertalen);
        System.out.println("In het Limburgs: " +limburgs);
        String antwerps = vertaalAnt(tevertalen);
        System.out.println("In het Antwerps: " + antwerps);
    }
    private static String vertaalWVL(String tekst){
        String vertaaldeTekst="";

        for (int i = 0; i < tekst.length() ; i++) {
            switch (tekst.charAt(i)) {
                case 'h':
                    vertaaldeTekst = vertaaldeTekst + 'g';
                    break;
                case 'H':
                    vertaaldeTekst = vertaaldeTekst + 'G';
                    break;
                case 'g':
                    vertaaldeTekst = vertaaldeTekst + 'h';
                    break;
                case 'G':
                    vertaaldeTekst = vertaaldeTekst + 'H';
                    break;

            } return vertaaldeTekst;
        }
            private static String vertaalLim (String tekst){
                String klinkers = "aeiou";
                String resultaat = "";
                for (int i = 0; i < tekst.length(); i++) {
                    resultaat += tekst.charAt(i);
                    if (klinkers.indexOf(tekst.charAt(i)) != -1) {
                        resultaat += tekst.charAt(i);
                    }

                }return resultaat;
            }
            private static String vertaalAnt (String tekst) {
                String resultaat = "";
                boolean vorigeIsSpatie = true;
                for (int i = 0; i < tekst.length(); i++) {
                    if (!(vorigeIsSpatie && (tekst.charAt(i) == 'h' || tekst.charAt(i) == 'H'))){
                        resultaat += tekst.charAt(i);
                    }
                    vorigeIsSpatie = tekst.charAt(i) == ' ';
                }
                return resultaat;
            }


        }



    }






