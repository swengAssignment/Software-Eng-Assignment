import javax.annotation.Resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by g00275669 on 23/11/2015.
 */
public class Addition {

    public static void main(String[] args) {
        new Addition();

    }

    public Addition(){
        JFrame frame = new JFrame("Assignment");
        //frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage plus_img = null;
        BufferedImage minus_img = null;

        /*JPanel panel  = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Addition"));
        frame.add(panel);*/


        JPanel rootPanel = new JPanel(new MigLayout(""));

        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
        JPanel addition = new JPanel(new MigLayout("debug"));
        tab.add("Addition",addition);
       // tab.add("Tab 2",new JPanel());
        rootPanel.add(tab, "grow, push");


        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.orange);
        JLabel topText = new JLabel("Math Check Addition lets you add up to four numbers at the same time!");

        JPanel enterValuesPanel = new JPanel(new MigLayout("debug"));
        enterValuesPanel.setBackground(Color.green);
        JPanel showEnteredPanel = new JPanel(new MigLayout("debug"));
        //showEnteredPanel.setBackground(Color.gray);

        JLabel numValuesLabel = new JLabel("How many values do you want to add? ");
        JTextField numValues = new JTextField(20);
        JLabel Value1Label = new JLabel("Enter Value 1: ");
        JTextField Value1 = new JTextField(5);
        JLabel Value2Label = new JLabel("Enter Value 2: ");
        JTextField Value2 = new JTextField(5);
        JLabel Value3Label = new JLabel("Enter Value 3: ");
        JTextField Value3 = new JTextField(5);
        JTextArea plus = new JTextArea("Plus\n  +");
        plus.setFont(new Font("tahoma", Font.BOLD, 14));
        plus.setEnabled(false);
        plus.setBackground(frame.getBackground());
        JTextArea equals = new JTextArea("Equels\n    =");
        equals.setFont(new Font("tahoma", Font.BOLD, 14));
        equals.setEnabled(false);
        equals.setBackground(frame.getBackground());
        JTextArea plus1 = new JTextArea("Plus\n  +");
        plus1.setFont(new Font("tahoma", Font.BOLD, 14));
        plus1.setEnabled(false);
        plus1.setBackground(frame.getBackground());
        JTextArea equals1 = new JTextArea("Equels\n    =");
        equals1.setFont(new Font("tahoma", Font.BOLD, 14));
        equals1.setEnabled(false);
        equals1.setBackground(frame.getBackground());


        JTextField enterdValue1 = new JTextField();
        enterdValue1.setEnabled(false);
        JTextField enterdValue2 = new JTextField(5);
        enterdValue2.setEnabled(false);
        JTextField enterdValue3 = new JTextField(5);
        enterdValue3.setEnabled(false);
        JTextField enterdValue4 = new JTextField(5);
        enterdValue4.setEnabled(false);
        JTextField ans= new JTextField(5);
        ans.setEnabled(false);
        JTextField ans1= new JTextField(5);
        ans1.setEnabled(false);

        addition.add(topPanel, "pushx,center,wrap");
        topPanel.add(topText);

        addition.add(numValuesLabel, "left, sg a, split 2"); //sg a (Size group a) is just a label
        addition.add(numValues, "left, wrap");

        addition.add(enterValuesPanel, "grow, left, split 2, sg 3");
        addition.add(showEnteredPanel, "grow, right, wrap, sg 3");
        enterValuesPanel.add(Value1Label, "left, split 2"); //sg a (Size group a) is just a label
        enterValuesPanel.add(Value1, "left, wrap");
        enterValuesPanel.add(Value2Label, "left, split 2"); //sg a (Size group a) is just a label
        enterValuesPanel.add(Value2, "left, wrap");
        enterValuesPanel.add(Value3Label, "left, split 2"); //sg a (Size group a) is just a label
        enterValuesPanel.add(Value3, "left, wrap");

        showEnteredPanel.add(enterdValue1, "left, grow, sg 4, split 5");
        showEnteredPanel.add(plus, "center");
        showEnteredPanel.add(enterdValue2, "left, sg 4, grow");
        showEnteredPanel.add(equals, "center");
        showEnteredPanel.add(ans, "left, grow, sg 4, wrap");
        showEnteredPanel.add(enterdValue3, "left, grow,sg 4, split 5");
        showEnteredPanel.add(plus1, "center");
        showEnteredPanel.add(enterdValue4, "left, sg 4, grow");
        showEnteredPanel.add(equals1, "center");
        showEnteredPanel.add(ans1, "left, grow, sg 4");

        frame.setContentPane(rootPanel);
        frame.pack();
        frame.setVisible(true);

    }


}
