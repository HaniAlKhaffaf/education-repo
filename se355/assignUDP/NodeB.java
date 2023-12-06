package assignUDP;

import java.io.*;
import java.net.*;

public class NodeB {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(20001);
        System.out.println("Waiting for connection");

        byte[] buffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        serverSocket.receive(receivePacket);

        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();

        BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(receivePacket.getData()), 1024);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int bytesRead;
        while ((bytesRead = bis.read(buffer, 0, buffer.length)) != -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
            Thread.sleep(100);
        }

        System.out.println("Data was successfully received");

        Thread.sleep(5000);
        DatagramSocket forwardSocket = new DatagramSocket();
        byte[] sendData = byteArrayOutputStream.toByteArray();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

        forwardSocket.send(sendPacket);

        System.out.println("Data forwarded to NodeA");
    }
}
