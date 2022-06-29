import java.util.*;

public class Zadania {
    static void zadanie_1_1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj bok a:");
        double a=sc.nextDouble();
        System.out.println("Podaj bok b:");
        double b=sc.nextDouble();
        double pole=a*b;
        System.out.println("Pole="+pole);
    }

    static void zadanie_1_4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj r:");
        double r=sc.nextDouble();
        double v=r*r*r*4*Math.PI/3;
        System.out.println("Objetosc="+v);

    }

    static void zadanie_1_5(){
        int a=37,b=11,iloraz=a/b;

        System.out.println("Iloraz ="+iloraz);
    }

    static void zadanie_1_6(){
        int a=37,b=11,iloraz=a%b;

        System.out.println("Iloraz ="+iloraz);
    }

    static void zadanie_2_1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj bok a");
        int a=sc.nextInt();
        System.out.println("Podaj bok b");
        int b=sc.nextInt();
        System.out.println("Podaj bok c");
        int c=sc.nextInt();

        if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a)
            System.out.println("Prostokatny");
        else
            System.out.println("Nieprostokatny");
    }

    static void zadanie_2_2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj a");
        int a=sc.nextInt();
        System.out.println("Podaj  b");
        int b=sc.nextInt();
        System.out.println("Podaj  c");
        int c=sc.nextInt();

        if((b*b-4*a*c)<0)
            System.out.println("Nie ma rozwiazan");
        else if((b*b-4*a*c)==0)
            System.out.println("X="+(-b/2*a));
        else if((b*b-4*a*c)>0)
            System.out.println("X1="+((-b-Math.sqrt(b*b-4*a*c))/2*a));
            System.out.println("X2="+((-b+Math.sqrt(b*b-4*a*c))/2*a));
    }

    static void zadanie_2_3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj a");
        int a=sc.nextInt();
        System.out.println("Podaj  b");
        int b=sc.nextInt();
        System.out.println("Podaj  c");
        int c=sc.nextInt();
        int delta=b*b-4*a*c;
        int liczba_pierwiastkow = 0;
        if (delta < 0)
            liczba_pierwiastkow = 0;
        if (delta == 0)
            liczba_pierwiastkow = 1;
        if (delta > 0)
            liczba_pierwiastkow = 2;

        switch (liczba_pierwiastkow){
            case 0:
                System.out.println("Nie ma rozwiazan");
                break;
            case 1:
                System.out.println("X="+(-b/2*a));
                break;
            case 2:
                System.out.println("X1="+((-b-Math.sqrt(b*b-4*a*c))/2*a));
                System.out.println("X2="+((-b+Math.sqrt(b*b-4*a*c))/2*a));

        }
    }

    static void zadanie_2_5(){
        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);

        int a=rnd.nextInt(9)+1;
        System.out.println("Podaj liczbe:");
        int b=sc.nextInt();

        if(a==b)
            System.out.println("Trafiles");
        else
            System.out.println("Nie trafiles");
        System.out.println("a:"+a +" "+"b:"+b);
    }

    static void zadanie_3_1(){
        for(int i=0;i<11;i++){

            System.out.println(3*i);
        }

    }

    static void zadanie_3_3(){
        int x=0;
        while(x<11){
            System.out.println(3*x);
            x++;
        }

    }

    static void zadanie_3_4(){
        for(int i=1;i<21;i++){
            System.out.println(i);
        }
    }

    static void zadanie_3_7(){
        int suma=0;
        for(int i=1;i<101;i++){
            suma+=i;
        }
        System.out.println("Suma="+suma);
    }

    static void zadanie_3_10(){
        int suma=0;
        for(int i=1;i<101;i++){
            if(i%2==1)
                suma+=i;

        }
        System.out.println("Suma="+suma);
    }


    static void zadanie_3_16(){
        int iloscLiczb=10;
        int max=0,liczba;


        Random rn=new Random();
        int min= rn.nextInt(99);

        for(int i=0;i<iloscLiczb;i++){
            liczba=rn.nextInt(99);
            System.out.println("Wylosowana liczba nr "+i+" to "+liczba);
            if(liczba>max)
                max=liczba;
            if(liczba<min)
                min=liczba;
        }

        System.out.println("Max:"+max+" Min:"+min);
    }


    static void zadanie_3_19(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j+ "   ");
            }
            System.out.println();
        }
    }

    static void zadanie_3_22(){
        char znak,znak1;

        for(znak='A';znak<='Z';znak++){
            System.out.print(znak);
        }

        System.out.println();

        for(znak1='Z';znak>='A';znak--){
            System.out.print(znak);
        }


    }


    static void zadanie_4_1(){
        int[] tab=new int[10];
        for(int i=0;i<=9;i++){
            tab[i]=i;
        }
        for(int i=0;i<=9;i++){
            System.out.println(tab[i]);
        }

    }

    static void zadanie_4_2(){
        int[] tab=new int[10];
        for(int i=0;i<=9;i++){
            tab[i]= tab.length-i;
        }
        for(int i=0;i<=9;i++){
            System.out.println(tab[i]);
        }

    }

    static void zadanie_4_3(){
        int[][] tab=new int[10][10];
        int suma=0;

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                tab[row][col] = 0;
                if(row==col)
                    tab[row][col] = 1;
                    suma+=tab[row][col];
            }
        }

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                System.out.print(tab[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Suma na przekatnej="+suma);
    }


    static void zadanie_4_4(){
        int[][] tab=new int[10][10];
        int suma=0;

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                tab[row][col] = 0;
                if(row==col)
                    tab[row][col] = row;
                suma+=tab[row][col];
            }
        }

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                System.out.print(tab[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Suma na przekatnej="+suma);
    }




    static void zadanie_4_5(){
        int[][] tab=new int[10][10];
        int suma=0;

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                tab[row][col] = 0;
                if(col==tab.length-row-1) {
                    tab[row][col] = 1;
                    suma += tab[row][col];
                }
            }
        }

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                System.out.print(tab[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Suma na przekatnej="+suma);
    }

    static void zadanie_4_6(){
            int[][] tab=new int[10][10];
        int suma=0;

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                tab[row][col] = 0;
                if(col==tab.length-row-1) {
                    tab[row][col] = row;
                    suma += tab[row][col];
                }
            }
        }

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                System.out.print(tab[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Suma na przekatnej="+suma);
    }


    static void zadanie_4_7(){
        int[][] tab=new int[10][10];
        int suma1=0;
        int suma2=0;

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                tab[row][col] = 0;
                if(col==0) {
                    tab[row][col]=row;
                    suma1 += tab[row][col];
                }
                else if(col==1) {
                    tab[row][col]=row*row;
                    suma2 += tab[row][col];
                }
            }
        }

        for(int row=0;row<tab.length;row++){
            for(int col=0;col<tab[row].length;col++) {
                System.out.print(tab[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println("Suma1="+suma1 + "a Suma2="+suma2);
    }


    static void zadanie_4_8(){
        int[][] tabA=new int[10][10];
        int[][] tabB=new int[10][10];

        for(int row=0;row<tabA.length;row++){
            for(int col=0;col<tabA[row].length;col++) {
               tabA[row][col]=col;
            }
        }

        for(int row=0;row<tabA.length;row++){
            for(int col=0;col<tabA[row].length;col++) {
                System.out.print(tabA[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for(int row=0;row<tabB.length;row++){
            for(int col=0;col<tabB[row].length;col++) {
                tabB[row][col]=tabA[col][row];
            }
        }

        for(int row=0;row<tabB.length;row++){
            for(int col=0;col<tabB[row].length;col++) {
                System.out.print(tabB[row][col]+" ");
            }
            System.out.println();
        }




    }

    static void eksperymenty(){
        //int[] tab=new int[10];
        //for (int element:tab) {
        //    element=4;
        //}

        //int[] tab1= Arrays.copyOf(tab,tab.length);

       // for(int element:tab1){
       //     System.out.println(element);
       // }


       int[] tabA= {4, 2, 5, 3, 8, 10, 1, 3, 6, 13};
        Arrays.sort(tabA);
        for (int element:tabA) {
            System.out.println(element);
        }

        System.out.println(Arrays.binarySearch(tabA,8));
    }

    static int  silnia(int n){
        int iloczyn=1;

        if(n==0 || n==1)
            return 1;
        else
            iloczyn=n*silnia(n-1);
        return iloczyn;

    }

    public static void main(String[] args) {
        System.out.println("Jaka silnie chcesz obliczyc?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(silnia(n));

    }
}
