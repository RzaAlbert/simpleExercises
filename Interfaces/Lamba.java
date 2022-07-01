package Interfaces;

import java.util.ArrayList;

public class Lamba implements Person{
    @Override
    public void showName() {

    }

    @Override
    public void showAge() {

    }

    @Override
    public void showSalary() {

    }

    public void sss(ArrayList<String> list){
        for(String el:list){
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        var list=new ArrayList<String>();
        list.add("Albert");
        list.add("Marek");
        list.add("Kamil");
        list.add("Karol");





    }

}
