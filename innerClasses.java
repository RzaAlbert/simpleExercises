import java.awt.*;

public class innerClasses {
    private int id;

    private class Brain{
        public void think(){
            System.out.println("Robot "+id+" is thinking");

        }
    }

    static class Battery{
        public void charge(){
            System.out.println("Battery charging");
        }
    }

    public innerClasses(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot "+id);
        Brain brain=new Brain();
        brain.think();
        Battery battery=new Battery();
        battery.charge();
    }

    public static void main(String[] args) {
        innerClasses robot=new innerClasses(1);
        robot.start();





    }
}
