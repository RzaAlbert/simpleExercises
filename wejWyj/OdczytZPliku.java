package wejWyj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytZPliku {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("plik.txt");
        boolean exists=file.exists();
        System.out.println("Czy istnieje "+exists);

        System.out.println(file.getAbsolutePath());

        Scanner scn=new Scanner(file);
        while(scn.hasNext()) {
            System.out.println(scn.nextLine());
        }


    }
}
