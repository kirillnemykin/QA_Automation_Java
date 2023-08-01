package homework.homework_8;

public abstract class Pet extends Animal {

    private String name;
    private String color;

    public Pet(String kind, String name, String color) {
        super(kind);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
