package designPatterns.compositionDesign;

public class Faculty implements HasName {

    private HasName p;

    public Faculty(){
        p = new Person();
    }

    public Faculty(HasName h){ // more like setObject
        p = h;
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
