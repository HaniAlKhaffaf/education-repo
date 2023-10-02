package oct1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    ServerSocket ss = new ServerSocket(10000);
    Socket s = ss.accept();

    Thread.sleep(1);

    // usually deal with these problems
    // is my network stable
    // can my network keep up with the client

    // solutions 
    // increas queue time
    // group objects together and send less messages
}