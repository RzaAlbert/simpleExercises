package Lambda;

interface Executable{
    void execute();
}

class Runner{
    public void run(Executable e){
        System.out.println("Executing");
        e.execute();
    }

}

public abstract class Lambda implements Executable {

    public static void main(String[] args) {
        Runner runner=new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hello there");
            }
        });
    }
}
