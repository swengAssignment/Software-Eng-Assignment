
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Master extends JPanel {
    /**********************/
    JLabel header;
    //Row 2 has 1 element
    JLabel blankR2;
    //Row 3 has 3 elements
    JLabel blankR3 ;
    JLabel jLabelV1 ;
    JTextField jTextFieldValue1;
    //Row 4 has 3 element
    JLabel jLabelV2;
    JTextField jTextFieldValue2;
    JLabel blankR4;
    //Row5 has elements
    JTextField jTextFieldValue1Entered;
    JTextField jTextFieldValue2Entered;
    JLabel minus;
    JLabel equals;
    JTextField answerLabel;
    JLabel blank;
    JLabel blankR5B;
    JLabel blankR5C;
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel subPanel;
    JButton showMeHowitsDoneButton;
    int intAnswer;
    int intValue1;
    int intValue2;
    /*************************/
    JLabel weHad;
    JLabel weTook;
    JLabel weHave;
    JTextField weHadResult;
    JTextField weTookResult;
    JTextField weHaveResult;
    /**********************/
    public Master() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();
        makeSubtractionPanel("");
//        JComponent panel1 = makeTextPanel("");
//        tabbedPane.addTab("Addition tab", icon, panel1,
//                "");
//        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        /**********************************/

//        JComponent panel2 = makeTextPanel("subtraction tab");
        tabbedPane.addTab("Tab 2", null, subPanel,
                "");
//        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

//        JComponent panel3 = makeTextPanel("");
//        tabbedPane.addTab("multiplication tab", icon, panel3,
//                "");
//        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
//        JComponent subPanel = makeTextPanel(
//                "");
//        subPanel.setPreferredSize(new Dimension(600, 600));
//        tabbedPane.addTab("Linear tab", icon, subPanel,
//                "");
//        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    /***************************** START SUBTRACTION TAB ******************************************/
        public void actionPerformedSubtraction(ActionEvent e) {
            //JTextField f1 = new JTextField("-5");
            weHadResult.setText(null);
            weTookResult.setText(null);
            weHaveResult.setText(null);
            String v1S = jTextFieldValue1.getText();
            intValue1 = Integer.parseInt(v1S);
            String v2S = jTextFieldValue2.getText();
            intValue2 = Integer.parseInt(v2S);
            intAnswer = intValue1 - intValue2;
            String strAnswer = Integer.toString(intAnswer );
            answerLabel.setText("              " + strAnswer);
            jTextFieldValue1Entered.setText("             " +v1S);
            jTextFieldValue2Entered.setText("             " +v2S);

            String weHadString = "    ";
            String weTookString = "    ";
            String weHaveString = "    ";

            for (int x=0; x<intValue1; x++){
                weHadString = weHadString + "* ";
            }
            for (int x=0; x<intValue2; x++){
                weTookString = weTookString + "* ";
            }
            for (int x=0; x<intValue2; x++){
                weHaveString = weHaveString + "--";
            }
            for (int x=0; x<intAnswer; x++){
                weHaveString = weHaveString + "* ";
            }
            weHadResult.setText(weHadString);
            weTookResult.setText(weTookString);
            weHaveResult.setText(weHaveString);
        }

    public void makeSubtractionPanel(String text)  {
        header = new JLabel ("math check subtraction lets you visualize how it's done");
        //Row 2 has 1 element
        jLabelV1 = new JLabel ("              Enter Value 1:");
        jTextFieldValue1 = new JTextField( "");
        //Row 4 has 3 element
        jLabelV2 = new JLabel ("              Enter Value 2:");
        jTextFieldValue2 = new JTextField("");
        //Row5 has elements
        jTextFieldValue1Entered = new JTextField("0");
        jTextFieldValue2Entered = new JTextField("0");
        minus = new JLabel ("                    Minus       -    ");
        equals = new JLabel ("                   Equals      =    ");
        answerLabel = new JTextField("");
        blank = new JLabel("");
        /****************************/
        weHad = new JLabel("\t\t        We Had this many apples:");
        weHadResult = new JTextField("");
        weTook = new JLabel("\t\t        We Took away this many apples:");
        weTookResult = new JTextField("");
        weHave = new JLabel("\t\t        We now have this many apples:");
        weHaveResult = new JTextField("");
        /*******************************/
        subPanel = new JPanel();
        subPanel.setBorder(BorderFactory.createTitledBorder("Subtraction tab"));
        subPanel.setLayout(new MigLayout(""));
        //Row 5 has 1 element
        showMeHowitsDoneButton = new JButton("Show me how its done");
        showMeHowitsDoneButton.addActionListener(new ActionListener() {
                                                     public void actionPerformed(ActionEvent evt) {
                                                         actionPerformedSubtraction(evt);
                                                     }
                                                 });
        //row 1
        subPanel.add(header, "span, pushx, growx, pushy, growy, gapleft 20%, gapright 10%, wrap");
        /*************************************************/
        //row 2
        subPanel.add(jLabelV1, " gaptop 10%, pushy, growy");
        subPanel.add(jTextFieldValue1, "gaptop 10%, gapbottom 2%, pushx, growx, pushy, growy");
        subPanel.add(blank, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        subPanel.add(jTextFieldValue1Entered, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        subPanel.add(minus, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        subPanel.add(jTextFieldValue2Entered, "span 2 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        subPanel.add(equals, "span 2 2,pushx, growx,  pushy, growy, gaptop 10%, gapbottom 10%");
        subPanel.add(answerLabel, "span 2 2, pushx, growx, , pushy, growy, wrap, gaptop 10%, gapbottom 10%");
        subPanel.add(jLabelV2, "shrink 70,  gapbottom 10%, pushy, growy");
        subPanel.add(jTextFieldValue2, "gaptop 2%, gapbottom 10%, pushx, growx, wrap, pushy, growy");
        /***************************************************/
        //Row 3
        subPanel.add(showMeHowitsDoneButton, "gap 100, span, pushx, growx, pushy, growy, gapleft 10%, gapright 10%, gapbottom 10%, wrap");
        //panel.add(row3Col2B, "wrap");
        //row 4
        subPanel.add(weHad, "shrink 40, pushx, growx,  pushy, growy");
        subPanel.add(weHadResult, "pushx, growx,  pushy, growy, spanx, wrap");
        //row 5
        subPanel.add(weTook, "shrink 40, pushx, growx, pushy, growy");
        subPanel.add(weTookResult, "pushx, growx, spanx,  pushy, growy, wrap");
        //row 6
        subPanel.add(weHave, "shrink 40, pushx, growx,  pushy, growy");
        subPanel.add(weHaveResult, "pushx, growx, spanx,  pushy, growy, wrap");
        /**********************************/
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        subPanel.add(filler);
    }

    /***************************** END SUBTRACTION TAB ******************************************/

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Master.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from
     * the event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Math Check");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Master(), BorderLayout.CENTER);

        //Display the window.
        frame.setSize(900, 700);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
               // UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}
