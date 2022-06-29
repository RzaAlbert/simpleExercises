package Podstawka;

import Geometria.Okrag;
import Ludzie.Czlowiek;

import javax.swing.*;
import java.util.ArrayList;

import java.util.Scanner;

public class javaForBegginers{
    public static void main(String[] args) {
        System.out.println("Hello World");

        /*int a=15;
        double c=1.5;
        float b= 1.5F;
        String tekst="AAAA";
        int []tab=new int[5];

        System.out.println(tekst.length());

        for (int i=0;i<tab.length;i++){
            tab[i]=i;
        }
        for (int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }

        System.out.println("Bob" + " " + "ma" + a);
    }
    */


        /*int[] tab = new int[25];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (int i=0;i<tab.length;i++){
            if(i%5==0)
                System.out.println();
            if(i<10)
                System.out.print("0"+tab[i] + " ");
            else
                System.out.print(tab[i] + " ");
        }

        Scanner scn=new Scanner(System.in);

        System.out.println("Podaj liczbe:");
        int a=scn.nextInt();

        System.out.println(a);

         */



        Samochod kia=new Samochod();

        kia.setModel("Rio");
        kia.setRocznik(2002);

        System.out.println(kia.getModel()+kia.getRocznik());

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        switch(a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }


       /* String[] tablica=new String[10];

        tablica[0]="Zerowy";

        System.out.println(tablica[0]);
        */

        /*int[][] tab2D=new int[5][5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
                tab2D[i][j]=i;
        }
        for(int row=0;row<tab2D.length;row++){
            for(int col=0;col<tab2D[row].length;col++)
                System.out.print(tab2D[row][col] + "  ");
            System.out.println();
        }
        */

        /*String tekst="Wiatam";
        int a=5;

        System.out.println(String.valueOf(a));
        System.out.println(Integer.toString(a));
        System.out.println(tekst.toUpperCase());

         */
        /*
        Okrag.makeObjectArray();

        StringBuilder sb=new StringBuilder();
        sb.append("Witam");
        System.out.println(sb);


        */




    }
}