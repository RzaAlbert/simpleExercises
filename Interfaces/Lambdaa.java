package Interfaces;

public class Lambdaa {
    public static void main(String[] args) {
        Function fun= (a,b) -> a+b;
        System.out.println(fun.calculate(2,5));

        Function1 fun1=(s) -> s;
        System.out.println(fun1.show("Albinos"));

        Function2 fun2=() -> {for(int i=0;i<10;i++) System.out.println(i);
            return 0;
        };
        System.out.println(fun2.iteration());
        }









    }



