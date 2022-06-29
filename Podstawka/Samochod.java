package Podstawka;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public  class Samochod implements Info {
    public int rocznik;
    public String model;

    public Samochod() {

    }

    public Samochod(int rocznik, String model) {
        this.rocznik = rocznik;
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public String getModel() {
        return model;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void wypisz() {
        for (int i = 0; i < 55; i++)
            System.out.println(i);
    }

    public static void dwaPiec() {
        for (int i = 5; i < 81; i += 15)
            System.out.println(i);
    }

    public static void dwaSzesc(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b)
            System.out.println("Mozna zbudowac");
        else
            System.out.println("Nie mozna zbudowac");
        if (a == b || a == c || b == c)
            System.out.println("Rownoramienny");
        if (a == b && a == c)
            System.out.println("Rownoboczny");
        else
            System.out.println("Roznoboczny");

    }

    public static void dwaSiedem() {
        for (int i = 11; i < 112; i++) {
            if (i % 13 == 0)
                System.out.println(i);
        }
    }

    public static int Fibo(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }

    public static void trzyJeden(char c,String tekst){
        int sum=0;
        for(int i=0;i<tekst.length();i++){
            if(tekst.charAt(i)==c)
                sum+=1;
        }
        System.out.println("Znak:" + c + "wystąpił w tym Stringu" + sum + "razy");
    }

    public static void trzyDwa(String tekst){
        int sum=0;
        for(int i=0;i<tekst.length();i++){
            if(tekst.charAt(i)>=48 && tekst.charAt(i)<=57)
                sum+=tekst.charAt(i);
            if(tekst.charAt(i)>=97 && tekst.charAt(i)<=122)
                sum+=tekst.charAt(i);
        }
        System.out.println(sum);
    }

    public static void trzyTrzy(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu od 33 do 126:");
        int a=sc.nextInt();
        System.out.println((char) a);
    }

    public static void czteryJeden(){
        int[] tab=new int[100];

        for(int i=0;i<tab.length;i++){
            tab[i]=i;
        }
        for(int i=0;i<tab.length;i++){
            if(i%10==0)
                System.out.println();

            System.out.print(tab[i] + "  ");
        }

    }

    public static void czteryDwa(){
        Random rnd=new Random();
        int size=rnd.nextInt(11)+10;
        int[][] tab2D=new int[size][size];

        for(int row=0;row<tab2D.length;row++){
            for(int col=0;col<tab2D[row].length;col++){
                if(row==col){
                    tab2D[row][col]=1;
                }
                tab2D[row][col]=rnd.nextInt(41)-20;
            }
        }
        for(int row=0;row<tab2D.length;row++){
            for(int col=0;col<tab2D[row].length;col++)
                System.out.print(tab2D[row][col] + "  ");
            System.out.println();
        }
    }


    @Override
    public void showInfo() {
        System.out.println("Jest sobie woz");
    }

    public static void dziel(int x) {
        Scanner skaner = new Scanner(System.in);
        try {
            int y = skaner.nextInt();
            System.out.println("Twój wynik to: " + x / y);
        } catch (ArithmeticException e) {
            System.err.println("Podaj poprawny dzielnik");
            dziel(x);
        } catch(InputMismatchException e){
            System.err.println("Podaj poprawny dzielnik");
            dziel(x);
        }
    }


    public static void znowDzielenie(int x) throws
            ArithmeticException {
        Scanner skaner = new Scanner(System.in);
        int y = skaner.nextInt();
        if (y == 0)
            throw new ArithmeticException("Podaj poprawny mianownik");
        else
            System.out.println("Twój wynik to: " + x / y);
    }

}
