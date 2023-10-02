package mar9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("/Users/hani/Development/education/ITE409/mar9/auis.txt");

        FileWriter fw = new FileWriter(file);
        // the FileWrite will bascially write data in a file, but it will delete
        // the old data because the pointer starts from the beginning
        // the FileWriter class has a method called write() which will allow
        // you to write data
        // you can use FileWrite(fw, true), which will let you write in a file
        // without deleting the previous data in the file.

        String str = "AUIS";

        for(int i=0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            fw.write(str.charAt(i));
        }
        fw.write('\n');
        for(int i=0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            fw.write(str.charAt(i));
        }

        fw.flush();
        fw.close();

        // There is something called Buffer, which stores data, once full, it will 
        // send the executions to the OS and then to the Drives, a way of sending
        // data immediatyl instead of waiting in buffer, we can use flush() or
        // close() which will move the data directly to the Drive.

        // there are two tradeoffs for flushing ->
        // 1- Data consistency
        // 2- Lifetime of the drive
    }
}
