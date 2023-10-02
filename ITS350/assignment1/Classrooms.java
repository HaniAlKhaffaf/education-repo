package assignment1;

public class Classrooms {
    public Nodes head;
    Nodes tail;
    int size = 0;

    // Time Complexity O(n)
    void schedule(double val) {
        Nodes newClass = new Nodes(val);


        if(head == null) {
            head = tail = newClass;
            size++;
            return;
        } else if(val < head.val) {
            if (timeGap(head.val, val)) {
                newClass.next = head;
                head = newClass;
                size++;
                return;
            }
        } else if(tail.val < val) {
            if(timeGap(tail.val, val)) {
                tail.next = newClass;
                tail = newClass;
                size++;
                return;
            }
        } else {
            Nodes temp = head;
            double val1 = temp.val;
            double val2 = temp.next.val;

            while(!(val1 < val && val < val2)) {
                temp = temp.next;
                val1 = temp.val;
                val2 = temp.next.val;
            }

            if (timeGap(val, val1) && timeGap(val, val2)) {
                newClass.next = temp.next;
                temp.next = newClass;
                size++;
                return;
            }
        }
        System.out.println("Lecture at the time " + val + " cannot be set due to conflict");
    }

    // Time Complexity O(1)
    boolean timeGap(double val1, double val2) {
        return (Math.abs(val1 - val2) >= 1.15f);
        // for the sake of considering the break and the conflicts
    }

    // Time Complexity O(n)
    void unSchedule(double val) {
        Nodes temp = head;

        if(head.val == val) {
            head = head.next;
        } else if(tail.val == val) {
            while(temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        } else {
            while(temp.next.val != val) {
                temp = temp.next;
            }
            if (temp.next == tail) {
                temp = tail;
            }

            temp.next = temp.next.next;
        }
        size--;
    }

    // Time Complexity O(n^2)
    void combine(Classrooms Classrooms) {
        Nodes temp = Classrooms.head;

        while(temp != null) {
            this.schedule(temp.val);
            temp = temp.next;
        }
    }

    // Time Complexity O(1)
    void firstLecture(String classroom) {
        // we will use the head to access the first element, in our case the first lecutre
        System.out.println("The first lecture of class " + classroom + " is: " + this.head.val);
    }

    // Time Complexity O(1)
    void lastLecture(String classroom) {
        // we will use the tail to access the last element, in our case the last lecutre
        System.out.println("The last lecture of class " + classroom + " is: " + this.tail.val);
    }

    // Time Complexity O(1)
    void printNumberOfLectures(String classroom) {
        // we will rely on the size attribute
        System.out.println("The number of lectures in class " + classroom + " are " + this.size);
    }

    // Time Complexity O(n)
    void display(String list) {
        Nodes temp = head;

        System.out.println("");
        System.out.println("Classroom " + list);

        while(temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

