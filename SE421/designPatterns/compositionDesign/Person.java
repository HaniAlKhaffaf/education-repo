package designPatterns.compositionDesign;

public class Person implements HasName {

    private String name;

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
