package com;

/**
 * Created by user on 10/11/2015.
 */

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                //new MyGui().setVisible(true);
                new Feature2V2();
            }
        });
    }
}
