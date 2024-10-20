

// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PoundsToKg {
    // frame
    JFrame f;
    // Table
    JTable j;

    // Constructor
    PoundsToKg()
    {
        // Frame initialization
        f = new JFrame();

        // Frame Title
        f.setTitle("KG to Lbs and vice versa");
        String[][] data = {
                { "1", "2.2"," ", "20", "9.09" },
                { "3", "6.6", " ", "25", "11.36" },
                //{ "", " ", " ", " "},
                {"197", "433.4"," ", "510", "231.82"},
                {"199", "437.8"," ","515", "234.09" },
        };

        // Column Names
        String[] columnNames = { "Kilograms", "Pounds","|", "Pounds", "Kilograms" };

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }

    // Driver method
    public static void main(String[] args)
    {
        new PoundsToKg();
    }
}














/*
public class PoundsToKg {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        String[] columnNames = {"Kilograms", "Pounds", "Pounds", "kilograms"};

        Object[][] data = {
                {new Int(1), new double(2.2), new String("|"), new Int(20), new double(9.09)},
                {new Int(3), new double(6.6), new String("|"), new Int(25), new double(11.36)},
                {new String("-"), new String("-"), new String("-"), new String("-"), new String("-")},
                {new Int(197), new double(433.4),new String("|"), new Int(510), new double(231.82)},
                {new Int(199), new double(437.8), new String("|"), new Int(515), new double(234.09)},




        };
        JTable table = new JTable(data, columnNames);

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
*/
//https://www.developer.com/java/java-tables/

