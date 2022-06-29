package Abstract;

public abstract class Machine {
    abstract void getEngine();

    public static void main(String[] args) {
        Camera cam=new Camera();
        Car car=new Car();
        Machine machine=new Machine() {
            @Override
            void getEngine() {
                System.out.println("Im machine");
            }
        };

        cam.getEngine();
        car.getEngine();
        machine.getEngine();

        Machine car1=new Car();
        car1.getEngine();

        
    }
}
