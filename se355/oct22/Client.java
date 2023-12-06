package oct22;

public class Client {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            ZMQ.Socket s = context.createSocket(SocketType.REQ);
            s.connect("tcp://localhost:5000");

            String msg = "hello";
            System.out.println("sending: " + msg);
            byte[] arr = msg.getBytes(ZMQ.CHARSET);
            boolean result = s.send(arr, 0);

            System.out.println(result);
        }
    }
}
