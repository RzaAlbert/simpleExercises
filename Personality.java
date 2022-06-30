public class Personality {
    private String name;

    public Personality(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "name='" + name + '\'' +
                '}';
    }
}
