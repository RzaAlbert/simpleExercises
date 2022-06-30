import java.util.Objects;

public class dotEquals {
    private int id;
    private String name;

    public dotEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dotEquals person = (dotEquals) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        dotEquals person1 = new dotEquals(5,"Bob");
        dotEquals person2=new dotEquals(5,"Sue");



        System.out.println(person1.equals(person2));
    }
}
