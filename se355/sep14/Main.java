package sep14;
import java.net.*;
import java.io.*;

public class Main{

    /*
     * 
     * TCP is mainly about the three-way handshake, as it's very important
     * for verification and authentication
     * 
     * You can treat the s object as the TCP connections, The object s from class
     * socket we created
     * 
     * TCP is generally over multiple hubs, data can go left to right, or 
     * right to left
     * From Client to server -> Output
     * From Server to client (Reading data) -> Input
     * 
     * generate data --> Output
     * receive data --> Input
     * 
     * 
     * 
     */


    public static void main(String[] args) {
        try(Socket s = new Socket("google.com", 80)) {
            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true); // true means
            // automatically flush, flush is like after a while of having data
            // it will flush the buffer, like pushing it down

            writer.print("This is a hello ms from the class se355"); // this doesnt follow thise standard of HTTP so google isnt responding
            writer.flush(); // we use flush so that it sends the data to the user
            // fast, flush purpose is to gather data and then when the memory is ready
            // by having many data, it will send them together, but rn we need the data
            // fast thats why we immediatly flush it after our code 
            // change the idea as that we flush what we send and not what we 
            // receive


            // we had many objects just so we can use the method print 
            // all of the data will be given in binary to the TCP/IP
            // so write converts your code into binary so the TCP can understand it
            // so far now we wrote data and send it over the network, now we will
            // try to read and understand code from the server (Google in our case)

            InputStream input = s.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
            

            //Code below to able to read one character at a time from the server
            int character;
            StringBuilder data = new StringBuilder(); 
            // StringBuilder is used to avoid creating multiple string objects, 
            // as in concatination takes 3 objects per String, while StringBuilder
            // will only create on object

            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
            System.out.println(data.toString());

            // InputSteamReader is for receiving data from the server

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) { 
            e.printStackTrace();
        }
        System.out.println("End");
    }
}