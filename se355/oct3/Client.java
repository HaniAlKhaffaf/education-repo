package oct3;

import java.net.*;
import java.io.*;

// we will try to implement UDP instead of TCP
// what is the difference, TCP is more reliabe due the acknowledgment
// UDP doesnt have that, it is a one time ticket
// UDP is good because its fast, but not reliable

public class Client {
    public static void main(String[] args) throws Exception{
       DatagramSocket socket = new DatagramSocket(); 
       // in UDP you cant have the model of client and server, they both use DatagramSocket

       String sendString = "AUIS";
       byte[] sendData = sendString.getBytes("UTF-8");
       

       InetAddress address = InetAddress.getByName("127.0.0.1");
       DatagramPacket packet = new DatagramPacket(sendData, sendData.length, address, 10001);
       // DatagramPacket always represents one message that is either going to a server or client

       socket.send(packet);
    }
}
