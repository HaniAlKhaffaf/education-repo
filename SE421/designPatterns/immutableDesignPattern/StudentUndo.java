package designPatterns.immutableDesignPattern;

final public class StudentUndo {
    private final int id;
    private final String name;
    private final float gpa;
    private final Student old;

    public Student(){

    }
    // if we can change one variable then the class is not longer immutable
    public Student(int id, String name, float gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Student(int id, String name, float gpa, Student old){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.old = old;
    }

    public String getName() {
        return this.name;
    }

    public float getGpa() {
        return this.gpa;
    }

    public int getId() {
        return this.id;
    }
    

    public Student setName (String name) {
        return new Student(id, name, gpa, this);
    }

    public Student setid (int id) {
        return new Student(id, name, gpa, this);
    }

    public Student setGPA (Float gpa) {
        return new Student(id, name, gpa, this);
    }

    public Student undo() {
        return old;
    }
}

