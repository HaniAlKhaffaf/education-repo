package sep28;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(7123);
        Socket s = ss.accept();

        InputStream in = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(in);
        Object cl = ois.readObject();
        if (cl instanceof Client1) {
            Client1 c = (Client1) cl;
            System.out.println("welcome" + c.fname + c.lname);
        }
        
        
    }
}