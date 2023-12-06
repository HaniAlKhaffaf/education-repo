package oct3;

import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(10001); // This will be enought to open the port // representing the port
        // the datagram object doesnt have input or outputstream


        byte[] receivedData = new byte[8];  // 8 becaues AUIS takes 8 bytes
        DatagramPacket packet = new DatagramPacket(receivedData, receivedData.length); // represents a single message (packet) of UDP

        socket.receive(packet);
        
        String word = new String(packet.getData(), 0, packet.getLength());
        // this constructor converts the bytes into string and gives u a string object
        System.out.println(word);


        // Lines below is how to reply to client
        InetAddress adress = packet.getAddress(); // get adress
        int port = packet.getPort(); // get port

        packet = new DatagramPacket(receivedData, port, adress, port);
    }
}
