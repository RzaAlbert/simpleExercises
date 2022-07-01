package Interfaces;

public class InnerClasses {

    public void makeVoice(){
        System.out.println("Hello");
    }

    public void eat(){
        System.out.println("Eating");
    }
    public static void main(String[] args) {
        //anonimowa klasa wewnetrzna
        InnerClasses inner=new InnerClasses(){
            @Override
            public void makeVoice() {
                System.out.println("Witam");
            }

            @Override
            public void eat(){
                super.eat();
            }
        };

        inner.makeVoice();
        inner.eat();


    }
}
