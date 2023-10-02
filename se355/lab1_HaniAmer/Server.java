package lab1_HaniAmer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

        public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(7070);  
        Socket s = ss.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String recMSG = bufferedReader.readLine();

        if (recMSG == "Pong") {
            sendMsg(s);
        }
    }

        public static void sendMsg(Socket s) throws Exception{
        String msg = "Pong";
        OutputStream os1 = s.getOutputStream();
        PrintWriter pw1 = new PrintWriter(os1, true);
        pw1.write(msg);
        pw1.flush();
        
    }
}