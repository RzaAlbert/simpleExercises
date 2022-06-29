package Geometria;

import java.util.Random;

public class Okrag {
    public int x;
    public int y;
    public int r;



    public Okrag() {
        Random rnd=new Random();

        x= rnd.nextInt(91)+5;
        y= rnd.nextInt(91)+5;
        r= rnd.nextInt(5)+1;

    }



    public static void makeObjectArray(){
        Okrag[] tablica=new Okrag[5];
        for(int i=0;i< tablica.length;i++){
            tablica[i]=new Okrag();
        }

        for(int i=0;i< tablica.length;i++){
            System.out.println("x=" + tablica[i].x +"  "+"y="+ tablica[i].y +"  "+"r="+ tablica[i].r);
        }
    }


}
