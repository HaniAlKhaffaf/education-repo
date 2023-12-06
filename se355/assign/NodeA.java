//Noor Safaa Wadeea - ns20352
// Hani Amer Salih - ha20431

package assign;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class NodeA {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a file path: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        int[] recivers = { 10001, 10002, 10003 };
        Socket[] arr = new Socket[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Socket("localhost", recivers[i]);
        }

        BufferedInputStream bisFile = new BufferedInputStream(new FileInputStream(path), 1024);

        byte[] buffer = new byte[1024];
        int bufferSize = 1024;
        int bytesRead;
        int counter = 0;

        while ((bytesRead = bisFile.read(buffer, 0, bufferSize)) != -1) {
            BufferedOutputStream bos = new BufferedOutputStream(arr[counter % 3].getOutputStream(), 1024);
            System.out.println(bytesRead);
            bos.write(buffer, 0, bytesRead);
            Thread.sleep(100);
            counter++;
        }

        System.out.println("Data was read, and sent to Servers");

        bisFile.close();

        for (int i = 0; i < arr.length; i++) {
            arr[i].close();
        }

        System.out.println("Do you want to collect the data again?: (Yes/No)");
        String usrInput = input.nextLine();

        if (usrInput.equalsIgnoreCase("yes")) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Socket("localhost", recivers[i]);
            }
            System.out.println("Connection is established again");

            BufferedOutputStream bosFile = new BufferedOutputStream(new FileOutputStream("/Users/hani/Desktop/pathOut"),
                    1024);

            byte[] bufferNet = new byte[1024];
            int bufferSizeNet = 1024;
            int bytesReadNet;
            int i = 0;

            BufferedInputStream bis;
            do {
                bis = new BufferedInputStream(arr[i % 3].getInputStream(), 1024);
                bytesReadNet = bis.read(bufferNet, 0, 1024);
                if (bytesReadNet != -1) {
                    bosFile.write(bufferNet, 0, bytesReadNet);
                    i++;
                    Thread.sleep(100);
                }

            } while (bytesReadNet != -1);

            System.out.println("Done, have a good day");
        } else {
            System.out.println("Have a great day!");
        }

    }
}

/*
 * Noor Safaa ns20352 Hani Amer ha20431
 * 
 * Refrences
 * 1- Datagrams -
 * https://docs.oracle.com/javase/8/docs/api/java/net/DatagramSocket.html
 * 2- ChatGPT for some UDP Nodes
 * 3- Java Interface Deque
 * https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
 * 4- Java class ArrayDeque
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
 * 
 * 
 */
