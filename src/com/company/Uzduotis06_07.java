package com.company;

import java.util.Scanner;

public class Uzduotis06_07 {

    public Uzduotis06_07() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo ugi (metrais):");
        float ugis = sc.nextFloat();
        System.out.println("Iveskite savo svori (kg):");
        float mase = sc.nextFloat();
        System.out.println("Jusu kuno mases indeksas yra: " + kmi(ugis, mase));
    }

    private float kmi(float ugis, float mase) {
        return Math.round(mase / (ugis * ugis)); // Math.round - pavercia float i int?
    }
}
