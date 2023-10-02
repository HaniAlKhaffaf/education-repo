package mar7And9;
import java.io.File;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("/Users/hani/Development/education/ITE409/mar7/auis.txt");

        Scanner s = new Scanner(file);
        // each next gives one word only
        // for (int i=0; i < 100; i++) {
        //     System.out.println(s.next());
        // } // if we use for we will get error coz once everything is printed
        //   // then we will get an error

        while(s.hasNextLine()) {
            String str = s.nextLine();
            // System.out.println(s.nextLine());
            System.out.println(str.toUpperCase());
        }
        // using a while loop is better

        // you can use next() for one text, but nextLine() will give you the
        // the whole line.

        s.close();
        // close is very essential, closes the file after we opened it

        // to reopen the file, we have to create a new variable and open it
        // like ->
        // File file = new File("/Users/hani/Development/education/ITE409/mar7/auis.txt");
        // when reopened, the file will start reading from top again
        
        
        // different way to read the data 


        // also get the same file 

        // File file = new File("mar7/auis.txt"); // commented coz already done above
        FileReader fr = new FileReader(file);
        int value = 0;
        while ((value = fr.read()) != -1) {
            System.out.println((char) value);
        }

        // if you want to return back to the beginning in a file, we can use the
        // fr.reset(); method


        // Scanner is usually for primitive data type and non-complex files, for such
        // files in which you need to read byte by byte, using Reader will be a 
        // good choice

        // int c1 = fr.read();
        // int c2 = fr.read();

        // char cc1 = (char) c1;
        // char cc2 = (char) c2;

        // System.out.println(cc1);
        // System.out.println(cc2);

    }
}
