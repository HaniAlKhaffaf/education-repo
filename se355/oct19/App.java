package oct19;

import java.io.*;
import org.zeromq.*;

public class App {
    public static void main(String[] args) throws Exception {
        try (ZContext context = new ZContext()) {
            ZMQ.Socket s = context.createSOcket(SocketType.REP);
            // IP 192.168.1.15
            // IP 127.0.0.1
            s.bind("tcp://*:5555");
            // The arguemnt is Prototype://The IP you are receiving from: The port number
            // the * we used, basically means from any IP

            // to receive data
            byte[] arr = s.recv(0);
            System.out.println(new String(arr, ZMQ.CHARSET));

            // to send data
            String msg = "auis";
            s.send(msg.getBytes(ZMQ.CHARSET), 0);

        }
    }
}
