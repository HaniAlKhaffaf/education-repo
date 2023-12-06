package oct22;

public class Server {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            ZMQ.Socket s = context.createSocket(SocketType.PULL);
            s.bind("tcp://*:5000");

            int i = 0;
            while (true) {
                String msg = new String(ZMQ.CHARSET);
                System.out.println("receiving: " + msg);
                byte[] arr = s.recv(0);
                boolean result = s.send(arr, 0);
                i++;
                Thread.sleep(10);
            }
        }

    }
}
