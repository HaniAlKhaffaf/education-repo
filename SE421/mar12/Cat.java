package mar12;

public class Cat extends Animal {
    private String color;

    public Cat(String n) {
        setName(n);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
