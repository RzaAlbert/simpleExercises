package wejWyj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class zadanie_6_1 {


    private static String dane;

    static void czytajDane() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko");
        dane=sc.nextLine();

    }

    static void zapiszDaneDoPliku(String dane) throws FileNotFoundException {
        File file=new File("zapis.txt");

        PrintWriter zapis =new PrintWriter(file);

        zapis.println(dane);
        zapis.close();
    }


    static void czytajDaneZPliku() throws FileNotFoundException {
        File plik=new File("zapis.txt");
        Scanner sc=new Scanner(plik);

        System.out.println("Dane odczytane z pliku:");
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        zadanie_6_1.czytajDane();
        zadanie_6_1.zapiszDaneDoPliku(dane);
        zadanie_6_1.czytajDaneZPliku();
    }
}
