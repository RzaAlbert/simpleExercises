package Podstawka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {


    public static void dodawanie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        double a=sc.nextDouble();
        System.out.println("Podaj liczbe b:");
        double b=sc.nextDouble();

        try{
            System.out.println("a+b="+(a+b));
        }catch(InputMismatchException e){
            System.err.println("Podaj liczby");
            dodawanie();
        }
    }

    public static void odejmowanie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        double a=sc.nextDouble();
        System.out.println("Podaj liczbe b:");
        double b=sc.nextDouble();

        try{
            System.out.println("a-b="+(a-b));
        }catch(InputMismatchException e){
            System.err.println("Podaj liczby");
            odejmowanie();
        }
    }
    public static void mnozenie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        double a=sc.nextDouble();
        System.out.println("Podaj liczbe b:");
        double b=sc.nextDouble();

        try{
            System.out.println("a*b="+(a*b));
        }catch(InputMismatchException e){
            System.err.println("Podaj liczby");
            mnozenie();
        }
    }
    public static void dzielenie(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        double a=sc.nextDouble();
        System.out.println("Podaj liczbe b:");
        double b=sc.nextDouble();

        try{
            System.out.println("a/b="+(a/b));
        }catch(ArithmeticException e){
            System.err.println("Dzielenie przez 0");
            dzielenie();
        }catch(InputMismatchException e){
            System.err.println("Podaj liczby");
            dodawanie();
        }
    }

}
