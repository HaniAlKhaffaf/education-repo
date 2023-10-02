package sep17;
import java.net.*;
import java.io.*;

public class Server{
    public static void main(String[] args) {
        try{
            System.out.println("Start");
            ServerSocket ss = new ServerSocket(5555);
            Socket s = ss.accept();
            // So the server needs something like the line above so it can receive 
            // requests that are forwarding for port5555
            // the ss.accept() basically means it will wait for a client who performs
            // the three-way handshake so it can connect with it
            // the application will only handle one client rn, if we want to handle
            // multiple clients, then we can create something like:
            // while(true) {
            //    Socket s = ss.accept();
            //}
            // for the same machine to be a client and a server then we have
            // to set the dstIP as our localhost and the dstPort is the same which
            // is 5555 in this case
            // you cant relaunch the same applications, because the same port cant listen
            // to different classes, you cannot have same port listening to two different
            // applications
            // you cannot listen to ports below 1000 because there are many listenings
            // to ports below 1000 
            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            while(true) {
                writer.print("This is hello from server \n\n");
                writer.flush();
            }

            // This will write an infinite loop in which the server will send the 
            // client the message

            // System.out.println("End");
        }catch(IOException e) {
            System.err.println(e);
        }
    }
}