package apr6;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableExample{

    // Approach number one is used for compilation (Creating Arrays)
    // to modify model at runtime use approach number two (DefaultTableModel)

    /*
     *                      HOMEWORK
     * 
     *  Create a frame and scrollable table.
     *  create an add button such that when a use clicks on the button
     *  the following data will be added to the table
     * 
     *  <Current time>      <Current date>
     * 
     *  Create another button such that when the user clicks on it,
     *  delete the last raw from the table.
     * 
     * 
     */


    public JTableExample(){
        JFrame f = new JFrame();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("GPA");
        model.addColumn("Course");
        JTable table = new JTable(model);
        // String[][] data = {
        //     {"Ahmed", "3.2", "ITE409"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"},
        //     {"Sara", "2.3", "ITE303"}
        // };

        model.addRow(new String[]{"Ahmed", "3.2", "ITE409"});
        model.addRow(new String[]{"Tara", "3.8", "ITE303"});
        model.addRow(new String[]{"Sara", "2.2", "ITE305"});

   
   
   
   
   
   
   
   
   
   
   
        // String[] cols = {"Name", "GPA", "Course Name"};

        
        table.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(table);

        f.add(sp);


        f.setTitle("JTable Example");
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTableExample();
    }
}