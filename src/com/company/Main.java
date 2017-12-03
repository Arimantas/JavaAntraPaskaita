package com.company;

import java.util.Scanner;

public class Main {

    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;
    public static final int CHOISE_5 = 5;
    public static final int CHOISE_6 = 6;
    public static final int CHOISE_7 = 7;
    public static final int CHOISE_8 = 8;

    public static void main(String[] args) {
        // Parodyti vartotojui kiek yra uzduociu
        // paklausti vartotojo kokia uzduoti parodyti
        // nuskaityti vartotojo pasirinkima
        // pagal ivesta sveika skaiciu rodyti uzduoties vykdyma
        // Programa kartoja sia seka kol vartotojas iveda 0
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Is viso turime 8 uzduotis");
            System.out.println("Uzduociai parisikti iveskite jos numeti, pvz.: 1  (1-8)");
            System.out.println("Ivedus 0 programa bus baigta");

            int pasirinkimas = sc.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirma = new Uzduotis01();
                    break;
                case CHOISE_2:
                    Uzduotis02 antra = new Uzduotis02();
                    break;
                case CHOISE_3:
                    Uzduotis03_05 trecia = new Uzduotis03_05();
                    break;
                case CHOISE_4:
                    Uzduotis06_07 ketvirta = new Uzduotis06_07();
                    break;
                case CHOISE_5:
                    Uzduotis08_09 penkta = new Uzduotis08_09();
                    break;
                case CHOISE_6:
                    Uzduotis10_11 sesta = new Uzduotis10_11();
                    break;
                case CHOISE_7:
                    Uzduotis12 septinta = new Uzduotis12();
                    break;
                case CHOISE_8:
                    Uzduotis13_16 astunta = new Uzduotis13_16();
                    break;
            }
        }
    }
}