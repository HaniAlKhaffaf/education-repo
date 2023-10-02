package mar9;

public class Cat {
    private String name;

    /*  public */ private Cat(String n) {
        this.name = n;
        // this is a constructor, if we change the public to private, then
        // no one can actaully make an object of class cat because java will
        // no longer create a default constructor because we already made one,
        // and at the same time is it private, so other classes cant make an 
        // object of it, only this class can

        // after we changed it to private, the only way we can create outside of
        // the class is through creating a new method called createInstance
    }

    public static Cat createInstance(String name) {
        return new Cat("mochi");
    }

    public String getName() {
        return name;
    }
}
