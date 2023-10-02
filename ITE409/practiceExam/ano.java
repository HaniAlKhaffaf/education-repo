package practiceExam;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ano {
    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI {
    JTextArea text1;

    public GUI() {
        JFrame frame = new JFrame("event");
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text1 = new JTextArea();
        // text1.setPreferredSize(new Dimension(100, 50));
        JTextArea text2 = new JTextArea();
        // text2.setPreferredSize(new Dimension(200, 300));

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(text1, 100, 200, 300).addGap(40)

                        .addComponent(text2));

        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup().addComponent(text1, 100, 200, 300).addComponent(text2)

        );

        // text2.getDocument().addDocumentListener(new DocumentListener() {
        //     public void changedUpdate(DocumentEvent e) {

        //     }

        //     public void removeUpdate(DocumentEvent e) {
        //         text1.setText(text2.getText());
        //     }

        //     @Override
        //     public void insertUpdate(DocumentEvent e) {
        //         text1.setText(text2.getText());

        //     }
        // });

        text1.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {

            }

            public void removeUpdate(DocumentEvent e) {
                text2.setText(text1.getText());
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                text2.setText(text1.getText());

            }
        });

        frame.setVisible(true);
    }

}