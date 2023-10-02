package mar5;

public class Employee {
    private int id;
    public String name;
    private long salary;

    // the benefits of set and get, other than the fact for saftey and 
    // not wanting other to access them, there are 3 benefits
    // 1- so it becomes abstract, so when u change the name, the others dont
    // have to, they can still use the same method, but in reality you 
    // changed the names
    // 2- you can use the get and set for possible future modifications
    // 3- set and get are more testable, you can test these components 
    // easily
    
    // an exception is that you cannot use set and get for arrays

    public Employee(int id) {
        this.id = id;
        // this is instead of set method, we delete set, and make it only init
    }

    public Employee() {
        this.id = 0;
        // this is another constructor for the id, but if we dont want to give our
        // new object an id, then we can use this overloaded constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s; 
    }

    public int getid() {
        return id;
    }
    
    public long getSalary() {
        return salary;
    }

    public void setSalary(long s) {
        if(s >= 0) {
            this.salary = s;
        }
    }


    public void print() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
