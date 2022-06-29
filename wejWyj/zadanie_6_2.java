package wejWyj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie_6_2 {
    static void czytajDane(int[][] macierz,int rozmiar) {
        for(int row=0;row<macierz.length;row++){
            for(int col=0;col<macierz[row].length;col++){
                if(row==col)
                    macierz[row][col]=1;
                else
                    macierz[row][col]=0;
            }
        }

    }

    static void zapiszDaneDoPliku(int[][] macierz,int rozmiar) throws FileNotFoundException {
        File file=new File("dane.txt");

        PrintWriter zapis =new PrintWriter(file);


        for(int row=0;row<macierz.length;row++){
            for(int col=0;col<macierz[row].length;col++){
                zapis.print(macierz[row][col]+ " ");
            }
            zapis.println();
        }
        zapis.close();
    }


    static void czytajDaneZPliku(int[][] macierz,int rozmiar) throws FileNotFoundException {

        File plik=new File("dane.txt");
        Scanner sc=new Scanner(plik);

        System.out.println("Dane odczytane z pliku:");
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] macierz=new int[10][10];
        zadanie_6_2.czytajDane(macierz,10);
        zadanie_6_2.zapiszDaneDoPliku(macierz,10);
        zadanie_6_2.czytajDaneZPliku(macierz,10);
    }
}
