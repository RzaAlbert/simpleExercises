import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws InputMismatchException,ArithmeticException,FileNotFoundException{
        File file =new File("test.txt");
        try {
            FileReader fr=new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int a=5;
        int b=5;

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Dzielenie przez 0");
        }

        int c=5;
        Scanner sc=new Scanner(System.in);
       int d=sc.nextInt();

        try{
            System.out.println(c*d);
        }catch (InputMismatchException e){
            System.out.println("Znak");
        }



    }
}
