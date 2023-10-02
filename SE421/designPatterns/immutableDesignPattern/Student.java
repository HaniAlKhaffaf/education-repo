package designPatterns.immutableDesignPattern;

final public class Student {
    private final int id;
    private final String name;
    private final float gpa;

    public Student(){
        
    }
    // if we can change one variable then the class is not longer immutable
    public Student(int id, String name, float gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
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
    
    // we commented the set methods to make it immutable as in first step

    public Student setName (String i) {
        Student result = new Student(this.getId(), i, this.getGpa());
        return result;
    }

    public Student setid (int id) {
        Student result = new Student(id, this.getName(), this.getGpa());
        return result;
    }

    public Student setGPA (Float gpa) {
        Student result = new Student(this.getId(), this.getName(), gpa);
        return result;
    }
}
