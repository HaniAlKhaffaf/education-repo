package oct31;

public class Main {
    /*
     * Bully Leader election algorithm
     * recap of thurs: Looks at priorities of whats available in the network
     * then sends a leader election for one thats higher than you
     * Bully leader in worst case scenario is O(n^2) -> best case scenario is
     * O(n)
     * 
     * Todays algorithm is easier and much better in terms of performance
     * comaped to Bully, its called
     * 
     * It is a ring topology and its called Ring Leader Election Algorithm
     * On the first iteration you will be comparing your priority, it the next
     * node is higher, then you replace the info with the new nodes info and
     * keep on sending it, at the end, the node that first sent out the msg will
     * have the adress and priority of the next leader, it can iterate over again
     * for broadcasting by letting other nodes know whos is the leader
     * 
     * how many sockets you need usually?
     * each node will need a socket to establish a connection
     * 
     * This algo takes O(n) for finding the leader and O(2n) for broadcasting
     * which will also be O(n)
     * 
     * What if we have a physical star topology or something else ?
     * since This algo needs a ring topology, then we can just construct
     * a ring topology logically through connecting nodes
     * 
     * Three star topic Homework --
     * 
     * A, B, C, D, E --> physicall all connected (Any node can communicate with any
     * other node), no constraints on the topology
     * 
     * Write a distributed algo where running it creates a ring topology going
     * through all 5 nodes
     * 
     * 
     */
}
