package mar7;

public class Faculty extends Person{
    
    // the commented out code is due to inheritence and we dont need it anymore

    private int id;
    private String officeloaction;
    // private String name;

    // public void setName(String n) {
    //     this.name = name;
    // }

    // public String getName() {
    //     return name;
    // }


    @Override
    public void setName(String n) {
       // this is going for overriding, it will overshadow the main implementation
       System.out.println(n);
       n = "Mr. " + n;
       super.setName(n); 
       // understand super better later on, it is used for overriding
       // super is like (the parent)
    }


}
