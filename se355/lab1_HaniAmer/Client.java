package lab1_HaniAmer;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
    public static void main(String[] args) {
        try(Socket s = new Socket("127.0.0.1", 7070)) {

            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            writer.println("Ping");
            writer.flush();

        } catch (UnknownHostException e) {
            
            e.printStackTrace();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}