package sep17;
import java.net.*;
import java.io.*;

public class Client{
    public static void main(String[] args) {
        try(Socket s = new Socket("google.com", 80)) {
            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true); // true means
            // automatically flush, flush is like after a while of having data
            // it will flush the buffer, like pushing it down

            writer.print("This is a hello ms from the class se355"); // this doesnt follow thise standard of HTTP so google isnt responding
            writer.flush();



            InputStream input = s.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
            

            int character;
            StringBuilder data = new StringBuilder(); 

            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
            System.out.println(data.toString());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) { 
            e.printStackTrace();
        }
        System.out.println("End");
    }
}