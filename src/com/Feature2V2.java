package com;//package mig;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;


/**
 * Created by g00291875 on 09/11/2015.
 */
public class Feature2V2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("GUI #1"));
        frame.add(panel);
                                                        // 1  2  3  4  5  6   7  8
        panel.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] [] [] [] [] []" ));
        //panel.setLayout(new MigLayout("", "", "" ));
        // panel.setLayout(new MigLayout("wrap 3"));

        //Row 1 has 1 element
        JLabel header = new JLabel ("math check subtraction lets you visualize how it's done");

        //Row 2 has 1 element
        JLabel blankR2 = new JLabel ("                                                                  ");

        //Row 3 has 3 elements
        JLabel blankR3 = new JLabel ("                                                                 ");
        JLabel jLabelV1 = new JLabel ("Enter Value 1");
        JTextField jTextFieldValue1 = new JTextField( "5");

        //Row 4 has 3 element
        JLabel jLabelV2 = new JLabel ("Enter Value 2");
        JTextField jTextFieldValue2 = new JTextField();
        JLabel blankR4 = new JLabel ("                                                                  ");

        //Row5 has elements
        JTextField jTextFieldValue1Entered = new JTextField("5");
        JTextField jTextFieldValue2Entered = new JTextField("3");
        JLabel minus = new JLabel ("Minus");
        JLabel equals = new JLabel ("equals");
        JTextField answer = new JTextField("2");
        JLabel blankR5A = new JLabel ("   ");
        JLabel blankR5B = new JLabel ("   ");
        JLabel blankR5C = new JLabel ("   ");

        //Row 5 has 1 element
        JButton showMeHowitsDoneButton = new JButton("show Me How its Done Button");



       // JTextField firstName = new JTextField(20);
       // JTextField familyName = new JTextField(20);
       // JLabel details = new JLabel("Details: ");
       // JTextArea detailsArea = new JTextArea(30,30);
       // detailsArea.setBorder(BorderFactory.createEtchedBorder());

/**********************************************************************************/
        //row1
        panel.add(header, "wrap");
        //panel.add(firstName, "pushx, growx, wrap");

        //row2
        //panel.add(blank, "pushx, growx, wrap");
        //panel.add(familyName, "pushx, growx, wrap");

        //Row 3
        //panel.add(row3Col1Blank, "left, sg 1, split 2");
        panel.add(jLabelV1, "left, sg 1, split 3");
        panel.add(jTextFieldValue1, "pushx, growx");
        panel.add(blankR3,  "pushx, growx, wrap");

        //Row 4
       // panel.add(row3Col1Blank, "wrap");

        panel.add(jLabelV2, "left, sg 1, split 3");
        panel.add(jTextFieldValue2, "pushx, growx");
        panel.add(blankR4,  "pushx, growx, wrap");


        //row 5
        panel.add(jTextFieldValue1Entered, "left, sg 1, split 8");
       // panel.add(blank2);
        panel.add(minus);
        panel.add(jTextFieldValue2Entered);
      //  panel.add(blank2);
        panel.add(equals);
      //  panel.add(blank2);
        panel.add(answer, "wrap");


        //Row 5
   //     panel.add(showMeHowitsDoneButton,"pushx, growx, wrap");


        //panel.add(row3Col2B, "wrap");

        frame.pack();
        frame.setVisible(true);

        frame.pack();

//5. Show it.
        frame.setVisible(true);
    }
}

