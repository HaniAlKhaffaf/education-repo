package oct1;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import sep10.Student;

public class Client{
    public static void main(String[] args) {
        Socket s = new Socket("127.0.0.1", 10000);
        OutputStream os1 = s.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os1, 4096);
        // the size is basically the data structure that we buffer in, once the 
        // buffer is full, we will flush it in one tcp

        for (int i=0; i < 2; i++ ){
            Student s1 = new Student("Maya", "Tahir", 3.5f, 90, 100);
            ObjectOutputStream o = new ObjectInputStream(bos);
            //objectOutputStream default behavious is auto flush
            o.writeObject(s1);
        }

        // the hierarchy is as the following (From High level to low level)
        // DataOS or Object OS -> Buffered OS -> OutputStream -> Socket

        // sometimes the server is faster, and sometimes the client is faster, its
        // always like this, therefore u have to maintain your server or client side


    }
}