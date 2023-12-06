package oct22;

public class Main {
    public static void main(String[] args) {
        /*
         * for s.connect will create a queue immediatley
         * meanwhile for s.bind, it will only create a queue when a client connects
         * in the second server, it will be same as server 1 but the differnce is the
         * port number
         * now the client is using s.connect twice, but each for a specific server
         * what the client will do, it will distribute the data in round robin fashion
         * it means that the data will be evenly distributed
         * 
         * what happens if we shutdown one server while connecting to two differenct
         * servers??
         * 
         * Then it will keep sending to that server the same data, but once it reaches
         * the maximum data in storage, then it will start sending the full data to the
         * other server
         * 
         * cant explain everything, please watch recording
         * 
         * TAKEAWAY
         * 
         * 1- Each connect is a queue, and data is distributes
         * 2- the connect or bind method, has nothing to do with the server behaviour
         * 
         * bind basically means create queues dynamically
         */
    }
}
