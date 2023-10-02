package designPatterns.compositionDesign;

public class Student implements HasName{

    private Person p;

    public Student(){
        p = new Person();
    }

    @Override
    public void setName(String n) {
        p.setName(n);
    }

    @Override
    public String getName() {
        return p.getName();
    }
    
}
