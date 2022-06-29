package Podstawka;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
import java.util.Collections;
import java.util.Collection;

public class Kolekcje {

    public static void zadanie_7_2() {
        Scanner skaner = new Scanner(System.in);
        int suma = 0, iloczyn = 1,a,counter=0;
        boolean warunek = true;


        while (warunek) {
            System.out.println("Podaj liczbe:");
            a = skaner.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Suma=" + suma + " a Iloczyn=" + iloczyn + "wprowadzono liczb" + counter);
                    warunek = false;
                    continue;
                default:
                    suma += a;
                    iloczyn *= a;
                    counter+=1;
                    break;


            }
        }
    }


}
