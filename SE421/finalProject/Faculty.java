package finalProject;

public class Faculty implements HasId {

    private HasId p;

    public Faculty(){
        p = new Person();
    }

    public Faculty(HasId f){ // more like setObject
        p = f;
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
