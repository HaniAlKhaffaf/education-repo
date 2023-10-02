package sep12;
import java.net.*;

public class Main{

    /*
     * 
     * Distributed computing is basically running your piece of code 
     * on multiple machines
     * 
     * one of the issues is that moving data is quite expensive due 
     * to the fact that building a network can be costy due to the fact
     * that the machines will be slower as TCP/IP authentication
     * 
     * Anothe idsadvantage is you have to maintain multiple machines as well
     * 
     * 1- The biggest problem is bringing all of the complexity, of networking,
     * maintaining multiple machines and all coming into your code, which will 
     * be a huge complexity for you
     * 
     * 2- biggest problem, you have to figure out a way to split your algorithm,
     *  as each machines will do a ceratin % of the algorithm
     * 
     * this means that you can have multiple nodes that can take care of your 
     * algorithm 
     * 
     * another problem is that in the case of a failture of a single machine,
     * will make the entire algorithm stop working
     * 
     * what you want is to avoid central control, so like multiple computers
     * that connect back to main source, this isn't good for distributed
     * computing as distributing computing aims towards gettings rid of 
     * central control, and have all of the other computers do an equal
     * percentage of the work/algorithm
     * 
     * we will deal with TCP/IP and how java can work with that 
     * the combination of networking and java is calling networking programminig
     * 
     * 
     * SYN SYN/ACK SYN and something else, These are called the three messages
     * that TCP uses, it is known as the three-way handshake, for confimration
     * of the data between the source and destination
     * 
     *  the ports are the sessions layer
     * 
     *  Recap 404 class for the Networking recap
     * 
     */



    public static void main(String[] args) {
        // send data via TCP/IP a server
        // to send TCP/IP we need a port and IP adress, source adress and destination

        try(Socket s = new Socket("google.com", 80)) {
            //since host is a string then we can use a domain name
            // you can close a socket with the commans s.close();
        } catch (UnknownHostException e) {
            
            e.printStackTrace();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        System.out.println("End");
    }
}