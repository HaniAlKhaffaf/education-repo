package finalProject;

public class Student implements HasId{

    private HasId p;

    
    public Student(){
        p = new Person();
    }

    public Student(HasId s){ // more like setObject
        p = s;
    }

    @Override
    public void setId(int id) {
        p.setId(id);
    }

    @Override
    public int getId() {
        return p.getId();
    }
    
}
