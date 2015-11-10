package com;//package mig;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by g00291875 on 09/11/2015.
 */
public class Feature2V2 {
    //Row 1 has 1 element
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
    JLabel blankR5A;
    JLabel blankR5B;
    JLabel blankR5C;
    JFrame frame;
    JPanel panel;
    JButton showMeHowitsDoneButton;
    int intAnswer;
    int intValue1;
    int intValue2;

    public Feature2V2(){
        buildGui();
    }

    public void buildGui()
    {
        header = new JLabel ("                                math check subtraction lets you visualize how it's done");
        //Row 2 has 1 element
         blankR2 = new JLabel ("                                                                  ");
        //Row 3 has 3 elements
         blankR3 = new JLabel ("                                                                 ");
         jLabelV1 = new JLabel ("Enter Value 1");
         jTextFieldValue1 = new JTextField( "5");
        //Row 4 has 3 element
         jLabelV2 = new JLabel ("Enter Value 2");
         jTextFieldValue2 = new JTextField("3");
         blankR4 = new JLabel ("                                                                 ");
        //Row5 has elements
         jTextFieldValue1Entered = new JTextField("5");
         jTextFieldValue2Entered = new JTextField("3");
         minus = new JLabel ("Minus");
         equals = new JLabel ("equals");
         answerLabel = new JTextField("2");
         blankR5A = new JLabel ("   ");
         blankR5B = new JLabel ("   ");
         blankR5C = new JLabel ("   ");
         frame = new JFrame("My Frame");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("GUI #1"));
        frame.add(panel);

//        JPanel panel2 = new JPanel();
//        panel2.setBorder(BorderFactory.createTitledBorder("panel 2"));
//        frame.add(panel2);
        // 1  2  3  4  5  6   7  8
        panel.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] [] [] [] [] []" ));

        //panel2.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] [] [] [] [] []" ));
        //panel.setLayout(new MigLayout("", "", "" ));
        // panel.setLayout(new MigLayout("wrap 3"));



        //Row 5 has 1 element
        showMeHowitsDoneButton = new JButton("Show me how its done");
        showMeHowitsDoneButton.addActionListener(new ActionListener1());
        //load = new JButton("load");
       // load.addActionListener(new ActionListener1());


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
        panel.add(jLabelV1, "left, sg 1, split 3");
        panel.add(jTextFieldValue1, "pushx, growx");
        panel.add(blankR3,  "pushx, growx, wrap");

        //Row 4
        panel.add(jLabelV2, "left, sg 1, split 3");
        panel.add(jTextFieldValue2, "pushx, growx");
        panel.add(blankR4,  "pushx, growx, wrap");

        //row 5
        panel.add(jTextFieldValue1Entered, "left, sg 1, split 8");
        panel.add(blankR5A, "pushx, growx");
        panel.add(minus, "pushx, growx");
        panel.add(jTextFieldValue2Entered, "pushx, growx");
        panel.add(blankR5B, "pushx, growx");
        panel.add(equals);
        panel.add(blankR5C, "pushx, growx");
        panel.add(answerLabel, "pushx, growx, wrap");


        //Row 5
        panel.add(showMeHowitsDoneButton,"pushx, growx, wrap");


        //panel.add(row3Col2B, "wrap");

        frame.pack();
        frame.setVisible(true);

        frame.pack();
//5. Show it.
        frame.setVisible(true);
    }

    private class ActionListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //JTextField f1 = new JTextField("-5");
            String v1S = jTextFieldValue1Entered.getText();
            intValue1 = Integer.parseInt(v1S);

            
            String v2S = jTextFieldValue2Entered.getText();
             intValue2 = Integer.parseInt(v2S);
             intAnswer = intValue1 = intValue2;

            String strAnswer = Integer.toString(intAnswer );
            answerLabel.setText(strAnswer);
            frame.setVisible(true);
        }
    }
}



