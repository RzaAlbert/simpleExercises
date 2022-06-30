public class PassingByValue {

    public void show(int value){
        System.out.println("2.Value is "+value);
        value=8;
        System.out.println("3.Value is "+value);
    }

    public void show(Personality person){
        System.out.println("2.Person is "+person);
        person=new Personality("Mike");
        System.out.println("3.Person is "+person);
    }

    public static void main(String[] args) {
        PassingByValue pass=new PassingByValue();
         int value=7;
        System.out.println("1.Value is "+value);
        pass.show(value);
        System.out.println("4.Value is "+value);

        Personality person=new Personality("Bob");
        System.out.println("1.Person is "+person);
        pass.show(person);
        System.out.println("4.Person is "+person);
    }
}
