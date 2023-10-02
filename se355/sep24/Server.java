package sep24;

import java.net.*;
import java.io.*;

public class Server{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10001);

        Socket s = ss.accept();

        // we can use the same, DataInputStream to read high level IO data
        InputStream in = s.getInputStream();
        DataInputStream din = new DataInputStream(in);
        byte b1 = din.readByte();
        short c1 = din.readShort();

        sendMsg(s); 

    }

    public static void sendMsg(Socket s) throws Exception{
        String msg = "11\n";

        // if we want to send a number in UTF8, each number is byte, so 128 -> 3bytes
        // meanwhile in binary it will only be 1 byte, so how can we get it as a
        // binary, The answer is using DataOutputStream instead PrintWriter
        
        /*
         * Scenario --> if we send from server to client, with printWriter the
         * value '100', on the client side we save it as an int and read it with
         * dataInputStream, what do we get on the client side?
         * the answer is a weird number because datainputstream will read it
         * as 3 bytes instead of 1, so we will get a weird number
         * 
         * DataOut/InputStream they read the data in the same order 
         * if you give it an int first, then you should read int first
         * otherwise you will get data corruption
         * WriteFloat(2.1) --> x = readFloat();
         * WriteByte(2) --> y = readByte();  then everything will go accordingly
         * but if we swap the order on only one side then we get an error 
         * 
         */

        OutputStream os1 = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os1);
        dos.writeByte(128);
        dos.flush();
        
    }
}
