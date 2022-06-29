import java.util.Arrays;
import java.util.Scanner;

public class zadanie_5_4 {
    static void czytajDane(int []liczby,int n){

        Scanner sc=new Scanner(System.in);
        for(int i=0;i< liczby.length;i++){
            System.out.println("Podaj liczbe:");
            int a= sc.nextInt();
            liczby[i]=a;
        }
        System.out.println("Przed sortowaniem:");
        for(int i=0;i< liczby.length;i++){
            System.out.print(liczby[i]+" ");
        }
        System.out.println();
    }

    static void przetworzDane(int []liczby,int n){
        Arrays.sort(liczby);
    }

    static void wyswietlWynik(int []liczby,int n){
        System.out.println("Po sortowaniu:");
        for(int i=0;i< liczby.length;i++){
            System.out.print(liczby[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ile liczb wpisujesz?");
        int  n= sc.nextInt();
        int[] liczby=new int[n];

        zadanie_5_4.czytajDane(liczby,n);
        zadanie_5_4.przetworzDane(liczby,n);
        zadanie_5_4.wyswietlWynik(liczby,n);
    }
}
