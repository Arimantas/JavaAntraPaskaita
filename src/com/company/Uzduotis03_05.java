package com.company;

import java.util.Scanner;

public class Uzduotis03_05 {
    // Paprasyti vartotojo ivesti du skaicius ir paskaiciuoti ju skirtuma ir suma
    // Sumos ir skirtumo skaiciavimai turi buti skirtinguose metoduose
    // Suma ir skirtumas turi priimti int ir float (overload)

    public Uzduotis03_05() {
        System.out.println("Iveskite 2 skaicius, sumos ir skirtumo skaiciavimui: ");
        Scanner sc = new Scanner(System.in);
        float sk1 = sc.nextFloat();
        float sk2 = sc.nextFloat();
        System.out.println(sk1 + " + " + sk2 + " = " + suma(sk1, sk2));
        System.out.println(sk1 + " - " + sk2 + " = " + skirt(sk1, sk2));
    }

    private float suma(float sk1, float sk2){
        return sk1 + sk2;
    }
    private int suma(int sk1, int sk2){
        return sk1 + sk2;
    }
    private float skirt(float sk1, float sk2){
        return sk1 - sk2;
    }
    private int skirt(int sk1, int sk2){
        return sk1 + sk2;
    }
}
