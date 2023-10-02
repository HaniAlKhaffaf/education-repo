package sep19;

import java.io.PrintWriter;

public class ServerThread extends Thread{

    PrintWriter writer;
    public ServerThread(PrintWriter writer) {
        this.writer = writer;   
    }

    public void run() {
        int x = 1;
        while(x ==1){
            writer.print("This is hello from server \n\n");
            writer.flush();
        }
    }
    
}