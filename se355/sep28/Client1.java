package sep28;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1{

    String fname;
    String lname;
    String mnumber;

    public Client1(String fname, String lname, String mnumber){
        this.fname = fname;
        this.lname = lname;
        this.mnumber = mnumber;
    }
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 7123);
        OutputStream os1 = s.getOutputStream();

        Client1 c1 = new Client1("Hani", "Amer","07705490144");

        ObjectOutputStream o = new ObjectOutputStream(os1);
        o.writeObject(c1);
    }
}