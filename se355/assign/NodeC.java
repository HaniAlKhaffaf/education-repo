package assign;

import java.io.*;
import java.net.*;
import java.util.*;

public class NodeC {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10002);
        System.out.println("waiting for connection");
        Socket s = ss.accept();

        ArrayDeque<byte[]> aq = new ArrayDeque<>();

        int bytesRead;
        byte[] buffer = new byte[1024];

        BufferedInputStream bis = new BufferedInputStream(s.getInputStream(), 1024);

        while((bytesRead = bis.read(buffer,0, 1024)) != -1){
            System.out.println("reading data in the loop");
            aq.addFirst(buffer.clone());
            Thread.sleep(100);
        }
        System.out.println("Data was successfully recived");

        Socket ForwardSocket = ss.accept();
        System.out.println("Connection was established again");

        BufferedOutputStream bos = new BufferedOutputStream(ForwardSocket.getOutputStream(), 1024);

        
        System.out.println("Starting the data forwarding");
        while(!aq.isEmpty()) {
            System.out.println("Sednign the data to A in the loop");
            bos.write(aq.getLast(), 0, aq.getLast().length);
            aq.removeLast();
            bos.flush();
            Thread.sleep(100);
        }
        System.out.println("End");

    }
}