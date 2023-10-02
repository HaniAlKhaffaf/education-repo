package apr18;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Lab2 {



    public Lab2() {

        JFrame frame = new JFrame("Text Area - Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);


        JTextArea txt1 = new JTextArea();
        JTextArea txt2 = new JTextArea();
        Document d1 = txt1.getDocument();
        d1.addDocumentListener(new DocumentListener());

        txt1.setSize(100, 200);
        txt2.setSize(100, 200);

        groupLayout.setHorizontalGroup(
                                groupLayout.createSequentialGroup()
                                .addComponent(txt1)
                                .addGap(10)
                                .addComponent(txt2)

								 );
		groupLayout.setVerticalGroup(
								groupLayout.createParallelGroup()
                                .addComponent(txt1)
                                .addComponent(txt2)

								);

        frame.pack();
        frame.setVisible(true);
  
    }









    public static void main(String[] args) {
        new Lab2();
    }
}
