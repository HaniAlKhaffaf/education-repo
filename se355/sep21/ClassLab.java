package sep21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClassLab{

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(10001);   
        

        Socket arr[] = new Socket[4];
        for(int i = 0; i < arr.length; i++) {
            Socket s = ss.accept();
            arr[i] = s;
        }


        // InputStream input = arr[0].getInputStream();
        // InputStreamReader reader = new InputStreamReader(input);
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(arr[0].getInputStream()));
        String recMSG = bufferedReader.readLine() + "\n";
 

        for(int i = 1; i < arr.length; i++){
            sendMsg(arr[i], recMSG); 
        }

        System.out.println("Completed succefully");
        
    }

        public static void sendMsg(Socket s, String message) throws Exception{
        String msg = message;
        OutputStream os1 = s.getOutputStream();
        PrintWriter pw1 = new PrintWriter(os1, true);
        pw1.write(msg);
        pw1.flush();
        
    }
    
}
