package Enums;

public enum Enum1 {
    CAT("fergus"),DOG("fido"),MOUSE("jerry");

    private String name;

     Enum1(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
