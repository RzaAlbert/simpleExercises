public class Recursion {

    private static void calculate(int value){
        System.out.println(value);

        if(value==1)
            return;
        else
            calculate(value - 1);

    }
    private static int silnia(int n){
        int iloczyn=1;
        if(n==0|| n==1)
            return 1;
        else {
            iloczyn=n*silnia(n-1);
        }
        return iloczyn;
    }

    public static void main(String[] args) {
        int value=4;
       calculate(value);
        System.out.println(silnia(5));

    }
}
