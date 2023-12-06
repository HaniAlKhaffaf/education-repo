package Lab4;

import java.io.*;
import java.net.*;
import java.util.LinkedList;

public class NodeF {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket(10006);
        LinkedList<Message> ll = new LinkedList<>();
        char nodeName = 'F';

        Thread receiverThread = new Thread(new Runnable() {
            @Override
            public void run() {
                byte[] buf = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                int counter = 0;
                try {
                    while (counter < 6) {
                        s.receive(packet);
                        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
                        ObjectInputStream ois = new ObjectInputStream(bais);
                        Message msg = (Message) ois.readObject();
                        ll.add(msg);
                        System.out.println(counter);
                        counter++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        receiverThread.start();

        InetAddress address = InetAddress.getByName("localhost");
        int[] recPorts = { 10001, 10002, 10003, 10004, 10005 };

        // Random priority between 1 and 255
        int priority = (int) (Math.random() * 255) + 1;

        Message msg = new Message(priority, nodeName);
        System.out.println(msg.srcID);
        System.out.println(msg.priority);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(msg);

        Thread.sleep(15 * 1000);
        byte[] buf = baos.toByteArray();
        for (int i = 0; i < recPorts.length; i++) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, recPorts[i]);
            s.send(packet);
        }

        // Bully Election Algorithm
        boolean hasHigherPriorityNode = false;
        for (Message receivedMsg : ll) {
            if (receivedMsg.priority > priority) {
                hasHigherPriorityNode = true;
                break;
            }
        }

        if (!hasHigherPriorityNode) {
            System.out.println("I am the leader. Node " + nodeName + " with priority: " + priority);
            // Notify others about the leadership
            for (int i = 0; i < recPorts.length; i++) {
                if (recPorts[i] != 10006) {
                    DatagramPacket notifyPacket = new DatagramPacket(buf, buf.length, address, recPorts[i]);
                    s.send(notifyPacket);
                }
            }
        }

        Thread.sleep(15 * 1000);

        // Print the final leader
        System.out.println("Leader is Node " + ll.getLast().srcID + " with priority: " + ll.getLast().priority);
    }
}
