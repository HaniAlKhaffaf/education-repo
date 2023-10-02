package practiceExam;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("ITE409 Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JButton btn1 = new JButton("Load");
        JButton btn2 = new JButton("Save");
        JTextField tf = new JTextField();
        

        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);

        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFileChooser j = new JFileChooser();
                int result = j.showOpenDialog(null);
                if(result == JFileChooser.APPROVE_OPTION){
                    File file = j.getSelectedFile();
                }
            }
        };

        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup()
            .addGroup(groupLayout.createSequentialGroup()
            .addComponent(btn1)
            .addComponent(btn2)
            )
        .addComponent(tf)
        );

        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
            .addGroup(groupLayout.createParallelGroup()
            .addComponent(btn1)
            .addComponent(btn2)
            )
        .addComponent(tf)
        );

        btn2.addActionListener(listener);
        frame.setVisible(true);
    }
}
