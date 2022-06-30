package Enums;

public class Enums {



    public static void main(String[] args) {
        Enum1 animal=Enum1.CAT;


        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
        }
        System.out.println(Enum1.CAT);
        System.out.println(Enum1.MOUSE.getName());
        Enum2 rozmiar=Enum2.M;
        System.out.println(rozmiar);
    }
}
