import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;

public class Main extends JFrame{
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        JFrame frame = new JFrame("Math Check");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JTabbedPane tab = new JTabbedPane();
        tab.add("Addition tab", new Addition());
        tab.add("Subtraction tab", new Sub());
        tab.add("Multiplication tab", new Multi());
        tab.add("LinearGraphs tab", new LinearGraph());
        frame.add(tab);
       // frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(940, 580);
        frame.setVisible(true);
    }
}
