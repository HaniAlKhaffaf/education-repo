package oct24;

public class Main {
    public static void main(String[] args) {

        /*
         * What is the difference between connect and bind?
         * in connect, it isnt static, but bind is static, what does that mean?
         * well basically if youre sending data, and then the server disconnected, and
         * remained disconnected
         * in this case, youre gonna lose data if youre using connect because the data
         * in the queue
         * will remian there, meanwhile if you use bind, then the queue will be
         * destructed if there are other
         * binds are being sent, and the data in the destructed queue will be sent using
         * the other connections
         * 
         * now we will study the socket type
         * PUB -> Publish, and the other side is
         * SUB -> subscribe
         * 
         * Server is pub and sends data to subs
         * 
         * difference is in pub and sub, the data is sent to all subs,
         * meanwhile in push and pull, you will have data loadbalanced, or roundrobin
         * 
         * so basically sub and pub is like broadcasting/multicasting
         * it is broadcasting when you have the arguemnt as empty "" in the subscribe
         * method, but its multicasting when you actaully filter it
         * 
         * in subscribe("") the argument is regarding the topic youre interestd in to
         * sub to, so you can filter what you send to differnt subscribers
         * 
         * filtering happens by writing the name of the topic in beggining of the
         * message
         * 
         * you can use sendMore() in which it is basically concatination but in the
         * beginning of the msg so its gonna act like a filter
         * 
         * pub/sub is a very common architecture, you can also create soemthing is
         * called
         * sub topics, things like ite303/log
         * ------------------------------------------------------------------------
         * one important point is that connect always tries to reach bind
         * 
         * ZeroMQ uses TCP connections as much as it needs
         * 
         * when u have a subscribe, subscribes to a topic, the zeroMQ will send a msg to
         * the publisher about the topic it is subscribing to
         * The filteration of what youre going to receive, is not on the subscribe side,
         * its on the publisher side, the reason behind that is to make it multicast
         * instead of broadcast, so basically subscribe and unsubscribe are going to
         * generate the network neceserily
         * 
         * in Push and pull, when one node is sending data and loses connection to the
         * other
         * node, then it iwll store the data in a queue, meanwhile in sub and pub,
         * if the publisher loses connectoin to a client, then he is going to throw
         * away the data, basically the sub is going to miss the data
         * 
         * now we are introducing XPub and XSub
         * similar but the only difference is that youre not only going to see that
         * of what you subbed to, but rather the metadata too, that is with the X
         * 
         */

    }
}