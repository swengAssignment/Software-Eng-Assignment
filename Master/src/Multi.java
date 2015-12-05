import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 05/12/2015.
 */
public class Multi extends JPanel {
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
    JTextArea minusArea;
    JLabel equals;
    JTextArea equalsArea;
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

    public Multi(){

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.orange);
        //    JLabel topText = new JLabel("Math Check Addition lets you add up to four numbers at the same time!");
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
        minus = new JLabel ("Minus       -    ");
        minusArea = new JTextArea("\n     Minus   \n        +   ");
        //  minusArea.setFont(new Font("tahoma", Font.BOLD, 14));
        minusArea.setEnabled(false);
        minusArea.setBackground(Color.ORANGE);
        minusArea.setFont(new Font("Black", Font.ITALIC, 16));

        equals = new JLabel ("     Equals      =    ");
        equalsArea = new JTextArea("\n    Equals   \n       =   ");
        equalsArea.setEnabled(false);
        equalsArea.setBackground(Color.ORANGE);
        equalsArea.setFont(new Font("Black", Font.ITALIC, 16));

        answerLabel = new JTextField("");
        blank = new JLabel("");
        /****************************/
        weHad =  new JLabel("We Had this many Apples:");
        weHadResult = new JTextField("");
        weTook = new JLabel(" We Took away this many:");
        weTookResult = new JTextField("");
        weHave = new JLabel("   We now have this many:");
        weHaveResult = new JTextField("");
        /*******************************/
        subPanel = new JPanel();
        subPanel.setBorder(BorderFactory.createTitledBorder("Subtraction tab"));
        subPanel.setLayout(new MigLayout(""));
        //Row 5 has 1 element
        showMeHowitsDoneButton = new JButton("Show me how its done");
//        showMeHowitsDoneButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                actionPerformedSubtraction(evt);
//            }
//        });

        showMeHowitsDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weHadResult.setText(null);
                weTookResult.setText(null);
                weHaveResult.setText(null);
                String v1S = jTextFieldValue1.getText();
                intValue1 = Integer.parseInt(v1S);
                String v2S = jTextFieldValue2.getText();
                intValue2 = Integer.parseInt(v2S);
                intAnswer = intValue1 - intValue2;
                String strAnswer = Integer.toString(intAnswer);
                answerLabel.setText("       " + strAnswer);
                jTextFieldValue1Entered.setText("       " + v1S);
                jTextFieldValue2Entered.setText("       " + v2S);

                String weHadString = "    ";
                String weTookString = "    ";
                String weHaveString = "    ";

                for (int x = 0; x < intValue1; x++) {
                    weHadString = weHadString + "* ";
                }
                for (int x = 0; x < intValue2; x++) {
                    weTookString = weTookString + "* ";
                }
                for (int x = 0; x < intValue2; x++) {
                    weHaveString = weHaveString + "--";
                }
                for (int x = 0; x < intAnswer; x++) {
                    weHaveString = weHaveString + "* ";
                }
                weHadResult.setText(weHadString);
                weTookResult.setText(weTookString);
                weHaveResult.setText(weHaveString);
            }
        });
        //row 1




        setLayout(new MigLayout(""));

        add(topPanel,"wrap, gap left 30%");
        topPanel.add(header, "span, pushx, growx, pushy, growy, gapleft 30%, gapright 10%, wrap");


        //     add(header, "span, pushx, growx, pushy, growy, gapleft 30%, gapright 10%, wrap");
        /*************************************************************************************/
        JPanel midPanel = new JPanel(new MigLayout("debug"));
        midPanel.setBackground(Color.GREEN);

        add(midPanel, "pushx, growx ,center,wrap");

        //row 2
        midPanel.add(jLabelV1, "sg a, gaptop 10%, right, pushy, growy");
        midPanel.add(jTextFieldValue1, "sg a,gaptop 10%, gapbottom 2%, pushx, growx, pushy, growy");
        midPanel.add(blank, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        midPanel.add(jTextFieldValue1Entered, "sg a, span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        //   add(minus, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");

        midPanel.add(minusArea, "  shrink 70, span 1 2, pushy, growy, gaptop 25%, gapbottom 25%");
        midPanel.add(jTextFieldValue2Entered, "sg a, span 2 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        //  add(equals, "span 2 2, pushx, growx,  pushy, growy, gaptop 10%, gapbottom 10%");
        midPanel.add(equalsArea, " shrink 70, span 2 2,  pushy, growy, gaptop 25%, gapbottom 25%");

        midPanel.add(answerLabel, "sg a, span 2 2, pushx, growx, , pushy, growy, wrap, gapright 5%, gaptop 10%, gapbottom 10%");
        midPanel.add(jLabelV2, "sg a, shrink 70, right, gapbottom 10%, pushy, growy");
        midPanel.add(jTextFieldValue2, "sg a, gaptop 2%, gapbottom 10%, pushx, growx, wrap, pushy, growy");
        /***************************************************/
        //Row 3
        midPanel.add(showMeHowitsDoneButton, "gap 100, span, pushx, growx, pushy, growy, gapleft 10%, gapright 10%, gapbottom 10%, wrap");
        //panel.add(row3Col2B, "wrap");
        //row 4
        /**********************************************************************************************************/
        /**********************************************************************************************************/
        JPanel botPanel = new JPanel(new MigLayout("debug"));
        // JPanel botPanel = new JPanel();
        botPanel.setBackground(Color.GREEN);

        add(botPanel, "push, grow ,center,wrap");


        botPanel.add(weHad,  "right, growy, pushy, sg b");

        botPanel.add(weHadResult, "pushx, growx,  pushy, growy, spanx, wrap");
        //row 5
        botPanel.add(weTook, "right, growy, pushy, sg b");
        botPanel.add(weTookResult, "pushx, growx, spanx,  pushy, growy, wrap");
        //row 6
        botPanel.add(weHave, "right, growy, pushy, sg b");
        botPanel.add(weHaveResult, "pushx, growx, spanx,  pushy, growy, wrap");
        /**********************************/
        // JLabel filler = new JLabel("label");
        //   filler.setHorizontalAlignment(JLabel.CENTER);
        //   add(filler);
    }

    public void actionPerformedSubtraction(ActionEvent e) {
        //JTextField f1 = new JTextField("-5");
        weHadResult.setText("test");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sub().setVisible(true);
            }
        });
    }
}

