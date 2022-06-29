package wejWyj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZapisDoPliku {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("plik2.txt");

        PrintWriter zapis =new PrintWriter(file);

        zapis.println("To jest zapisana linia");
        zapis.close();
    }
}
