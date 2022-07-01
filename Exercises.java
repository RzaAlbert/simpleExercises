import java.util.Objects;

public class Exercises {
    private int id;
    private String name;

    public Exercises() {
    }

    @Override
    public String toString() {
        return "Exercises{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercises exercises = (Exercises) o;
        return id == exercises.id && Objects.equals(name, exercises.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Exercises ex=new Exercises();

        System.out.println( ex.hashCode());
        var tab=new int[10];
        for(int el:tab)
            System.out.println(el);


        int a=10;
        String s="20";

       String tekst=Integer.toString(a);
        System.out.println(tekst);


        int x=Integer.parseInt(s);
        System.out.println(x);

        System.out.println(tekst.getClass());


    }
}
