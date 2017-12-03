package com.company;

import java.util.Scanner;

public class Uzduotis12 {

    public Uzduotis12() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo ugi (metrais):");
        float ugis = sc.nextFloat();
        System.out.println("Iveskite savo svori (kg):");
        float mase = sc.nextFloat();
        Kmi kmi = new Kmi(ugis,mase);
        System.out.println("Jusu kuno mases indeksas: " + kmi.Kmi());
    }
}

class Kmi {

    private float ugis;
    private float mase;

    public Kmi(float ugis, float mase) {
        this.ugis = ugis;
        this.mase = mase;
    }

    public float Kmi() {
        return mase / (ugis * ugis);
    }
}
