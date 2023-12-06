package oct19;

public class Main {
    public static void main(String[] args) {
        /*
         * 
         * 
         * One major problem is that the machines in distrubted computing, is that most
         * of the times that machines
         * are not at the same speed
         * as a result you will start having data loss problems, you will start losing
         * packages
         * What is the solution?
         * One solution is basically decoupling one compnents speed from the other
         * component in the system --> Example: in Eid or valentine, Telecommunication
         * servers will start facing this problem
         * 
         * We want to change the servers speed close to O(1), or O(logn)
         * if the server is fast, that isnt a problem, but vice versa is a big problem
         * 
         * We can start using DP (Dynamic Programming) -> creating a data strucutre,
         * which will store
         * the data coming, with each data income, we send acknowledgement, so we client
         * doesnt actaully
         * know about speed of the server, This data structure is Queue --> Queues are
         * everywhere in networking
         * 
         * So we can say that the data structure acts a buffer, but it should be a queue
         * and not a stack --> because we want First Come, First Serve
         * 
         * We are going to use an API for the usage of stacks and queues
         * Problem of ZeroMQ is that the data structure is in memory, so if our
         * crashes, then we lose all data --> another API called Apache Kafka solves
         * that problem, its basically a server that acts a queue
         * 
         * 
         * 
         * 
         */
    }
}
