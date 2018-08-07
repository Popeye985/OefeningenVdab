package com.company;

public class begroeting {
    public static void main(String[] args) {
        char gender = 'm';
        String naam = "Joske";
        String begroeting = begroet(gender, naam);
        System.out.println(begroeting);
        gender = 'v';
        naam = "Marieke";
        begroeting = begroet(gender, naam);
        System.out.println(begroeting);

    }




    private static String begroet(char gender, String naam) {
        if (gender == 'm') {
            return String.format("Dag meneer ", naam);

        }else { //else if gender == 'v'
            return String.format("Dag mevrouw ", naam);

        }//return""

    }

}

