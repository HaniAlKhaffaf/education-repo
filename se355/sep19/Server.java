package sep19;

import java.net.*;
import java.io.*;

public class Server{
    public static void main(String[] args) {
        try{
            System.out.println("Start");

            ServerSocket ss = new ServerSocket(5555);
            while(true) {
            Socket s = ss.accept();
            // the problem with this current code is that there is only one 
            // connection being established, because we have a single socket
            // with this while loop and making the port out of loop, we can still
            // serve one client a time but atleast multiple clients


            // each time we do s.close() we are closing the connection and we cant
            //reach it again, therefore each iteration, the socket is pointing
            // at a different connection
            
            // in the ex below, we will make an inf loop, therefore it will freeze
            // the other users who are waiting to be served, and its solution
            // is moving it to other core using thread

            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            Thread t = new ServerThread(writer);
            // t.run();
            t.start();

            // the method start() by default runs the method run(), therefore you 
            // should rewrite (overwrite) the method run, and when u execute start()
            //it will execute your own version of run();


            // s.close();// we close it so that the new client when he is done, he will
            // be free
            }

        
        }catch(IOException e) {
            System.err.println(e);
        }
    }
}

// practice, imagine having 16 cores machine, if i create 30 threads, can they
// run on these 16 cores of the machine?