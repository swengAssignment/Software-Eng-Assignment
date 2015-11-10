//package mig;

import javax.swing.*;


import net.miginfocom.swing.MigLayout;


/**
 * Created by g00291875 on 09/11/2015.
 */
public class Feature2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("GUI #1"));
        frame.add(panel);

        panel.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] []" ));
        // panel.setLayout(new MigLayout("wrap 3"));

        JLabel firstnameLabel = new JLabel ("first name");
        JLabel lasttnameLabel = new JLabel ("last name");
        JTextField firstName = new JTextField(20);
        JTextField familyName = new JTextField(20);
        JLabel details = new JLabel("Details: ");
        JTextArea detailsArea = new JTextArea(30,30);
        detailsArea.setBorder(BorderFactory.createEtchedBorder());


        //sizegroup 1,  split twice
        panel.add(firstnameLabel, "left, sg 1, split 2");
        panel.add(firstName, "pushx, growx, wrap");

        panel.add(lasttnameLabel, "left, sg 1, split 2");
        panel.add(familyName, "pushx, growx, wrap");

        //     panel.add(details, "left, sg 1, split 2");
        //    panel.add(detailsArea, "pushx, growx, wrap");


        frame.pack();
        frame.setVisible(true);

        frame.pack();

//5. Show it.
        frame.setVisible(true);
    }
}

