import java.util.Scanner;

public class zadanie_5_1 {

    protected int a;
    protected int b;
    protected int pole;

    public zadanie_5_1() {
    }

    public zadanie_5_1 (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void czytajDane(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj bok a:");
        int a= sc.nextInt();
        System.out.println("Podaj bok b:");
        int b= sc.nextInt();
        this.a=a;
        this.b=a;

    }

    public void przetworzDane(){
        this.pole=a*b;

    }
    public void wyswietlWynik(){
        System.out.println("Bok a:"+a);
        System.out.println("Bok b:"+b);
        System.out.println("Pole:"+pole);

    }


}
