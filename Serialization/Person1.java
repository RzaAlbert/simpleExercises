package Serialization;

import java.io.Serializable;

public class Person1 implements Serializable {
    private transient int id;
    private String name;
    private static int count;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "} count is" +count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person1.count = count;
    }
}
