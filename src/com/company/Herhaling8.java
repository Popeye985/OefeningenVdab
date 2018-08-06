package com.company;

public class Herhaling8 {
        public static void main(String[] args) {
            String[] namen = {"Karen", "Kristel", "Kathleen", "Josje", "Hanne", "Marthe", "Klaasje"};
            int aantalK = 0;
            int aantalJ = 0;
            int aantalAnder = 0;
            for (String naam: namen) {
                switch(naam.charAt(0)) {
                    case 'K':
                        aantalK++;
                        break;
                    case 'J':
                        aantalJ++;
                        break;
                    default:
                        aantalAnder++;
                }
            }
            System.out.printf("Er zijn %d namen met een 'K', %d met een 'J' en %d andere", aantalK, aantalJ, aantalAnder);
        }
    }

