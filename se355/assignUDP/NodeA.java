package assignUDP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class NodeA {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a file path: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        InetAddress[] receivers = {
            InetAddress.getByName("localhost"),
            InetAddress.getByName("localhost"),
            InetAddress.getByName("localhost")
        };
        int[] ports = { 20001, 20002, 20003 };

        DatagramSocket socket = new DatagramSocket();

        BufferedInputStream bisFile = new BufferedInputStream(new FileInputStream(path), 1024);

        byte[] buffer = new byte[1024];
        int bufferSize = 1024;
        int bytesRead;
        int counter = 0;

        while ((bytesRead = bisFile.read(buffer, 0, bufferSize)) != -1) {
            DatagramPacket packet = new DatagramPacket(buffer, bytesRead, receivers[counter % 3], ports[counter % 3]);
            socket.send(packet);
            Thread.sleep(100);
            counter++;
        }

        System.out.println("Data was read, and sent to Servers");

        bisFile.close();

        System.out.println("Do you want to collect the data again?: (Yes/No)");
        String usrInput = input.nextLine();

        if (usrInput.equalsIgnoreCase("yes")) {
            byte[] bufferNet = new byte[1024];
            int bufferSizeNet = 1024;
            int bytesReadNet;
            int i = 0;

            for (int port : ports) {
                socket = new DatagramSocket(port);

                BufferedOutputStream bosFile = new BufferedOutputStream(new FileOutputStream("/Users/mrnsj26/Desktop/pathOut.jpeg"), 1024);

                do {
                    DatagramPacket receivePacket = new DatagramPacket(bufferNet, bufferSizeNet);
                    socket.receive(receivePacket);
                    bytesReadNet = receivePacket.getLength();

                    if (bytesReadNet != -1) {
                        bosFile.write(bufferNet, 0, bytesReadNet);
                        Thread.sleep(100);
                    }

                } while (bytesReadNet != -1);

                bosFile.close();
            }
        } else {
            System.out.println("Have a great day!");
        }
    }
}
