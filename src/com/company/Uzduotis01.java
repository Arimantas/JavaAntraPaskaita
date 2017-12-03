package com.company;

import java.util.Scanner;

public class Uzduotis01 {

    public Uzduotis01() {
        // pasisveikinti su vartotoju
        // paprasyti ivesti varda
        // atspausdinti jo varda 5 kartus

        System.out.println("Sveiki, iveskite savo varda");
        Scanner sc = new Scanner(System.in);
        String vardas = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }

}
