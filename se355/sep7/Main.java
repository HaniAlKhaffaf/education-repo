package sep7;

public class Main{
    public static void main(String[] args) {
        
        /*
         * 
         * What is a class and what is an object recap
         * 
         * 
         * Explaination of methods
         * 
         * local variables are in the method
         * class variables/object variables are declared in the class
         * 
         * 
         * declaration of an object 
         * 
         *  Student s1 = new Student();
         *    (1)              (2)
         *  
         *  2 is executed first
         * 
         *  JVM will analyze (2) if the class exists or not
         * 
         *  then it will take all of hte variables and then asks the OS
         *  to alocate memory space for these variables
         *  The objects memory depends on the variables inside the object
         *  Then the OS will give back the JVM the first adress that is 
         *  allocated for that specific object
         *  Now Step (2) Is done
         * 
         *  Now (1)
         * 
         *  JVM will create a variable that is called S1
         *  the variable instead of holding a value, it will hold an adress
         *  that is allocating that object in the memory
         * 
         *  Keyword "new" means memory allocation
         *  S1 is just a pointed to the adress in that memory
         * 
         *  then we can use that pointer to modify the memory adress
         *  like s1.id = 10
         * 
         *  if we use something like
         *  Student s2 = new Student();
         *  then we are creating a new object at a new location inside
         *  the memory
         * 
         *  s1.id = 10
         *  s2.id = s1.id
         *  
         *  s1.id = s1.id + 10
         *  System.out.pring(s2.id);
         * 
         *  the result is 10;
         * 
         *  _______________
         * 
         *  Student s1 = new Studnet();
         *  Student s2 = s1
         * 
         *  now s2 is not pointing at the pointer but rather directly to
         *  the same location, so even if s1 changes later, s2 will still
         *  point at the same location it was initially pointing at when
         *  created
         * 
         *  Each object has its method the way it express it using its own 
         *  variables
         *  
         *  like this:
         *  s1.print();
         *  s2.print(); 
         * 
         *  they will print two different values
         *  
         *  static methods can only use static variables
         *  
         *  
         *  
         * 
         */


        Student s1 = new Student();
        s1.id =10;
        s1.gpa = 2.9f;


        Student s2 = new Student();
        s2.id =12;
        s2.gpa = 2.3f;

        Dept d = new Dept();
        d.name = "IT";

        s1.dept = d;
        s2.dept = d;

        s1.dept.name = "IT/SE"; // we used this to change the name of the whole
        // department because the pointers both point at d, the same object
        System.out.println(d.name);




    }
}