public class zadanie_5_3 {


    static void czytajDane(double[][]macierz,int rozmiar){
        for(int row=0;row<macierz.length;row++){
            for(int col=0;col<macierz[row].length;col++){
                if(row==col)
                    macierz[row][col]=row;
                else
                    macierz[row][col]=0;
            }
        }

    }

    static void przetworzDane(double[][]macierz,int rozmiar){
        int suma=0;
        for(int row=0;row<macierz.length;row++){
            for(int col=0;col<macierz[row].length;col++){
                if(row==col)
                    suma+=macierz[row][col];
            }
        }
        System.out.println("Suma="+suma);
    }


    static void wyswietlWynik(double[][]macierz,int rozmiar){
        for(int row=0;row<macierz.length;row++){
            for(int col=0;col<macierz[row].length;col++){
                System.out.print(macierz[row][col]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int rozmiar = 10;
        double [][] macierz = new double [rozmiar][rozmiar];

        zadanie_5_3.czytajDane(macierz,10);
        zadanie_5_3.przetworzDane(macierz,10);
        zadanie_5_3.wyswietlWynik(macierz,10);


    }
}
