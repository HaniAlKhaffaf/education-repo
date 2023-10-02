package sep21;

import java.net.*;
import java.io.*;

public class Server{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10001);

        Socket arr[] = new Socket[4];
        for(int i = 0; i < arr.length; i++) {
            Socket s = ss.accept();
            arr[i] = s;
        }

        for(Socket s: arr) {
            sendMsg(s); 
        }

        // Socket s1 = s.accept();
        // Socket s2 = s.accept();

        // the connections difference will only be different by the src port
        // thats how the data will be sent from one client to another even through
        // the same machine

        // we want to send the msg: Hello from server
       // // String msg = "Hello from Server";
            
       // // OutputStream os1 = s1.getOutputStream();
       // // PrintWriter pw1 = new PrintWriter(os1, true);
       // // pw1.write(msg);
       // // pw1.flush();

        // we get the message after both sockets connect and thats because 
        // we used s1 and s2 accept methods, so it waits first for the 
        // three-way handshake

        // lets make a code for accepting n number of clients in a beautiful way
    

    }

    public static void sendMsg(Socket s) throws Exception{
        String msg = "let the meeting start \n";
        OutputStream os1 = s.getOutputStream();
        PrintWriter pw1 = new PrintWriter(os1, true);
        pw1.write(msg);
        pw1.flush();
        
    }
}
