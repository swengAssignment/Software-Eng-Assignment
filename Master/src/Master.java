/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * TabbedPaneDemo.java requires one additional file:
 *   images/middle.gif.
 */

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

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
    JPanel panel;
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
        ImageIcon icon = createImageIcon("images/middle.gif");

        JComponent panel1 = makeTextPanel("Panel #1");
        tabbedPane.addTab("Tab 1", icon, panel1,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        /**********************************/

        JComponent panel2 = makeTextPanel("Panel #2");
        tabbedPane.addTab("Tab 2", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel3 = makeTextPanel("");
        tabbedPane.addTab("subtraction tab", icon, panel3,
                "");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel4 = makeTextPanel(
                "Panel #4 (has a preferred size of 410 x 50).");
        panel4.setPreferredSize(new Dimension(410, 50));
        tabbedPane.addTab("Tab 4", icon, panel4,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    public JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);

        header = new JLabel ("math check subtraction lets you visualize how it's done");
        //Row 2 has 1 element

        jLabelV1 = new JLabel ("              Enter Value 1:");
        jTextFieldValue1 = new JTextField( "5");
        //Row 4 has 3 element
        jLabelV2 = new JLabel ("              Enter Value 2:");
        jTextFieldValue2 = new JTextField("3");
        //Row5 has elements
        jTextFieldValue1Entered = new JTextField("0");
        jTextFieldValue2Entered = new JTextField("0");
        minus = new JLabel ("                    Minus       -    ");
        equals = new JLabel ("                   Equals      =    ");
        answerLabel = new JTextField("");
        frame = new JFrame("My Frame");
        blank = new JLabel("");
        /****************************/
        weHad = new JLabel("\t\t        We Had:");
        weHadResult = new JTextField("");

        weTook = new JLabel("\t\t        We Took:");
        weTookResult = new JTextField("");

        weHave = new JLabel("\t\t        We Have:");
        weHaveResult = new JTextField("");
        /*******************************/
        //    frame.setSize(700, 700);
        //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Subtraction tab"));
        //  frame.add(panel);

        //panel.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] [] [] [] [] []" ));
        panel.setLayout(new MigLayout("debug"));
        //panel2.setLayout(new MigLayout("debug", "[]10[] ", "[] [] [] [] [] [] [] []" ));
        //panel.setLayout(new MigLayout("", "", "" ));
        // panel.setLayout(new MigLayout("wrap 3"));



        //Row 5 has 1 element
        showMeHowitsDoneButton = new JButton("Show me how its done");
        //showMeHowitsDoneButton.addActionListener(new ActionListener1());
        //load = new JButton("load");
        // load.addActionListener(new ActionListener1());


        // JTextField firstName = new JTextField(20);
        // JTextField familyName = new JTextField(20);
        // JLabel details = new JLabel("Details: ");
        // JTextArea detailsArea = new JTextArea(30,30);
        // detailsArea.setBorder(BorderFactory.createEtchedBorder());

/**********************************************************************************/
        //row 1
        panel.add(header,"span, pushx, growx, pushy, growy, gapleft 20%, gapright 10%, wrap");

        /*************************************************/
        //row 2
        panel.add(jLabelV1, " gaptop 10%, pushy, growy");

        panel.add(jTextFieldValue1, "gaptop 10%, gapbottom 2%, pushx, growx, pushy, growy");
        panel.add(blank, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");

        panel.add(jTextFieldValue1Entered, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        panel.add(minus, "span 1 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");
        panel.add(jTextFieldValue2Entered, "span 2 2,pushx, growx, pushy, growy, gaptop 10%, gapbottom 10%");

        panel.add(equals, "span 2 2,pushx, growx,  pushy, growy, gaptop 10%, gapbottom 10%");
        panel.add(answerLabel, "span 2 2, pushx, growx, , pushy, growy, wrap, gaptop 10%, gapbottom 10%");

        panel.add(jLabelV2, "shrink 70,  gapbottom 10%, pushy, growy");
        panel.add(jTextFieldValue2, "gaptop 2%, gapbottom 10%, pushx, growx, wrap, pushy, growy");
        /***************************************************/

        //Row 3
        panel.add(showMeHowitsDoneButton,"gap 100, span, pushx, growx, pushy, growy, gapleft 10%, gapright 10%, gapbottom 10%, wrap");
        //panel.add(row3Col2B, "wrap");

        //row 4
        panel.add(weHad, "shrink 40, pushx, growx,  pushy, growy");
        panel.add(weHadResult,"pushx, growx,  pushy, growy, spanx, wrap");

        //row 5
        panel.add(weTook, "shrink 40, pushx, growx, pushy, growy");
        panel.add(weTookResult,"pushx, growx, spanx,  pushy, growy, wrap");

        //row 6
        panel.add(weHave, "shrink 40, pushx, growx,  pushy, growy");
        panel.add(weHaveResult,"pushx, growx, spanx,  pushy, growy, wrap");

        //frame.pack();
        //   frame.setVisible(true);

        // frame.pack();
//5. Show it.
        // frame.setVisible(true);

        /**********************************/
        // JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        // panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

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
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Master(), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}
