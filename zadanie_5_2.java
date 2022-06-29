import java.util.Scanner;

public class zadanie_5_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int delta;
    protected int warunek;
    protected int x0;
    protected int x1;
    protected int x2;



    public zadanie_5_2() {

    }

    public void czytajDane() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Podaj a:");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("To nie jest rownanie kwadratowe");
                System.exit(1);
            }
            System.out.println("Podaj b:");
            b = sc.nextInt();
            System.out.println("Podaj c:");
            c = sc.nextInt();

    }

    public void przetworzDane() {
        delta = b * b - 4 * a * c;
        if (delta < 0)
            warunek = 0;
        else if (delta == 0)
            warunek = 1;
        else if(delta>0)
            warunek = 2;

        switch (warunek) {
            case 0:
                System.out.println("Delta mniejsza od zera, brak miejsc zerowych");
                break;
            case 1:
                x0 = -b / 2 * a;
                break;
            case 2:
                x1 = (int) (-b - Math.sqrt(delta) / 2 * a);
                x2 = (int) (-b + Math.sqrt(delta) / 2 * a);
                break;
        }
    }

        public void wyswietlWynik2(){
            switch (warunek){
                case 0:
                    System.out.println("Delta mniejsza od zera, brak miejsc zerowych");
                    break;
                case 1:
                    System.out.println("x0="+x0);
                    break;
                case 2:
                    System.out.println("x1="+x1+" "+"x2="+x2);
                    break;
            }
        }
    }


