package com.company;

public class evenGetallen {
    public static void main(String[] args) {
        int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] % 2 == 0) {
                int getal = getallen[i];
                System.out.println(getal);

            }
            for (int getal : getallen) {
                if (getal % 2 == 0) {
                    System.out.println(getal);

                }

            }
        }


    }

}
