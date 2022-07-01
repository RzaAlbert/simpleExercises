import java.util.Scanner;

public class ExercisesPt2 {

    static void Trzy13(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj a");
        int a=sc.nextInt();
        System.out.println("Podaj b");
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            System.out.print(i+"  ");
        }
    }


    static int Trzy7(int a,int b){

        if (a>b){
            return a;
        }
        else{
            return b;
        }



    }


    public static void main(String[] args) {
        System.out.println(Trzy7(Trzy7(1,3),8));
    }
}
