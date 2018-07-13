package com.company;

public class tafelVan10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            int product = i*10;
            String tekstUitgelijnd = String.format("%d x 10 = %3d", i, product);
            System.out.println(tekstUitgelijnd);



        }
    }
}
