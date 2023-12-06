package oct19;

public class Client {
    public static void main(String[] args) {
        try (ZContext context = new ZConext()) {
            ZMQ.Socket s = context.createSocket(SocketType.REQ);
            s.connect("tcp://localhost:5555"); // when we call connect, the queue happens
            s.send(byte[], 0);

            // why do we need a queue in the Client?
            // so we can save the data in case the server is down, it will keep it
            // in a buffer until the connection is back, so the data is kept safe

        }
    }
}
