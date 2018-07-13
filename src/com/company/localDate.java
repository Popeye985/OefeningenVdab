package com.company;

import java.time.LocalDate;
import java.time.Month;

public class localDate {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);
        int dag = vandaag.getDayOfMonth();
        System.out.println("De dag: " + dag);
        int maand = vandaag. getMonthValue();
        System.out.println("De maand: " + maand);
        int jaar = vandaag.getYear();
        System.out.println("Het jaar: " + jaar);
        Month maandEnum = vandaag.getMonth();
        System.out.println(maandEnum);
    }
}
