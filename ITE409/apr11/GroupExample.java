package apr11;
import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment;


/*
 * 
 * 
 * 
 *      Vertical and horizontal GroupLayout
 *      the code will be uploaded on moodle 
 * 
 * 
 * 
 */




public class GroupExample{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Here are the options");
        JButton button1 = new JButton("Button one");
        JButton button2 = new JButton("Button two");

        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        frame.pack();
        frame.setVisible(true);

    }
}