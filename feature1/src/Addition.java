
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by g00275669 on 23/11/2015.
 */
public class Addition {

    public static void main(String[] args) {
        new Addition();
    }

    public Addition() {

        boolean finished = false;

        final JFrame frame = new JFrame("Assignment");
        //frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel rootPanel = new JPanel(new MigLayout(""));

        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
        JPanel addition = new JPanel(new MigLayout("debug"));
        tab.add("Addition", addition);
        // tab.add("Tab 2",new JPanel());
        rootPanel.add(tab, "grow, push");


        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.orange);
        JLabel topText = new JLabel("Math Check Addition lets you add up to four numbers at the same time!");

        JPanel enterValuesPanel = new JPanel(new MigLayout("debug"));
        enterValuesPanel.setBackground(Color.green);
        JPanel showEnteredPanel = new JPanel(new MigLayout("debug"));
        //showEnteredPanel.setBackground(Color.gray);
        JPanel buttonPanel = new JPanel(new MigLayout("debug"));
        JPanel showHowPanel = new JPanel(new MigLayout("debug"));


        JLabel numValuesLabel = new JLabel("How many values do you want to add? ");
        JTextField numValues = new JTextField(20);
        numValues.setFont(new Font("Arial Black", Font.BOLD, 14));
        JLabel Value1Label = new JLabel("Enter Value 1: ");
        final JTextField Value1 = new JTextField(5);
        Value1.setFont(numValues.getFont());
        JLabel Value2Label = new JLabel("Enter Value 2: ");
        final JTextField Value2 = new JTextField(5);
        Value2.setFont(numValues.getFont());
        JLabel Value3Label = new JLabel("Enter Value 3: ");
        final JTextField Value3 = new JTextField(5);
        Value3.setFont(numValues.getFont());
        JLabel Value4Label = new JLabel("Enter Value 3: ");
        final JTextField Value4 = new JTextField(5);
        Value4.setFont(numValues.getFont());
        JTextArea plus = new JTextArea("Plus\n  +");
        plus.setFont(new Font("tahoma", Font.BOLD, 14));
        plus.setEnabled(false);
        plus.setBackground(frame.getBackground());
        JTextArea plus1 = new JTextArea(plus.getText());
        plus1.setFont(plus.getFont());
        plus1.setEnabled(false);
        plus1.setBackground(frame.getBackground());
        JTextArea plus2 = new JTextArea(plus.getText());
        plus2.setFont(plus.getFont());
        plus2.setEnabled(false);
        plus2.setBackground(frame.getBackground());
        JTextArea plus3 = new JTextArea(plus.getText());
        plus3.setFont(plus.getFont());
        plus3.setEnabled(false);
        plus3.setBackground(frame.getBackground());
        JTextArea plus4 = new JTextArea(plus.getText());
        plus4.setFont(plus.getFont());
        plus4.setEnabled(false);
        plus4.setBackground(frame.getBackground());

        JTextArea equals = new JTextArea("Equals\n    =");
        equals.setFont(new Font("tahoma", Font.BOLD, 14));
        equals.setEnabled(false);
        equals.setBackground(frame.getBackground());
        JTextArea equals1 = new JTextArea(equals.getText());
        equals1.setFont(equals.getFont());
        equals1.setEnabled(false);
        equals1.setBackground(frame.getBackground());
        JTextArea equals2 = new JTextArea(equals.getText());
        equals2.setFont(equals.getFont());
        equals2.setEnabled(false);
        equals2.setBackground(frame.getBackground());

        final JTextField enterdValue1 = new JTextField();
        enterdValue1.setEnabled(false);
        enterdValue1.setFont(numValues.getFont());
        final JTextField enterdValue2 = new JTextField();
        enterdValue2.setEnabled(false);
        enterdValue2.setFont(numValues.getFont());
        final JTextField enterdValue3 = new JTextField();
        enterdValue3.setEnabled(false);
        enterdValue3.setFont(numValues.getFont());
        final JTextField enterdValue4 = new JTextField();
        enterdValue4.setEnabled(false);
        enterdValue4.setFont(numValues.getFont());
        final JTextField ans = new JTextField(5);
        ans.setEnabled(false);
        ans.setFont(numValues.getFont());
        final JTextField ans1 = new JTextField(5);
        ans1.setEnabled(false);
        ans1.setFont(numValues.getFont());
        final JTextField enterdValue1a = new JTextField(enterdValue1.getText());
        enterdValue1a.setEnabled(false);
        enterdValue1a.setFont(numValues.getFont());
        final JTextField enterdValue2a = new JTextField(enterdValue2.getText());
        enterdValue2a.setEnabled(false);
        enterdValue2a.setFont(numValues.getFont());
        final JTextField enterdValue3a = new JTextField(enterdValue3.getText());
        enterdValue3a.setEnabled(false);
        enterdValue3a.setFont(numValues.getFont());
        final JTextField enterdValue4a = new JTextField(enterdValue4.getText());
        enterdValue4a.setEnabled(false);
        enterdValue4a.setFont(numValues.getFont());
        final JTextField ansFinal = new JTextField();
        ansFinal.setEnabled(false);

        final JButton showHow = new JButton("Show me how it's done!");
        showHow.setFont(plus.getFont());
        showHow.setEnabled(true);

        addition.add(topPanel, "pushx,center,wrap");
        topPanel.add(topText);

        addition.add(numValuesLabel, "left, split 2");
        addition.add(numValues, "left, wrap");

        addition.add(enterValuesPanel, "grow, push, left, split 2, sg 3");
        addition.add(showEnteredPanel, "grow, push, wrap, sg 3");
        enterValuesPanel.add(Value1Label, "right, split 2, growy, pushy, sg b");
        enterValuesPanel.add(Value1, "wrap, w 100!, h 50!, sg a");
        enterValuesPanel.add(Value2Label, "center, split 2, growy, pushy");
        enterValuesPanel.add(Value2, "wrap, sg a");
        enterValuesPanel.add(Value3Label, "center, split 2, growy, pushy");
        enterValuesPanel.add(Value3, "wrap, sg a");
        enterValuesPanel.add(Value4Label, "center, split 2, growy, pushy");
        enterValuesPanel.add(Value4, "wrap, sg a");

        showEnteredPanel.add(enterdValue1, "center, ,w 80!, h 80!,grow,push, sg 4, split 5");
        showEnteredPanel.add(plus, "center");
        showEnteredPanel.add(enterdValue2, "left, sg 4, grow");
        showEnteredPanel.add(equals, "center");
        showEnteredPanel.add(ans, "left, grow, sg 4, wrap");
        showEnteredPanel.add(enterdValue3, "center, grow, push, sg 4, split 5");
        showEnteredPanel.add(plus1, "center");
        showEnteredPanel.add(enterdValue4, "left, sg 4, grow");
        showEnteredPanel.add(equals1, "center");
        showEnteredPanel.add(ans1, "left, grow, sg 4");

        addition.add(buttonPanel, "center, wrap");
        buttonPanel.add(showHow, "grow, push, center");

        addition.add(showHowPanel, "right, grow, wrap, pushx");
        showHowPanel.add(enterdValue1a, "center ,w 80!, h 80!, grow, push, sg 5, split 9");
        showHowPanel.add(plus2);
        showHowPanel.add(enterdValue2a, "grow, sg 5");
        showHowPanel.add(plus3);
        showHowPanel.add(enterdValue3a, "sg 5");
        showHowPanel.add(plus4);
        showHowPanel.add(enterdValue4a, "grow, sg 5");
        showHowPanel.add(equals2);
        showHowPanel.add(ansFinal, "grow, sg 5");


        frame.setContentPane(rootPanel);
        frame.pack();
        frame.setVisible(true);

        while (!finished) {
            enterdValue1.setText(Value1.getText());
            enterdValue2.setText(Value2.getText());
            enterdValue3.setText(Value3.getText());
            enterdValue4.setText(Value4.getText());
            if (!enterdValue1.getText().isEmpty() && !enterdValue2.getText().isEmpty()) {
                ans.setText(String.valueOf(Integer.parseInt(enterdValue1.getText()) + Integer.parseInt(enterdValue2.getText())));
                enterdValue1.setEnabled(false);
                enterdValue2.setEnabled(false);
            }
            if (!enterdValue3.getText().isEmpty() && !enterdValue4.getText().isEmpty()) {
                ans1.setText(String.valueOf(Integer.parseInt(enterdValue3.getText()) + Integer.parseInt(enterdValue4.getText())));
                enterdValue3.setEnabled(false);
                enterdValue4.setEnabled(false);
            }

            if (!ans.getText().isEmpty() && !ans1.getText().isEmpty())
                finished = true;

        }


        showHow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                enterdValue1a.setText(enterdValue1.getText());
                enterdValue2a.setText(enterdValue2.getText());
                enterdValue3a.setText(enterdValue3.getText());
                enterdValue4a.setText(enterdValue4.getText());

                ansFinal.setText(String.valueOf(Integer.parseInt(ans.getText()) + Integer.parseInt(ans1.getText())));
                showHow.setEnabled(false);
            }
        });
    }
}
