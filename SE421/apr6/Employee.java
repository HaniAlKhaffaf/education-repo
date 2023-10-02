package apr6;

public class Employee {
    private int id;
    private String name;
    private String adress;

    // public Employee(int id) {

    // }

    public void setName(String s) {
        this.name = s; 
    }

    public void setId(int i) {
        this.id = i; 
    }

    public void setAdress(String a) {
        this.name = a; 
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            return check(e);
        }
        return super.equals(obj);
    }

    /*
     *  
     * this application of comparison can only work with objects of the same class
     * if the comparison happens between a son and a father class, then it
     * only compares what it has
     * 
     */

       private boolean check(/*Employee arg1*/ Employee arg2) {
        boolean result = false;

        // result = arg1 == arg2;

        result = this.getId() == arg2.getId() 
        && this.getName().equals(arg2.getName()) 
        && this.getAdress().equals(arg2.getAdress());

        // complexity is that whe nwe add attribute we will have to change 
        // the complex code above

        return result;
    }

}
