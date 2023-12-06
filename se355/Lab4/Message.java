package Lab4;

import java.io.Serializable;

public class Message implements Serializable {
    public int priority;
    public char srcID;

    public Message(int priority, char srcID) {
        this.priority = priority;
        this.srcID = srcID;
    }
}
