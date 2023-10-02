package apr13;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lab {



    public Lab() {

        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);


        JButton btn1 = new JButton("Load");
        JButton btn2 = new JButton("Save");
        JTextArea txt = new JTextArea();
        txt.setSize(500, 100);

        groupLayout.setHorizontalGroup(
                                groupLayout.createParallelGroup()
                                .addGroup(groupLayout.createSequentialGroup()
                                    .addComponent(btn1)
                                    .addGap(20)
                                    .addComponent(btn2)
                                )
                                
								.addComponent(txt,  javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
								 );
		groupLayout.setVerticalGroup(
								groupLayout.createSequentialGroup()
                                    .addGroup(groupLayout.createParallelGroup()
                                    .addComponent(btn1)
                                    .addGap(20)
                                    .addComponent(btn2)
                                )

                                .addGap(20)
                                
								.addComponent(txt,  javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
								);

        frame.pack();
        frame.setVisible(true);
  
    }









    public static void main(String[] args) {
        new Lab();
    }
}
