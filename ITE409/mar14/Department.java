package mar14;
import java.io.Serializable;

public class Department implements Serializable {
    public String name;
    public String managerName;

    // we created this Class to show that when we pass it to Student,
    // and we store file of class student, then it will also save our department
    // objects used in student, so its a complex data type, that is if this class
    // (the Department) is Serializable. if this isnt Serializble, then java
    // will store all of the data in Student class except for the Department, becuase
    // it is not Serializable, but rn in our case, it is Serializable, therefore
    // when we save the students data, it will save complex data types within including
    // Department
}
