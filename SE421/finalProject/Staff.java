package finalProject;

public class Staff implements HasId{
    
    private HasId p;

    public Staff(){
        p = new Person();
    }

    public Staff(HasId st){ // more like setObject
        p = st;
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
