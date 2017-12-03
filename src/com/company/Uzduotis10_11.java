package com.company;

import java.util.Scanner;

public class Uzduotis10_11 {

    public Uzduotis10_11() {
        // Sukurti skaiciuotuvo klase, kuri butu galima skaiciuoti suma, skirtuma, sandauga (naudojami int skaiciai)
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite 1 skaiciu: ");
        float sk1 = sc.nextFloat();
        System.out.print("Iveskite 2 skaiciu: ");
        float sk2 = sc.nextFloat();
        System.out.println("Koki veiksma su siais skaiciais norite atlikti? Pvz.: +, -, *");
        char veiksmas = sc.next().charAt(0); //charAt(0) nuskaito 1 eilutes zenkla, jei bus parasyta +dasdas, vistiek ims tik + ir veiks

        Skaiciuotuvas skaic = new Skaiciuotuvas();

        while (true) {
            if (veiksmas == '+') {
                float suma = skaic.suma(sk1, sk2);
                if (suma == Math.floor(suma)) {
                    System.out.println("(int)  " + (int) sk1 + " + " + (int) sk2 + " = " + Skaiciuotuvas.suma((int) sk1, (int) sk2));
                } else {
                    System.out.println("(float)  " + sk1 + " + " + sk2 + " = " + suma);
                }
                break;
            } else if (veiksmas == '-') {
                float skirt = skaic.skirt(sk1, sk2);
                if (skirt == Math.floor(skirt)) {
                    System.out.println("(int)  " + (int) sk1 + " - " + (int) sk2 + " = " + Skaiciuotuvas.skirt((int) sk1, (int) sk2));
                } else {
                    System.out.println("(float)  " + sk1 + " - " + sk2 + " = " + skirt);
                }
                break;
            } else if (veiksmas == '*') {
                // nelabai tinka toks sprendimas, bet veikia, skaiciuoja gerai
                float sand = skaic.sand(sk1, sk2);
                if (sand == Math.floor(sand) && sk1 != 10 && sk2 != 10 || (sk1 * sk2 == 0)) {
                    System.out.println("(int)  " + (int) sk1 + " x " + (int) sk2 + " = " + Skaiciuotuvas.sand((int) sk1, (int) sk2));
                } else {
                    System.out.println("(float)  " + sk1 + " x " + sk2 + " = " + sand);
                }
                break;
            } else {
                System.out.println("Negalimas veiksmas.");
                System.out.println("Iveskite: +, - arba *");
                veiksmas = sc.next().charAt(0);
            }
        }
    }
}

class Skaiciuotuvas {

    public static int suma(int sk1, int sk2) {
        return sk1 + sk2;
    }

    public static float suma(float sk1, float sk2) {
        return sk1 + sk2;
    }

    public static int skirt(int sk1, int sk2) {
        return sk1 - sk2;
    }

    public static float skirt(float sk1, float sk2) {
        return sk1 - sk2;
    }

    public static int sand(int sk1, int sk2) {
        return sk1 * sk2;
    }

    public static float sand(float sk1, float sk2) {
        return sk1 * sk2;
    }
}

