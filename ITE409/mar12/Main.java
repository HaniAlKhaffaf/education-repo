package mar12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

    // in this class we will talk about how we take an object and store it inside
    // an actual file, and also how to read it.
    public static void main(String[] args)  throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Department d1 = new Department();
        d1.name = "IT/SE";
        d1.managerName = "Prof. Alan";

        Student s1 = new Student(1, "Maya");
        s1.id = 2;

        File file = new File("/Users/hani/Development/education/ITE409/mar12/");
        FileOutputStream fs = new FileOutputStream(file);

        // FileOutPutStream is basically a class that shows that we are taking our data
        // and moving it to our system, so from the flow is from our application to
        // our system

        // to change our data into bytes, so our system can store them, we will use a 
        // different class called ObjectOutputStream

        ObjectOutputStream oos = new ObjectOutputStream(fs);
        oos.writeObject(s1);
        oos.close();

        // WriteObject is a method of class ObjectOutPutStream class which allows us
        // to convert our data into our System
        // writeObject changes the data into binary

        // our ultimate goal out of this long proccess is to ultimately use the
        // method writeObject() because we need to convert the data into binary
        // so our system can store it, but it only belongs to class
        // ObjectOutputStream, and that class has a constructor that only accepts 
        // an outputStream thats why our file should pass through 3 different classes

        File file2 = new File("/Users/hani/Development/education/ITE409/mar12/auis.txt");
        FileInputStream fis = new FileInputStream(file2);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student o = (Student) ois.readObject();

        // we wrote the class above to change the data back to our application and read it



    }
}
