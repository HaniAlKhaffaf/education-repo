package se421Assignment;

public class Subject {
    private ActionListener listener;
    private String name;

    public void setName(String n) {
        this.name = n;
        if (this.listener != null) {
            this.listener.nameChanged(this);
        }
    }
    public void addActionListener(ActionListener l){
        this.listener = l;
    }
}
