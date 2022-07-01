package Interfaces;

public class InnerClass2 {
    public void makeVoice(){
        System.out.println("Hello");
    }

    public void eat(){
        System.out.println("Eating");
    }

    class Pet{
        String name;

        public String getName() {
            makeVoice();
            return name;
        }


    }
}
