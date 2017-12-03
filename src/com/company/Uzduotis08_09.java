package com.company;

import java.util.Scanner;

public class Uzduotis08_09 {
    private float atstumas;
    private float sanaudos;
    // Paprasyti vartotojo ivesti automobilio nuvaziuota atstuma ir kuro sanaudas
    // Paskaiciuoti vidutines kuro sanaudas
    // Tiek nuskaitymas tiek vidurkio skaiciavimas atliekami skirtinguose metoduose

    public Uzduotis08_09() {
        nuskaitymas();
        System.out.println("Vidutines kuro sanaudos: " + vidSanaudos() + " litru (-ai)");
    }

    private void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite kiek km nuvaziavo jusu automobilis: ");
        atstumas = sc.nextFloat();
        System.out.print("Iveskite kiek kuro sunaudojote (litrais): ");
        sanaudos = sc.nextFloat();
    }

    private float vidSanaudos() {
        return (sanaudos * 100) / atstumas;
    }
}

