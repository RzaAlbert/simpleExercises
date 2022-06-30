package wejWyj;

import java.io.*;

public class fReader {
    public static void main(String[] args) {
        File file=new File("test.txt");
        try {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);

            String line;


           while((line=br.readLine())!=null) {
               System.out.println(line);
           }
           br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }


    }
}
