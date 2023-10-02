package se421Assignment;

public class Main {
    Subject s = new Subject();

    ActionListener al = new ActionListener() {
        public void nameChanged(Subject n) {
            // piece of codde
        };
    };
    
    s.addActionListener(al);
}
