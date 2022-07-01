package Interfaces;

public interface Person {
    void showName();
    void showAge();
    void showSalary();
    default void show(){
        System.out.println("Witam");
    }




}
