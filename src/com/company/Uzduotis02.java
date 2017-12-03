package com.company;

import java.util.Scanner;

public class Uzduotis02 {
    public Uzduotis02() {
        // Paprasyti vartotojo ivesti zodi
        // Atspauzdinti kiek simboliu tas zodis turi

        System.out.println("Iveskite zodi: ");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        System.out.println("Zodzio ilgis: " + zodis.length() + " simboliai");
    }
}