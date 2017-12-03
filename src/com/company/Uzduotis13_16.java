package com.company;

import java.util.Scanner;

public class Uzduotis13_16 {
    // 1.13 Paprasyti vartotojo ivesti skaiciu, jo kvadrato skaiciavimui
    // Skaiciavimams sukurti nauja klase, kiekvienas skaiciavimas atliekamas naujame metode
    // Skaiciavimus isvesti i ekrana

    // 1.14 Sukurti nauja metoda staciakampio plota skaiciavimui, vartotojas iveda 2 krastiniu ilgius

    // 1.15 Sukurti nauja metoda trikampio ploto skaiciavimui. vartotojas iveda 2 klastiniu ilgius

    // 1.16 Sukurti nauja metoda apskritimo ploto skaiciavimui, vartotojas iveda apskritimo spinduli

    public Uzduotis13_16() {
        Skaicivimai sk = new Skaicivimai();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pasirinkite koki veiksma norite atlikti");
            System.out.println("1 - skaiciuoti kvadrato plota");
            System.out.println("2 - skaiciuoti staciakampio plota");
            System.out.println("3 - skaiciuoti staciojo trikampio plota");
            System.out.println("4 - skaiciuoti apskritimo plota");
            System.out.println("0 - baigti programos darba");
            char veiksmas = sc.next().charAt(0);

            switch (veiksmas) {
                case '1':
                    System.out.println("---[ Kvadrato ploto skaiciavimas ]---");
                    System.out.print("Iveskite kvadrato krastines ilgi: ");
                    float a = sc.nextFloat();
                    System.out.println("Kvadrato plotas: " + sk.kvad(a) + " m2");
                    System.out.println();
                    break;

                case '2':
                    System.out.println("---[ Staciakampio ploto skaiciavimas ]---");
                    System.out.print("Iveskite 1 stacikampio krastines ilgi: ");
                    float b = sc.nextFloat();
                    System.out.print("Iveskite 2 stacikampio krastines ilgi: ");
                    float c = sc.nextFloat();
                    System.out.println("Staciakampio plotas: " + sk.stac(b, c) + " m2");
                    System.out.println();
                    break;

                case '3':
                    System.out.println("---[ Staciojo trikampio ploto skaiciavimas ]---");
                    System.out.print("Iveskite 1 staciojo trikampio krastines ilgi: ");
                    float d = sc.nextFloat();
                    System.out.print("Iveskite 2 staciojo trikampio krastines ilgi: ");
                    float e = sc.nextFloat();
                    System.out.println("Staciojo trikampio plotas: " + sk.trik(d, e) + " m2");
                    System.out.println();
                    break;

                case '4':
                    System.out.println("---[ Apskritimo ploto skaiciavimas ]---");
                    System.out.print("Iveskite apskritimo spinduli: ");
                    float f = sc.nextFloat();
                    System.out.println("Staciojo trikampio plotas: " + sk.apsk(f) + " m2");
                    System.out.println();
                    break;

                case '0':
                    return;
            }
        }
    }
}

class Skaicivimai {

    public float kvad(float a) {
        return (float) Math.pow(a, 2);
        //return a * a;
    }

    public float stac(float b, float c) {
        return b * c;
    }

    public float trik(float d, float e) {
        return (d * e) / 2;
    }

    public float apsk(float f) {
        return (3.1415f * (f * f));
    }
}

