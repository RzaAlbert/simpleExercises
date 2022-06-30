package wejWyj;

import java.io.*;

public class bfWriter {
    public static void main(String[] args) {
        File file=new File("plik.txt");
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            bw.write("This is line 1");
            bw.write("This is line 2");
            bw.newLine();
            bw.write("This is line 3");

        }  catch (IOException e) {
            System.out.println("Unable to read file");
        }


    }
}
